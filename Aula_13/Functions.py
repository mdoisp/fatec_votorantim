from math import pi, pow


def mult(a, b):
    result = a * b
    return result


def valorlogicopar(valorpar):
    if valorpar % 2 == 0:
        return True
    else:
        return False


def ehprimo(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    else:
        return True


def volume_esfera(raio):
    result = (4/3 * pi) * pow(raio, 3)
    return result


def conversor(horas, minutos, segundos):
    return horas * 3600 + minutos * 60 + segundos
