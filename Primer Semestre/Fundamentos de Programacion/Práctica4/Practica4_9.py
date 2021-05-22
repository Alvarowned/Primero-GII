def todas_vocales(pal):
    """str -> bool
       OBJ: Detectar si una palabra contiene las 5 vocales.
       PRE: El str debe ser una sola palabra sin tildes."""
    pal = pal.lower()
    pal = list(pal)
    a = False
    e = False
    i = False
    o = False
    u = False
    for term in pal:
        if(term == "a" or term == "á"):
            a = True
        elif(term == "e" or term == "é"):
            e = True
        elif(term == "i" or term == "í"):
            i = True
        elif(term == "o" or term == "ó"):
            o = True
        elif(term == "u" or term == "ú"):
            u = True
    return a == True and e == True and i == True and o == True and u == True

def todas_vocales_sin_rep(pal):
    """str -> bool
       OBJ: Detectar si una palabra contiene las 5 vocales.
       PRE: El str debe ser una sola palabra sin tildes."""
    pal = pal.lower()
    pal = list(pal)
    a = 0
    e = 0
    i = 0
    o = 0
    u = 0
    for term in pal:
        if(term == "a" or term == "á"):
            a += 1
        elif(term == "e" or term == "é"):
            e += 1
        elif(term == "i" or term == "í"):
            i += 1
        elif(term == "o" or term == "ó"):
            o += 1
        elif(term == "u" or term == "ú"):
            u += 1
    return a == 1 and e == 1 and i == 1 and o == 1 and u == 1

#Probador
pal = str(input("Introduzca una palabra: "))
if(todas_vocales(pal)):
    print("Esa palabra contiene las 5 vocales.")
    if(todas_vocales_sin_rep(pal)):
        print("Además no se repite ninguna vocal.")
else:
    print("Esa palabra no contiene las 5 vocales.")
