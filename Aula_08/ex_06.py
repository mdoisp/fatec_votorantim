palavra = input('Digite uma palavra: ')
inverso_palavra = palavra[::-1]

if palavra.lower() == inverso_palavra.lower():
    print(f'A palavra {palavra} é palíndroma')
elif palavra.upper() == inverso_palavra.upper():
    print(f'A palavra {palavra} é palíndroma')
else:
    print(f'A palavra {palavra} NÃO é palíndroma')
