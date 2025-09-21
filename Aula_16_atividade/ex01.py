def coelhoePato(cabecas, pes):
    coelhos = (pes - (2*cabecas))/2
    patos = (-pes + (4*cabecas))/2
    return (patos, coelhos)


cabecas = int(input('Digite o número total de cabeças: '))
pes = int(input('Digite o número total de pés: '))
total = coelhoePato(cabecas, pes)
print(f'número total de patos: {int(total[0])}')
print(f'número total de coelhos: {int(total[1])}')
