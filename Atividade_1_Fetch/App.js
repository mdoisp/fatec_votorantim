import React from 'react';
import { StatusBar } from 'expo-status-bar';
import { Provider as PaperProvider } from 'react-native-paper';
import { SafeAreaProvider } from 'react-native-safe-area-context';
import { theme } from './src/theme';
import CepForm from './src/components/CepForm';

export default function App() {
  return (
    <SafeAreaProvider>
      <PaperProvider theme={theme}>
        <CepForm />
        <StatusBar style="auto" />
      </PaperProvider>
    </SafeAreaProvider>
  );
}
