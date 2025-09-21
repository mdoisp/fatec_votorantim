import sys
from datetime import datetime

def valida_data(data_nascimento):
    try:
        dia, mes, ano = map(int, data_nascimento.split('/'))
        data_nasc = datetime(ano, mes, dia).date()

        hoje = datetime.now().date()

        idade = hoje.year - data_nasc.year - ((hoje.month, hoje.day) < (data_nasc.month, data_nasc.day))

        if idade >= 18:
            print("Sua idade foi validada!")
            return True
        else:
            print("Você tem menos de 18 anos!")
            sys.exit()

    except ValueError:
        print("Data de nascimento inválida. Tente novamente.")
