dia = int(input("Entre com o número do dia da semana: "))
if dia == 1:
    nome = "Domingo"
elif dia == 2:
    nome = "Segunda-feira"
elif dia == 3:
    nome = "Terça-feira"
elif dia == 4:
    nome = "Quarta-feira"
elif dia == 5:
    nome = "Quinta-feira"
elif dia == 6:
    nome = "Sexta-feira"
elif dia == 7:
    nome = "Sábado-feira"
else:
    nome = f"Valor {dia} inválido"

print(nome)
