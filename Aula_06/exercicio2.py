a = float(input("Digite o valor da sua compra: "))
desconto_10 = a * 0.1
desconto_20 = a * 0.2
desconto_30 = a * 0.3

if a <= 0:
    print("Você não tem desconto")
elif (a > 0) and (a <= 1000):
    print(f"Você tem R${desconto_10:5.2f} de desconto")
elif (a > 1000) and (a <= 5000):
    print(f"Você tem R${desconto_20:5.2f} de desconto")
else:
    print(f"Você tem R${desconto_30:5.2f} de desconto")
