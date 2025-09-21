import express from 'express';
import cors from 'cors';
import contasRoutes from './routes/contas.js'

const app = express();
const port = 3001;

app.use(cors())
app.use(express.json()); //define que usaremos json

app.use('/contas', contasRoutes)

app.listen(port, ()=>{
    console.log(`Servidor rodando na porta ${port}`)
    console.log(`Servidor rodando em http://localhost:3001/contas`)
})
