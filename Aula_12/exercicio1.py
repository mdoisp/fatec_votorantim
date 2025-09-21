d = {}
for i in range(5):
    sobrenome = input(f'Digite o {i+1}º nome: ')
    idade = int(input(f'Digite a {i+1}ª idade: '))
    d[sobrenome] = idade

maior_sobrenome = ""
maior_idade = 0
for chave, valor in d.items():
    if valor > maior_idade:
        maior_idade = valor
        maior_sobrenome = chave

print(f'O sobrenome mais velho é {maior_sobrenome}')
