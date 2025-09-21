def exibir_menu():
    while True:
        print('Menu de opções:')
        print('1 - Cadastrar')
        print('2 - Exibir frase')
        print('3 - Sair')
        n = input('Digite a opção desejada: ')

        if not n.isdigit():
            print('Por favor, digite um número válido')
            continue

        n = int(n)

        if 1 <= n <= 3:
            return n
        else:
            print('Opção inválida, digite um número entre 1 e 3')
            continue
