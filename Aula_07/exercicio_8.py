num = int(input(f"Digite um número: "))
primo = True
x = 0
for i in range(1, num+1):
        if (num % x) == 0:
            x = x + 1
if x > 2:
    primo = False
if primo:
    print(f"O número é primo")
else:
    print(f"O número não é primo")
