idade_por_sobrenome = {}
for i in range(5):
    sobrenome = input(f'Digite o {i+1}º nome: ')
    idade = int(input(f'Digite a {i+1}ª idade: '))
    idade_por_sobrenome[sobrenome] = idade
idades = list(idade_por_sobrenome.values())
media_idades = sum(idades) / len(idades)
print(f'A média das idades é {media_idades}')

for chave, valor in idade_por_sobrenome.items():
    if valor > media_idades:
        print(f'Sobrenome: {chave}')
