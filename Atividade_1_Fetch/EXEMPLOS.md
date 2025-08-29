# Exemplos de CEPs para Teste

Aqui estão alguns CEPs válidos que você pode usar para testar a aplicação:

## 🏙️ São Paulo - SP
- **01310-100**: Avenida Paulista, Bela Vista, São Paulo - SP
- **01234-567**: Rua das Flores, Vila Madalena, São Paulo - SP
- **04567-890**: Avenida Brigadeiro Faria Lima, Itaim Bibi, São Paulo - SP

## 🏖️ Rio de Janeiro - RJ
- **20040-007**: Avenida Rio Branco, Centro, Rio de Janeiro - RJ
- **22070-011**: Rua Copacabana, Copacabana, Rio de Janeiro - RJ
- **22451-000**: Avenida Ataulfo de Paiva, Leblon, Rio de Janeiro - RJ

## 🌆 Belo Horizonte - MG
- **30112-000**: Avenida Afonso Pena, Centro, Belo Horizonte - MG
- **30380-000**: Rua da Bahia, Centro, Belo Horizonte - MG

## 🏙️ Brasília - DF
- **70200-001**: Avenida W3, Asa Sul, Brasília - DF

## 🏖️ Salvador - BA
- **40026-010**: Avenida Sete de Setembro, Centro, Salvador - BA
- **40170-000**: Avenida Oceânica, Barra, Salvador - BA

## 🎯 Como Testar

1. **Digite um CEP** no campo correspondente
2. **Clique no botão "Buscar CEP"** ou no ícone de lupa
3. **Aguarde** o carregamento da consulta
4. **Verifique** se os campos foram preenchidos automaticamente:
   - Logradouro
   - Bairro
   - Cidade
   - Estado (UF)

## ⚠️ CEPs Inválidos para Teste

- **00000-000**: CEP inexistente
- **99999-999**: CEP fora do padrão brasileiro
- **12345**: CEP incompleto

## 🔍 Validações Implementadas

- ✅ CEP deve ter pelo menos 8 dígitos
- ✅ Formatação automática (00000-000)
- ✅ Tratamento de CEPs não encontrados
- ✅ Tratamento de erros de conexão
- ✅ Feedback visual durante o carregamento

## 📱 Teste em Diferentes Dispositivos

- **Android**: Use o Expo Go ou emulador Android
- **iOS**: Use o Expo Go ou simulador iOS
- **Web**: Acesse via Expo Web no navegador
