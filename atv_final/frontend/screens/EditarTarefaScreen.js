import React, { useState, useEffect } from 'react';
import { View, Text, TextInput, Button, StyleSheet, Alert } from 'react-native';
import api from '../api';

export default function EditarTarefaScreen({ route, navigation }) {
  const { tarefa } = route.params;

  const [descricao, setDescricao] = useState('');
  const [status, setStatus] = useState('');

  useEffect(() => {
    if (tarefa) {
      setDescricao(tarefa.descricao);
      setStatus(tarefa.status);
    }
  }, [tarefa]);

  const salvarEdicao = async () => {
    if (!descricao.trim()) {
      Alert.alert('Atenção', 'Digite uma descrição para a tarefa!');
      return;
    }
    if (status !== 'pendente' && status !== 'finalizada') {
      Alert.alert('Atenção', 'O status deve ser "pendente" ou "finalizada"!');
      return;
    }
    try {
      await api.put(`/tarefas/${tarefa.id}`, { descricao, status });
      navigation.goBack();
    } catch (error) {
      Alert.alert('Erro', 'Não foi possível editar a tarefa.');
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.label}>Descrição:</Text>
      <TextInput
        style={styles.input}
        value={descricao}
        onChangeText={setDescricao}
        placeholder="Digite a descrição"
      />

      <Text style={styles.label}>Status:</Text>
      <TextInput
        style={styles.input}
        value={status}
        onChangeText={setStatus}
        placeholder="pendente ou finalizada"
      />

      <Button title="Salvar Alterações" onPress={salvarEdicao} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 16 },
  label: { fontSize: 16, marginTop: 16 },
  input: { borderWidth: 1, borderColor: '#ccc', borderRadius: 5, padding: 8, marginTop: 8 },
});