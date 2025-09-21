def valorlogicopar(valorpar):
    if valorpar % 2 == 0:
        return True
    else:
        return False


par = int(input("Digite um valor: "))
if valorlogicopar(par):
    print("O número é par")
else:
    print("O número é ímpar")
