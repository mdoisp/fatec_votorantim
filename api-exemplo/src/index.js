const express = require('express');
const app = express();

const port = process.env.PORT || 3000;

/*
  Correções de bugs existentes no código
  EXEMPLO
  Alterando a porta pois de acesso pois a mesma estava dando erros de compilação...
*/

app.use(express.json());

app.get('/api', (req, res) => {
  res.send('Hello world!');
});

app.get('/api/test', (req, res) => {
  res.send({ message: 'Endpoint de teste na branch master com merge'});
});

app.get('/api/test-2', (req, res) => {
  res.send({ message: 'Branch master endpoint teste 2'});
});

/*
app.listen(port, () => {
  console.log(`Listening http://localhost:${port}`);
});
*/

module.exports = app;
