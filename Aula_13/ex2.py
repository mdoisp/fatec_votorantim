def ehprimo(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    else:
        return True


valorlogico = int(input('Digite um número: '))
if ehprimo(valorlogico):
    print(f'O valor {valorlogico} é primo')
else:
    print(f'O valor {valorlogico} não é primo')
