from math import pi, pow
def volume_esfera(raio):
    result = (4/3 * pi) * pow(raio, 3)
    return result


raio = float(input('Digite um valor: '))
print(f'{volume_esfera(raio):5.2f}')
