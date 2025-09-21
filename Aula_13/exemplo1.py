'''Definição de funções'''
qtd = 5
x = 10
def linha(qtd=20):
    print(qtd, "Dentro", x)
    for _ in range(0, qtd):
        print("-", end='')
    print()


linha()
print(qtd, "Fora", x)
print("** Uso de funções **")
linha(30)
