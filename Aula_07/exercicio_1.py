num = int(input(f"Digite um valor: "))
mult = 0
if num > 0:
    for i in range(1, num+1):
        mult = mult + (2 ** i)
        print(f"O valor de e é = {mult}")
else:
    print(f"Entre com um valor positivo!")
