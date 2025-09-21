const express = require('express');
const cors = require('cors');
const app = express();
const port = 3000;

app.use(cors());
app.use(express.json());

let tarefas = [];
let idAtual = 1;

// Listar tarefas
app.get('/tarefas', (req, res) => {
  res.json(tarefas);
});

// Adicionar tarefa
app.post('/tarefas', (req, res) => {
  const { descricao, status } = req.body;
  const novaTarefa = { id: idAtual++, descricao, status };
  tarefas.push(novaTarefa);
  res.status(201).json(novaTarefa);
});

// Editar tarefa
app.put('/tarefas/:id', (req, res) => {
  const { id } = req.params;
  const { descricao, status } = req.body;
  const tarefa = tarefas.find(t => t.id == id);
  if (tarefa) {
    tarefa.descricao = descricao;
    tarefa.status = status;
    res.json(tarefa);
  } else {
    res.status(404).json({ erro: 'Tarefa não encontrada' });
  }
});

// Deletar tarefa
app.delete('/tarefas/:id', (req, res) => {
  const { id } = req.params;
  tarefas = tarefas.filter(t => t.id != id);
  res.status(204).send();
});

app.listen(port, () => {
  console.log(`API rodando em http://localhost:${port}`);
});