from math import pow, sqrt

x1 = int(input("Entre com X1: "))
y1 = int(input("Entre com Y1: "))
x2 = int(input("Entre com X2: "))
y2 = int(input("Entre com Y2: "))
dx = x2 - x1
dy = y2 - y1

distancia = sqrt(pow(dx, 2) + pow(dy, 2))
print("A distância entre os pontos é:", distancia)
