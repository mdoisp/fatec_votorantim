nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))

print(f"{nome} tem {idade} anos!")

if idade >= 60:
    print("Você tem direito ao cartão idoso")
else:
    print("Você não tem direito ao cartão idoso :( ... mas ainda é jovem :)")

print("Acabou o programa")
