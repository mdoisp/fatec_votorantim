lista = []
for i in range(5):
    lista.append(int(input(f'Digite o número {i+1}: ')))

pos = 0
maior = lista[pos]

for i in range(0, len(lista)):
    if lista[i] >= maior:
        maior = lista[i]
        pos = i

print(f'O maior número é {maior} e seu índice é {pos}.')
