lista1 = []
lista2 = []
for i in range(5):
    lista1.append(int(input(f'Digite o {i+1}º número da 1ª lista: ')))
for i in range(5):
    lista2.append(int(input(f'Digite o {i+1}º número da 2ª lista: ')))
uniao = set(lista1).union(set(lista2))
print(f'o conjunto da união entre as duas listas é {uniao}')
