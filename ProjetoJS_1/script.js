function calcularNovoSalario()
{
    novoSalario = 0;
    let salario = Number(document.getElementById('salario').value);
    let percent = Number(document.getElementById('percent').value);
    novoSalario = salario * (percent/100) + salario;
    console.log(novoSalario);
    document.getElementById('resultadoSalario').innerText = `O novo salário será R$${novoSalario}`;
}
function calcularArea()
{
    let base = Number(document.getElementById('base').value);
    let altura = Number(document.getElementById('altura').value);
    area = (base * altura) / 2;
    console.log(area);
    document.getElementById('resultadoArea').innerText = `A área será: ${area}`;
}
function mediaPonderada()
{
    media = 0;
    let nota1 = Number(document.getElementById('nota1').value);
    let nota2 = Number(document.getElementById('nota2').value);
    media = (nota1 * 0.3) + (nota2 * 0.7);
    console.log(media);
    document.getElementById('resultadoMedia').innerText = `A média ponderada será: ${media}`;
}
function calculoIdade()
{
    let anoNascimento = Number(document.getElementById('anoNascimento').value);
    let dataAtual = new Date();
    let anoAtual = dataAtual.getFullYear();
    let anos = anoAtual - anoNascimento
    let dataNascimento = new Date(anoNascimento, 0, 1);
    let diferencaMilissegundos = dataAtual - dataNascimento;
    let idade2050 = 2050 - anoNascimento;
    dias = Math.floor(diferencaMilissegundos / (1000 * 60 * 60 * 24));
    meses = Math.floor(dias / 31);
    horas = Math.floor(diferencaMilissegundos / (1000 * 60 * 60));
    minutos = Math.floor(diferencaMilissegundos / (1000 * 60));
    semanas = dias / 7;
    console.log(`A pessoa tem ${anos} ano(s), ${meses} mese(s), ${dias} dia(s), ${horas} horas, ${minutos} minutos e ${semanas.toFixed(0)} semanas aproximadamente, contando a partir de 1 de janeiro e em 2050 terá ${idade2050} anos!`)
}
function consumoMedio()
{
    let km = Number(document.getElementById('km').value);
    let litros = Number(document.getElementById('litros').value);
    consumo = km / litros
    document.getElementById('resultadoConsumo').innerText = `O consumo médio é de ${consumo} km/litro`
}
function calculoSalario()
{
    let valorNormal = Number(document.getElementById('valorHr').value);
    let refeicoesFeitas = Number(document.getElementById('refeicoes').value);
    let valorAcrescido = (valorNormal * 40) + (valorNormal * 24 * 3);
    let desconto = 1.50 * refeicoesFeitas;
    salarioBruto = valorAcrescido;
    salarioLiquido = salarioBruto - desconto;
    document.getElementById('resultadoEx6').innerText = `Um funcionário que trabalhou 62 horas irá receber: 
    Salário Bruto = R$${salarioBruto.toFixed(2)}
    Descontos = R$${desconto.toFixed(2)}
    Salário Líquido = R$${salarioLiquido.toFixed(2)}`
}
function gerarRandom()
{
    let aleatorio = Math.floor(Math.random() * 10000);
    resultado = (aleatorio % 2 === 0) ? "Par" : "Ímpar"; 
    document.getElementById('resultadoEx7').innerText = `${aleatorio} é ${resultado}!`
}