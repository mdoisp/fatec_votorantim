import logo from '../../assets/logo.png'

const cesta =  {
    topo: {
        titulo: 'Detalhe da cesta',
    },
    detalhes: {
        nome: 'cesta de verduras',
        logoFazenda: logo,
        nomeFazenda: 'Jenny Jack Farm',
        descricao: 'Uma cesta com produtos excelentes',
        preco: 'R$ 40,00',
        botao: 'Comprar',
    },
    itens: {
        titulo: 'Itens da cesta',
        lista: [
            {
                nome: 'Tomate',
                imagem: ''
            },
            {
                nome: 'Brócolis',
                imagem: '',
            },
            {
                nome: 'Batata',
                imagem: '',
            },
            {
                nome: 'Pepino',
                imagem: '',
            },
            {
                nome: 'Abóbora',
                imagem: '',
            }
        ]
    }
}

export default cesta;
