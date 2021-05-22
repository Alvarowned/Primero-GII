frases = []
for i in range(10):
    print("\nIntroduzca la frase", str(i+1) + ": ")
    frase = input()
    frases.append(frase)

for pasada in range(1, len(frases)):
    elem = frases[pasada]
    i = pasada
    while(len(frases[i-1]) < len(elem) and i > 0):
        frases[i] = frases[i-1]
        i -= 1
    frases[i] = elem

print("\nLas frases ordenadas descendentemente por longitud son: ")
for i in range(len(frases)):
    print("La frase", i+1, "es:", frases[i])
