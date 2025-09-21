use('aula01')

db.filmes.insertOne({
                    "título": "Guerra nas estrelas",
                    "DIRETOR": "George Lucas",
                    "ano": "1978",
                    "Nota": "⭐⭐⭐⭐⭐"
                    })

db.filmes.find()

use('aula01')

db.filmes.insertMany([
                    {"título": "Guerra nas estrelas 1",
                    "DIRETOR": "George Lucas",
                    "ano": "1978",
                    "Nota": "⭐⭐⭐⭐⭐"},
                    {"título": "Guerra nas estrelas 2",
                    "DIRETOR": "George Lucas",
                    "ano": "1981",
                    "Nota": "⭐⭐⭐⭐"},
                    {"título": "Guerra nas estrelas 3",
                    "DIRETOR": "George Lucas",
                    "ano": "1985",
                    "Nota": "⭐⭐⭐⭐"}
                    ])
                    
db.filmes.find()