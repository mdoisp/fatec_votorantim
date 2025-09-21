use('aula02')
db.receitas.insertOne({
    _id: "123",
    nome:"Hambúrguer de costela",
    preco: 15.99,
    ingredientes: ["pão", "costela", "queijo"],
    vegetariano: false,
    dataCadastro: new Date(),
    detalhe: {
        "calorias": 1500,
        "porcao": 1,
        "veggie": false
    }
})

use('aula02')
db.receitas.find() // select * from receitas

use('aula02')
db.receitas.find({},{}) // 1º filtros, 2º colunas

use('aula02')
db.receitas.find({},{nome:1, preco:1, _id:0})

use('aula02')
db.receitas.insertOne({
    nome:"Hambúrguer de cogumelo",
    preco: 45.99,
    ingredientes: ["pão", "cogumelo", "queijo"],
    vegetariano: true,
    dataCadastro: new Date(),
    detalhe: {
        "calorias": 700,
        "porcao": 1,
        "veggie": true
    }
})
use('aula02')
db.receitas.find({vegetariano:true},{_id:0, nome:1, preco:1})

use('aula02')
db.receitas.find({vegetariano: {$true}},{nome:1, preco:1})

use('aula02')
db.receitas.find({nome: 'costela'},{nome:1, preco:1})

use('aula02')
db.receitas.find({nome: {$ne: 'costela'}},{nome:1, preco:1})

use('aula02') // i = insensitive case
db.receitas.find({nome: /costela/i},{nome:1, preco:1})

use('aula02')
db.receitas.find({preco: {$gt: 20.00}},{nome:1, preco:1, "detalhe.calorias":1})

use('aula02')
db.receitas.find({preco: {$gte: 15.00, $lte: 30.00}},{nome:1, preco:1, "detalhe.calorias":1})

use('aula02')
db.receitas.find({$and:[
                        {preco: {$lt: 20}},
                        {nome: /hamb/i}
                        ]},
                {nome:1, preco:1})

use('aula02')
db.receitas.find({$or:[
                        {preco: {$lt: 20}},
                        {nome: /cogu/i}
                        ]},
                {nome:1, preco:1, _id:0})

use('aula02')
db.receitas.find({$nor:[
                        {preco: {$gte: 15}},
                        {preco: {$lte: 30}}
                        ]},
                {nome:1, preco:1})

use('aula02')
db.receitas.updateOne({_id: ObjectId('66ba93250dedbd35d6fe831d')},{$set: {preco: 40.99}})

use('aula02')
db.receitas.updateOne({preco: {$gte: 10}},{$set: {vegetariano: true}})

use('aula02')
db.receitas.find()

//remover atributo especificado
use('aula02')
db.receitas.updateMany(
    {},
    {$unset: {vegetariano: ''}}
)

use('aula02')
db.receitas.updateOne(
    {nome: /cogu/i},
    {$push: {ingredientes: 'alface'}}
)

use('aula02')
db.receitas.find({nome: /cogu/i},{nome:1, ingredientes:1})

use('aula02')
db.receitas.updateMany(
    {nome: /cogumelo/i},
    {$pull: {ingredientes: 'queijo'}}
)

use('aula02')
db.receitas.find({},{nome:1, "detalhe.calorias":1})

use('aula02')
db.receitas.updateMany({},
                        {$inc: {"detalhe.calorias": -100}}
)

use('aula02')
db.receitas.deleteOne(
            {_id: '123'}
)

use('aula02')
db.receitas.deleteMany(
    {preco: {$gt: 10}}
)