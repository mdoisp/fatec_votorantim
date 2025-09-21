use('FatecBank')
const contas = [{
    "numero": "12345",
    "nome": "João Silva",
    "cpf": "123.456.789-11",
    "saldoInicial": 1394.00,
    "movimentacoes": [
        {
            "tipo": "credito",
            "valor": 500.00,
            "descricao": "Depósito em dinehiro",
            "data": ISODate('2024-10-21T10:00:00Z')
        },
        {
            "tipo": "debito",
            "valor": 313.53,
            "descricao": "Pagamento energia CPFL",
            "data": ISODate('2024-10-21T10:00:00Z')
        }
    ]
},
{
    "numero": "12345",
    "nome": "Henrique Santos",
    "cpf": "189.475.789-03",
    "saldoInicial": 11394.00,
    "movimentacoes": [
        {
            "tipo": "credito",
            "valor": 11100.00,
            "descricao": "Depósito em dinehiro",
            "data": ISODate('2024-10-21T10:00:00Z')
        },
        {
            "tipo": "debito",
            "valor": 2354.53,
            "descricao": "Aluguel",
            "data": ISODate('2024-10-21T10:00:00Z')
        }
    ]
}
]

db.contas.insertMany(contas)
