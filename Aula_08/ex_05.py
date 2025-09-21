palavra = input('Digite uma palavra: ')
frase = input('Digite uma frase contendo a palavra escolhida, repetindo a mesma quantas vezes quiser: ')
qnt = frase.count(palavra)
total_palavras = frase.count(' ') + 1

print(f'A frase possui um total de {total_palavras} palavras')
print(f'A palavra {palavra} foi encontrada {qnt} vezes na frase')
