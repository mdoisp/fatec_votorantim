valorAdicionais = 0;
valorEntrega = 0;
valorCombo = 0;
function calcularTotalPedido()
{
    calcularCombos();
    calcularAdicionais();
    paraViagem();
    valorTotal = valorCombo + valorAdicionais + valorEntrega;
    console.log(valorTotal.toFixed(2));
    document.getElementById('totalPagar').value = `${valorTotal}`
    let nomeCliente = document.getElementById('nome').value;
    document.getElementById('descricao').innerText = `O ${nomeCliente} irá pagar R$${valorCombo} pelo combo, R$${valorAdicionais} pelos adicionais e R$${valorEntrega} pela entrega!`
}
function calcularCombos()
{
    valorCombo = 0;
    let combo =  Number(document.querySelector('select[name="Combos"]').value);
    valorCombo = combo
    console.log(valorCombo.toFixed(2));
}
function calcularAdicionais()
{
    valorAdicionais = 0;
    let bacon = document.querySelector('input[name="bacon"]');
    let picles = document.querySelector('input[name="picles"]');
    let cheddar = document.querySelector('input[name="cheddar"]');
    if (bacon.checked)
    valorAdicionais += Number(bacon.value);
    if (picles.checked)
    valorAdicionais += Number(picles.value);
    if (cheddar.checked)
    valorAdicionais += Number(cheddar.value)
    console.log(valorAdicionais.toFixed(2));
}
function paraViagem()
{
    valorEntrega = 0;
    let viagem = document.getElementById('viagem');
    let balcao = document.getElementById('balcao');
    if (viagem.checked)
    valorEntrega += Number(viagem.value);
    if (balcao.checked)
    valorEntrega += Number(balcao.value);
    console.log(valorEntrega.toFixed(2));
}