salario_atual = float(input("Salário: R$"))
percentual = int(input("Percentual de aumento: "))
salario_aumento = salario_atual + (salario_atual * (percentual/100))
print(f"Seu novo salário será: R${salario_aumento:8.2f}")
