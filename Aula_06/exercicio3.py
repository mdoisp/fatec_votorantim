comp = float(input("Digite o comprimnto da parede: "))
larg = float(input("Digite a largura da parede: "))
alt = 2.80
tipo = str(input("Escreva se quer usar 'lata', 'galão' ou 'litros' de tinta: "))
parede1 = (comp * alt) * 2
parede2 = (larg * alt) * 2
area_pintada = (parede1 + parede2) - (2.1 * 0.8)
litros = area_pintada / 3
galao = litros / 3
lata = litros / 18
if tipo == 'litros':
    print(f"Para {area_pintada:5.2f} m² você precisará de {litros:5.2f} litros de tinta")
elif tipo == 'galão':
    print(f"Para {area_pintada:5.2f} m² você precisará de {galao:1.0f} galões de tinta")
elif tipo == 'latas':
    print(f"Para {area_pintada:5.2f} m² você precisará de {lata:1.0f} latas de tinta")
else:
    print("Verifique se digitou corretamente!")
