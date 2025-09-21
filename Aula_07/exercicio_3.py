soma_h = 0
soma_w = 0
menor_imc = 0
maior_imc = 0
for i in range(1, 6):
    x = float(input(f"Entre com o {i}º peso: "))
    y = float(input(f"Entre com a {i}° altura: "))
    soma_w = soma_w + x
    soma_h = soma_h + y
    imc = x / y**2
    if i == 1:
        maior_imc = imc
        menor_imc = imc
    if imc > maior_imc:
        maior_imc = imc
    if imc < menor_imc:
        menor_imc = imc
media_h = soma_h / 5
media_w = soma_w / 5
print(f"A média dos pesos é: {media_w:5.2f}")
print(f"A média das alturas é: {media_h:5.2f}")
print(f"O menor IMC é: {menor_imc:5.2f}")
print(f"O maior IMC é: {maior_imc:5.2f}")
