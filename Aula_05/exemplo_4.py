dia = int(input("Entre com o número do dia da semana: "))
match dia:
    case 1:
        nome = "Domingo"
    case 2:
        nome = "Segunda"
    case 3:
        nome = "Terça"
    case 4:
        nome = "Quarta"
    case 5:
        nome = "Quinta"
    case 6:
        nome = "Sexta"
    case 7:
        nome = "Sábado"
    case _:
        nome = f"Valor {dia} inválido"

print(nome)
