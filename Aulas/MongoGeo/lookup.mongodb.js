use('geo')
//Agregação total dos documentos
db.municipios.aggregate([
    {
        $lookup: {
          from: 'estados',
          localField: 'codigo_uf',
          foreignField: 'codigo_uf',
          as: 'estado'
        }
    }
])

use('geo')
//Agregação total dos documentos excluindo algumas colunas
db.municipios.aggregate([
    {
        $lookup: {
          from: 'estados',
          localField: 'codigo_uf',
          foreignField: 'codigo_uf',
          as: 'estado'
        }
    },
    {
      $match: {
        nome: {$eq: "Votorantim"}
      }
    },
    {
      $project: {
        "_id":0,
        "nome":1,
        "local.coordinates": 1,
        "estado.nome":1
      }
    }
])

use('geo')
//Agregação total dos documentos excluindo algumas colunas
db.estados.aggregate([
    {
        $lookup: {
          from: 'municipios',
          localField: 'codigo_uf',
          foreignField: 'codigo_uf',
          as: 'ralacaoMunicipios'
        }
    },
    {
      $match: {
        nome: {$eq: "Acre"}
      }
    },
    {
      $project: {
        _id: 0,
        nome: 1,
        "relacaoMunicipios.nome": 1
      }
    }
])