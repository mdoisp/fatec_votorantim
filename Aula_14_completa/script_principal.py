from valida_cpf import valida_cpf
from exibir_menu import exibir_menu
from valida_data import valida_data
import random

while True:
    escolha = exibir_menu()
    if escolha == 1:
        nome = input("Nome:")
        sobrenome = input("Sobrenome:")
        cpf = input("Digite o CPF formato XXX.XXX.XXX-XX:")
        while (not valida_cpf(cpf)):
            print("CPF inválido")
            cpf = input("Digite o CPF formato XXX.XXX.XXX-XX:")

        data = input("Digite data de nascimento DD/MM/AAAA:")
        while (not valida_data(data)):
            print("Data inválida")
            cpf = input("Digite data de nascimento DD/MM/AAAA:")
        renda = input("Renda Bruta:")

    elif escolha == 2:
        mensagensPositivas = ["A persistência realiza o impossível",
                  "Seus sonhos não precisam de plateia, eles só precisam de você",
                  "A persistência é o caminho do êxito",
                  "No meio da dificuldade encontra-se a oportunidade"]
        print(random.choice(mensagensPositivas))

    elif escolha == 3:
        print("Bye Bye")
        break

