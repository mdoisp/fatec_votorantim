def conversor(horas, minutos, segundos):
    return (horas * 3600 + minutos * 60 + segundos)


hrs = int(input('Digite um número: '))
min = int(input('Digite um número: '))
sec = int(input('Digite um número: '))
print(f'O total de segundos é {conversor(hrs, min, sec)}')
