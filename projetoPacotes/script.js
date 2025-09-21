let valorPacote = 0;
let valorAdicionais = 0;
let valorTotal = 0;
function calcularTotaldaViagem()
{
    calcularPacote();
    calcularAdicionais();
    valorTotal = Number(valorPacote) + Number(valorAdicionais);
    console.log(valorTotal);
    textoParaCliente();
}
function calcularAdicionais()
{
    valorAdicionais=0;
    let alimentacao = document.querySelector('input[name="alimentacao"]');
    let veiculo = document.querySelector('input[name="veiculo"]');
    let translado = document.querySelector('input[name="translado"]');
    if (alimentacao.checked)
    valorAdicionais += Number(alimentacao.value);
    if (veiculo.checked)
    valorAdicionais += Number(veiculo.value);
    if (translado.checked)
    valorAdicionais += Number(translado.value);
    console.log(valorAdicionais.toFixed(2));
/*    let qtdAdicionais = document.querySelectorAll('input[name="adicionais"]').length
    let adicionais = document.querySelectorAll('input[name="adicionais"]');
    for (var i = 0; i < qtdAdicionais; i++)
    {
        // console.log(Number(adicionais[i].value));
        if (adicionais[i].checked)
        valorAdicionais += Number(adicionais[i].value);
    }
console.log(valorAdicionais.toFixed(2));*/
}

function calcularPacote()
{
    let qtdPacotes = document.querySelectorAll('input[name="pacotes"]').length;
    console.log(qtdPacotes);
    let pacotes = document.querySelectorAll('input[name="pacotes"]');
    console.log(pacotes);

//                i < pacotes.lenght
    for (var i=0; i < qtdPacotes; i++)
    {
        if (pacotes[i].checked)
        {
            console.log(pacotes[i].value);
            valorPacote = pacotes[i].value;
            break
        }
    }
}
function textoParaCliente()
{
    let nomeCliente = document.querySelector('input[name="nomeCliente"]').value;
    document.getElementById('texto').innerText ="O " + nomeCliente + " irá pagar R$ " + valorPacote + " pelo pacote e R$ " + valorAdicionais + " pelo adicional"
}