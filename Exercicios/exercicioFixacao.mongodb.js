const collection = 'funcionarios';
use('exercicioFixacao')
db.createCollection(collection)
//1
use('exercicioFixacao')
db.funcionarios.insertMany([
                            {
                                nome: "João Silva",
                                cargo: "Desenvolvedor",
                                sexo: "Masculino",
                                salario: 5000,
                                departamento: "TI",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: ["Projeto A", "Projeto B"],
                                dataCadastro: new Date()
                            },
                            {
                                nome: "Matheus Lima",
                                cargo: "Gerente de projetos",
                                sexo: "Masculino",
                                salario: 8000,
                                departamento: "TI",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: ["Projeto A", "Projeto B"],
                                dataCadastro: new Date()
                            },
                            {
                                nome: "Lucas Soares",
                                cargo: "Desenvolvedor",
                                sexo: "Masculino",
                                salario: 5000,
                                departamento: "TI",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: ["Projeto A"],
                                dataCadastro: new Date()
                            },
                            {
                                nome: "Maria Silva",
                                cargo: "Diretora",
                                sexo: "Feminino",
                                salario: 20000,
                                departamento: "Geral",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: [],
                                dataCadastro: new Date()
                            },
                            {
                                nome: "Ana Paes",
                                cargo: "Recrutadora",
                                sexo: "Feminino",
                                salario: 3000,
                                departamento: "RH",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: [],
                                dataCadastro: new Date()
                            },
                            {
                                nome: "Darcival Pereira",
                                cargo: "Desenvolvedor Júnior",
                                sexo: "Masculino",
                                salario: 3500,
                                departamento: "TI",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: ["Projeto B"],
                                dataCadastro: new Date()
                            }
])
//2
use('exercicioFixacao')
db.funcionarios.insertOne(
                            {
                                nome: "Joana Perez",
                                cargo: "Analista de dados",
                                sexo: "Feminino",
                                salario: 5500,
                                departamento: "TI",
                                dataContratacao: new Date("2023-01-01"),
                                projetos: ["Projeto A", "Projeto B"],
                                dataCadastro: new Date()
                            }
)
//3
use('exercicioFixacao')
db.funcionarios.updateMany({cargo: /desenvolvedor/i},
                           {$inc: {"salario": 100}})
//4
use('exercicioFixacao')
db.funcionarios.updateOne({nome: "João Silva"},
                          {$push: {projetos: "Projeto C"}})
//5
use('exercicioFixacao')
db.funcionarios.updateMany({},{$set: {dataContratacao: new Date("2023-01-01")}})
//6
use('exercicioFixacao')
db.funcionarios.updateMany({departamento: "TI"},{$set: {bonificacao: 500}})
//7
use('exercicioFixacao')
db.funcionarios.deleteOne({nome: "João Silva"},{})
//8
use('exercicioFixacao')
db.funcionarios.deleteMany({departamento: "Contabilidade"},{})
//9
use('exercicioFixacao')
db.funcionarios.find({cargo: /desenvolvedor/i},{nome:1, sexo:1, salario:1, _id:0})
//10
use('exercicioFixacao')
db.funcionarios.find({salario: {$gt: 4000}},{})
//11
const dataComeco = new Date("2022-12-31")
const dataFinal = new Date("2024-01-01")
use('exercicioFixacao')
db.funcionarios.find({dataContratacao: {$gt: dataComeco, $lt: dataFinal}},{})
//12
use('exercicioFixacao')
db.funcionarios.find({projetos: {$in: ["Projeto A", "Projeto B"]}},{nome:1, projetos:1, _id:0})
//13
use('exercicioFixacao')
db.funcionarios.find({projetos: {$nin: ["Projeto B"]}})
//14
use('exercicioFixacao')
db.funcionarios.find({sexo: "Feminino"},{nome:1, salario:1, departamento:1, sexo:1})
//15
use('exercicioFixacao')
db.funcionarios.find({dataContratacao: {$lte: new Date("2022-12-31")}, salario: {$lt: 5000}})
//16
use('exercicioFixacao')
db.funcionarios.find({projetos: {$size: {$gt: 1}}})
//17
use('exercicioFixacao')
db.funcionarios.find({dataCadastro: {$gte: new Date(new Date().getTime()-30*24*60*60*1000)}})
//18
use('exercicioFixacao')
db.funcionarios.find({nome: /^João/})
//19
use('exercicioFixacao')
db.funcionarios.find({nome: /Silva$/})
//20
use('exercicioFixacao')
db.funcionarios.find({nome: /Lui[sz]/})
//21
use('exercicioFixacao')
db.funcionarios.find({departamento: "TI", salario: {$gt: 4500}})
//22
use('exercicioFixacao')


use('exercicioFixacao')
db.funcionarios.find()
