/*
import React from 'react';
import { View, Text, Button } from 'react-native';

export default function HomeScreen({ navigation }) {
  return (
    <View style={{ flex: 1, justifyContent: 'center', alignItems: 'center' }}>
      <Text>Bem-vindo à Tela Home</Text>
      <Button
        title="Ir para Detalhes"
        onPress={() => navigation.navigate('Details', { itemId: 42 })}
      />
    </View>
  );
}
*/

import React from 'react';
import { View, Button, StyleSheet } from 'react-native';

export default function HomeScreen({ navigation }) {
  return (
    <View style={styles.container}>
      <Button
        title="IR PARA CADASTRO"
        color="#6a0dad"
        onPress={() => navigation.navigate('Cadastro')}
      />
      <View style={{ height: 10 }} />
      <Button
        title="IR PARA CONSULTA"
        color="#00cfc1"
        onPress={() => navigation.navigate('Consulta')}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1, justifyContent: 'center', alignItems: 'center',
  },
});
