import React, { useEffect, useState } from 'react';
import { View, Text, FlatList, Button, TouchableOpacity, StyleSheet, RefreshControl } from 'react-native';
import api from '../api';

export default function HomeScreen({ navigation }) {
  const [tarefas, setTarefas] = useState([]);
  const [refreshing, setRefreshing] = useState(false);
  const [filtro, setFiltro] = useState('todas');

  const carregarTarefas = async () => {
    setRefreshing(true);
    try {
      const response = await api.get('/tarefas');
      setTarefas(response.data);
    } catch (error) {
      alert('Erro ao carregar tarefas');
    }
    setRefreshing(false);
  };

  useEffect(() => {
    const unsubscribe = navigation.addListener('focus', carregarTarefas);
    return unsubscribe;
  }, [navigation]);

  const deletarTarefa = async (id) => {
    await api.delete(`/tarefas/${id}`);
    carregarTarefas();
  };

  const tarefasFiltradas = tarefas.filter(tarefa => {
    if (filtro === 'todas') return true;
    return tarefa.status === filtro;
  });

  return (
    <View style={styles.container}>
      <Button
        title="Nova Tarefa"
        onPress={() => navigation.navigate('NovaTarefa')}
      />

      <View style={{ height: 20 }} />

      <View style={{ flexDirection: 'row', justifyContent: 'center', marginBottom: 10 }}>
        <View style={{ marginHorizontal: 5 }}>
          <Button
            title="Todas"
            onPress={() => setFiltro('todas')}
            color={filtro === 'todas' ? '#007bff' : '#aaa'}
          />
        </View>
        <View style={{ marginHorizontal: 5 }}>
          <Button
            title="Pendentes"
            onPress={() => setFiltro('pendente')}
            color={filtro === 'pendente' ? '#007bff' : '#aaa'}
          />
        </View>
        <View style={{ marginHorizontal: 5 }}>
          <Button
            title="Finalizadas"
            onPress={() => setFiltro('finalizada')}
            color={filtro === 'finalizada' ? '#007bff' : '#aaa'}
          />
        </View>
      </View>
      <FlatList
        data={tarefasFiltradas}
        keyExtractor={item => item.id.toString()}
        refreshControl={
          <RefreshControl refreshing={refreshing} onRefresh={carregarTarefas} />
        }
        renderItem={({ item }) => (
            <View
              style={[
                styles.tarefa,
                item.status === 'pendente'
                  ? styles.pendente
                  : styles.finalizada
              ]}
            >
              <Text style={styles.descricao}>{item.descricao} ({item.status})</Text>
              <View style={styles.botoes}>
                <TouchableOpacity onPress={() => navigation.navigate('EditarTarefa', { tarefa: item })} style={styles.botaoEditar}>
                  <Text>Editar</Text>
                </TouchableOpacity>
                <TouchableOpacity onPress={() => deletarTarefa(item.id)} style={styles.botaoExcluir}>
                  <Text>Excluir</Text>
                </TouchableOpacity>
              </View>
            </View>
        )}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 16 },
  tarefa: { flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center', marginVertical: 8, padding: 8, backgroundColor: '#eee', borderRadius: 5 },
  descricao: { fontSize: 16 },
  botoes: { flexDirection: 'row' },
  botaoEditar: { marginRight: 10, backgroundColor: '#ffd700', padding: 5, borderRadius: 3 },
  botaoExcluir: { backgroundColor: '#ff6347', padding: 5, borderRadius: 3 },
  pendente: {
    backgroundColor: '#ADD8E6', // azul claro
  },
  finalizada: {
    backgroundColor: '#90EE90', // verde claro
  },
});