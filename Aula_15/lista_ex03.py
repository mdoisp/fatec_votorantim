def calcula_imposto(custo, imposto):
    return custo + (custo * (imposto/100))


valor = float(input(f'Insira o valor do produto: '))
taxa = float(input(f'Insira o valor da taxa de imposto em porcentagem: '))
print(f'O novo valor após o imposto é: {calcula_imposto(valor, taxa):5.2f}')
