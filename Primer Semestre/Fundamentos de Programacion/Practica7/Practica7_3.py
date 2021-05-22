frases = []
for i in range(10):
    print("\nIntroduzca la frase", str(i+1) + ": ")
    frase = input()
    frase = frase.split()
    frases.append(frase)

for pasada in range(0, len(frases)-1):
    mayor = len(frases[pasada])
    pos = pasada
    for i in range(pasada + 1, len(frases)):
        if(len(frases[i]) > mayor):
            mayor = len(frases[i])
            pos = i
    frases[pos],frases[pasada] = frases[pasada],frases[pos]

print("\nLas frases ordenadas descendentemente por número de palabras son: ")
for i in range(len(frases)):
    print("La frase", i+1, "es:", " ".join(frases[i]))
