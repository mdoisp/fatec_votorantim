x = float(input("Digite o valor de um lado: "))
y = float(input("Digite o valor do segundo lado: "))
z = float(input("Digite o valor do terceiro lado: "))

if (x < y+z) and (y < x+z) and (z < x+y):
    if x == y == z:
        print("É um triângulo Equilátero")
    elif (x == y != z) or (x == z != y) or (y == z != x):
        print("É um triangulo Isósceles")
    else:
        (x != y) and (y != z) and (z != x)
        print("É um triângulo Escaleno")
else:
    print("Não é possível formar um triângulo")
