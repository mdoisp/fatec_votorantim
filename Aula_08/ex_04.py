frase = input('Digite uma frase: ')
qnt_vogais = 0
for letra in frase:
    if letra.lower() in 'aeiou':
        qnt_vogais = qnt_vogais + 1
    elif letra.upper() in 'AEIOU':
        qnt_vogais = qnt_vogais + 1
print(f'A frase tem {qnt_vogais} vogais')
