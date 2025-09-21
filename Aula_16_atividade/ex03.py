def numero(string):
    soma = 0
    mult = 1
    for num in string:
        digito = int(num)
        soma += digito
        mult *= digito
    return soma, mult


string = input('Digite um número no formato string: ')

somar, multiplicar = numero(string)
print(f'Soma: {somar}')
print(f'Multiplicação: {multiplicar}')
#RA: 301139232331