nota_1 = float(input("Digite a nota da primeira prova: "))
nota_2 = float(input("Digite a nota da segunda prova: "))
nota_3 = float(input("Digite a nota da terceira prova: "))
media = (nota_1 + nota_2 + nota_3) / 3
nota_exame = 0

if media < 3:
    resultado = "Reprovado"
else:
    if media < 7:
        resultado = "Exame"
        nota_exame = 12 - media
    else:
        resultado = "Aprovado"

print(f"Média {media:5.1f} - {resultado}!")
if nota_exame != 0:
    print(f"Tem que tirar no mínimo {nota_exame:5.1f}")
