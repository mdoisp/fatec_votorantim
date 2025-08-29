# ViaCEP App - React Native

Uma aplicação React Native que consome a API do ViaCEP para auto-completar endereços automaticamente.

## 🚀 Funcionalidades

- **Campo CEP**: Digite o CEP e a aplicação busca automaticamente o endereço
- **Auto-completar**: Preenche automaticamente os campos:
  - Logradouro (Rua, Avenida, etc.)
  - Bairro
  - Cidade
  - Estado (UF)
- **Validação**: Verifica se o CEP é válido antes de fazer a requisição
- **Interface moderna**: Utiliza React Native Paper para uma UI elegante e responsiva
- **Feedback visual**: Indicadores de carregamento e mensagens de erro

## 🛠️ Tecnologias Utilizadas

- React Native
- React Native Paper (UI Components)
- Expo
- Fetch API para requisições HTTP
- ViaCEP Web Service


## 📱 Componentes Utilizados

### React Native Paper:
- `TextInput`: Campos de entrada com labels e placeholders
- `Button`: Botões com diferentes estilos (contained, outlined)
- `Card`: Container principal com elevação
- `Divider`: Separadores visuais
- `ActivityIndicator`: Indicador de carregamento
- `Snackbar`: Mensagens de erro/feedback

### React Native Nativo:
- `Text`: Textos estilizados (título, subtítulo, mensagens)
- `View`: Containers e layouts
- `ScrollView`: Rolagem do conteúdo
- `SafeAreaView`: Área segura para diferentes dispositivos

## 🚀 Como Executar

### Pré-requisitos

- Node.js (versão 14 ou superior)
- npm ou yarn
- Expo CLI (`npm install -g @expo/cli`)

### ✅ Verificação das Correções

Após executar a aplicação, verifique se:
- O título e subtítulo aparecem com tamanho e peso corretos
- O botão "Buscar CEP" não exibe ponto de interrogação
- Todos os textos têm a aparência visual adequada
- A funcionalidade de busca funciona perfeitamente

### Instalação

1. Clone o repositório
2. Navegue até a pasta do projeto:
   ```bash
   cd Atividade_1_Fetch
   ```

3. Instale as dependências:
   ```bash
   npm install
   ```

4. Execute a aplicação:
   ```bash
   npm start
   ```

5. Use o Expo Go no seu dispositivo móvel ou emulador para testar

## 🔧 Como Funciona

1. **Digite o CEP**: O usuário digita o CEP no campo correspondente
2. **Validação**: A aplicação valida se o CEP tem pelo menos 8 dígitos
3. **Requisição HTTP**: Usa o método `fetch()` para consultar a API do ViaCEP
4. **Processamento**: Recebe os dados JSON e extrai as informações do endereço
5. **Auto-completar**: Preenche automaticamente todos os campos de endereço
6. **Feedback**: Mostra indicadores de carregamento e mensagens de erro quando necessário

## 📡 API Utilizada

- **Endpoint**: `https://viacep.com.br/ws/{cep}/json/`
- **Método**: GET
- **Formato de resposta**: JSON
- **Campos retornados**: logradouro, bairro, localidade, uf

## 🎨 Características da Interface

- **Design Material**: Segue os princípios do Material Design
- **Responsivo**: Adapta-se a diferentes tamanhos de tela
- **Acessível**: Labels claros e feedback visual
- **Tema personalizado**: Cores e estilos customizados
- **Animações**: Transições suaves e indicadores de estado

## 📱 Compatibilidade

- ✅ Android (sujeito a erros, teste o web se não rodar)
- ✅ Web (via Expo Web)

## 🔍 Estrutura do Projeto

```
Atividade_1_Fetch/
├── src/
│   ├── components/
│   │   └── CepForm.js          # Componente principal
│   └── theme.js                # Configuração de tema
├── App.js                      # Arquivo principal
├── package.json                # Dependências
├── README.md                   # Este arquivo
└── EXEMPLOS.md                 # CEPs para teste
```

## 🚨 Tratamento de Erros

- CEP inválido ou não encontrado
- Problemas de conexão com a internet
- Validação de entrada do usuário
- Feedback visual através de Snackbars

## 🔄 Estados da Aplicação

- **Idle**: Aguardando entrada do usuário
- **Loading**: Consultando a API do ViaCEP
- **Success**: Endereço encontrado e campos preenchidos
- **Error**: Erro na consulta ou CEP não encontrado

## 📚 Documentação Adicional

- **CORREÇÕES.md**: Detalhes técnicos das correções implementadas
- **EXEMPLOS.md**: CEPs válidos para testar a aplicação

## 📝 Licença

Este projeto está sob a licença MIT.
