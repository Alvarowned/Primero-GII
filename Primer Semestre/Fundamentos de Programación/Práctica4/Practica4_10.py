def codificar_frase(frase):
    """str -> str
       OBJ: Cambiar las a por 4, las e por 3, las i por 1, las o por 0 y las u por #."""
    frase = list(frase)
    n = 0
    while(len(frase) >= n):
        for term in ("A","Á","á","a"):
            try:
                frase.insert(frase.index(term), "4")
                frase.remove(term)
            except: x = 1
        for term in ("E","É","é","e"):
            try:
                frase.insert(frase.index(term), "3")
                frase.remove(term)
            except: x = 1
        for term in ("I","Í","í","i"):
            try:
                frase.insert(frase.index(term), "1")
                frase.remove(term)
            except: x = 1
        for term in ("O","Ó","ó","o"):
            try:
                frase.insert(frase.index(term), "0")
                frase.remove(term)
            except: x = 1
        for term in ("U","Ú","ú","u"):
            try:
                frase.insert(frase.index(term), "#")
                frase.remove(term)
            except: x = 1
        n += 1
    return "".join(frase)

#Probador
frase = str(input("Introduzca la frase a codificar: "))
print("La frase codificada es:",codificar_frase(frase))
