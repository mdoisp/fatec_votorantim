def ehprimo(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    else:
        return True


def qnts_primos(n):
    qntd = 0
    for i in range(1, n+1):
        if ehprimo(i):
            qntd = qntd + 1
    return qntd


valor = int(input('Entre com o número: '))
print(f'A quantidade de primos entre 1 e {valor} é:')
print(f'{qnts_primos(valor)}')
