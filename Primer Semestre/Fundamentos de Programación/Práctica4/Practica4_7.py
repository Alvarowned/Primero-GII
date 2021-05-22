def mayus_primera_letra(frase):
    """str -> str
       OBJ: Poner en mayúscula las primeras letras de las palabras de un str."""
    l_frase = list(frase)
    n = 0
    term = 0
    while(n == 0 and term < len(l_frase)):
        try:
            if(l_frase[term] == l_frase[term].upper()):
                raise
            l_frase[term] = l_frase[term].upper()
            n = 1
        except:
            term += 1
    for term in range(len(l_frase)):
        if(l_frase[term] == " "):
            l_frase[term+1] = l_frase[term+1].upper()
    frase = "".join(l_frase)
    return frase

#Probador
frase = str(input("Introduzca su frase: "))
print("Con mayúsculas: ",mayus_primera_letra(frase))
