def pos_neg(valor):
    if valor > 0:
        return 'P'
    else:
        return 'N'


numero = int(input(f'Digite um número, negativo ou positivo: '))
if pos_neg(numero):
    print(f'{pos_neg(numero)}')
else:
    print(f'{pos_neg(numero)}')
