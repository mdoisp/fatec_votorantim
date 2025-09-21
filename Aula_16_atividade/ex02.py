def ehprimo(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    else:
        return True


def qnts_primos(n):
    qntd = 0
    for i in range(0, n+1):
        if ehprimo(i):
            qntd = qntd + 1
    return qntd


numero = int(input(f'Digite um número: '))
primos = []
i = 0
n = 0

while i < qnts_primos(numero):
    primo = True
    for k in range(2, n):
        if (n % k) == 0:
            primo = False
            break

    if primo:
        primos.append(n)
        i = i + 1
    n = n + 1

print(f'{primos}')
soma = sum(primos)
print(f'{soma}')
