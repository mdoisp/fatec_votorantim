import React, { useState, useEffect } from 'react';
import { View, ScrollView, StyleSheet, Alert } from 'react-native';
import {
  TextInput,
  Button,
  Card,
  Divider,
  ActivityIndicator,
  Snackbar,
} from 'react-native-paper';
import { Text } from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';

const CepForm = () => {
  const [cep, setCep] = useState('');
  const [logradouro, setLogradouro] = useState('');
  const [bairro, setBairro] = useState('');
  const [localidade, setLocalidade] = useState('');
  const [uf, setUf] = useState('');
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState('');
  const [showSnackbar, setShowSnackbar] = useState(false);
  const [isReady, setIsReady] = useState(false);

  // Verifica se a aplicação está pronta
  useEffect(() => {
    const timer = setTimeout(() => {
      setIsReady(true);
    }, 100);
    
    return () => clearTimeout(timer);
  }, []);

  const buscarCep = async () => {
    if (!cep || cep.length < 8) {
      setError('CEP deve ter pelo menos 8 dígitos');
      setShowSnackbar(true);
      return;
    }

    setLoading(true);
    setError('');

    try {
      const cepLimpo = cep.replace(/\D/g, '');
      
      // Adiciona timeout para evitar carregamento infinito
      const controller = new AbortController();
      const timeoutId = setTimeout(() => controller.abort(), 10000); // 10 segundos

      const response = await fetch(`https://viacep.com.br/ws/${cepLimpo}/json/`, {
        signal: controller.signal,
        method: 'GET',
        headers: {
          'Accept': 'application/json',
        },
      });

      clearTimeout(timeoutId);

      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }

      const data = await response.json();

      if (data.erro) {
        setError('CEP não encontrado');
        setShowSnackbar(true);
        limparCampos();
        return;
      }

      // Preenche os campos com os dados retornados
      setLogradouro(data.logradouro || '');
      setBairro(data.bairro || '');
      setLocalidade(data.localidade || '');
      setUf(data.uf || '');

    } catch (error) {
      if (error.name === 'AbortError') {
        setError('Tempo limite excedido. Tente novamente.');
      } else {
        setError('Erro ao buscar CEP. Verifique sua conexão.');
      }
      setShowSnackbar(true);
      limparCampos();
    } finally {
      setLoading(false);
    }
  };

  const limparCampos = () => {
    setCep('');
    setLogradouro('');
    setBairro('');
    setLocalidade('');
    setUf('');
  };

  const limparFormulario = () => {
    limparCampos();
    setError('');
  };

  const formatarCep = (text) => {
    const cepLimpo = text.replace(/\D/g, '');
    if (cepLimpo.length <= 5) {
      return cepLimpo;
    }
    return `${cepLimpo.slice(0, 5)}-${cepLimpo.slice(5, 8)}`;
  };

  // Se a aplicação não estiver pronta, mostra loading
  if (!isReady) {
    return (
      <SafeAreaView style={styles.container}>
        <View style={styles.loadingContainer}>
          <ActivityIndicator size="large" color="#1976D2" />
          <Text style={styles.loadingText}>Carregando aplicação...</Text>
        </View>
      </SafeAreaView>
    );
  }

  return (
    <SafeAreaView style={styles.container}>
      <ScrollView contentContainerStyle={styles.scrollContainer}>
        <Card style={styles.card}>
          <Card.Content>
            <Text style={styles.title}>Consulta de CEP</Text>
            <Text style={styles.subtitle}>
              Digite o CEP para auto-completar o endereço
            </Text>
            
            <Divider style={styles.divider} />

            {/* Botão de teste de conectividade */}
            <Button
              mode="outlined"
              onPress={() => {
                Alert.alert(
                  'Teste de Conectividade',
                  'Testando conexão com a internet...',
                  [{ text: 'OK' }]
                );
              }}
              style={[styles.button, { marginBottom: 8 }]}
            >
              Testar Conectividade
            </Button>

            {/* Campo CEP */}
            <TextInput
              label="CEP"
              value={cep}
              onChangeText={(text) => setCep(formatarCep(text))}
              mode="outlined"
              style={styles.input}
              keyboardType="numeric"
              maxLength={9}
              placeholder="00000-000"
              right={
                <TextInput.Icon
                  icon="magnify"
                  onPress={buscarCep}
                  disabled={loading}
                />
              }
            />

            {/* Botão Buscar */}
            <Button
              mode="contained"
              onPress={buscarCep}
              style={styles.button}
              loading={loading}
              disabled={loading || !cep}
            >
              {loading ? 'Buscando...' : 'Buscar CEP'}
            </Button>

            {loading && (
              <View style={styles.loadingContainer}>
                <ActivityIndicator size="large" color="#1976D2" />
                <Text style={styles.loadingText}>
                  Consultando ViaCEP...
                </Text>
              </View>
            )}

            <Divider style={styles.divider} />

            {/* Campos de Endereço */}
            <TextInput
              label="Logradouro"
              value={logradouro}
              onChangeText={setLogradouro}
              mode="outlined"
              style={styles.input}
              placeholder="Rua, Avenida, etc."
              disabled={loading}
            />

            <TextInput
              label="Bairro"
              value={bairro}
              onChangeText={setBairro}
              mode="outlined"
              style={styles.input}
              placeholder="Nome do bairro"
              disabled={loading}
            />

            <TextInput
              label="Cidade"
              value={localidade}
              onChangeText={setLocalidade}
              mode="outlined"
              style={styles.input}
              placeholder="Nome da cidade"
              disabled={loading}
            />

            <TextInput
              label="Estado (UF)"
              value={uf}
              onChangeText={setUf}
              mode="outlined"
              style={styles.input}
              placeholder="SP, RJ, etc."
              maxLength={2}
              disabled={loading}
            />

            {/* Botões de Ação */}
            <View style={styles.buttonContainer}>
              <Button
                mode="outlined"
                onPress={limparFormulario}
                style={[styles.button, styles.clearButton]}
                icon="eraser"
              >
                Limpar
              </Button>
            </View>
          </Card.Content>
        </Card>
      </ScrollView>

      {/* Snackbar para mensagens de erro */}
      <Snackbar
        visible={showSnackbar}
        onDismiss={() => setShowSnackbar(false)}
        duration={4000}
        action={{
          label: 'OK',
          onPress: () => setShowSnackbar(false),
        }}
        style={styles.snackbar}
      >
        {error}
      </Snackbar>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F5F5F5',
  },
  scrollContainer: {
    flexGrow: 1,
    padding: 16,
  },
  card: {
    elevation: 4,
    marginBottom: 16,
  },
  title: {
    textAlign: 'center',
    marginBottom: 8,
    color: '#1976D2',
    fontSize: 24,
    fontWeight: 'bold',
  },
  subtitle: {
    textAlign: 'center',
    marginBottom: 16,
    color: '#666',
    fontSize: 16,
  },
  divider: {
    marginVertical: 16,
  },
  input: {
    marginBottom: 16,
  },
  button: {
    marginBottom: 16,
    paddingVertical: 8,
  },
  clearButton: {
    borderColor: '#666',
  },
  buttonContainer: {
    marginTop: 8,
  },
  loadingContainer: {
    alignItems: 'center',
    marginVertical: 16,
  },
  loadingText: {
    marginTop: 8,
    color: '#666',
    fontSize: 14,
  },
  snackbar: {
    backgroundColor: '#D32F2F',
  },
});

export default CepForm;
