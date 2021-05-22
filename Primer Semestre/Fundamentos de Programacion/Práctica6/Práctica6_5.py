def inver_recurs(palabra):
    """str -> list
       OBJ: Invertir una palabra mediante recursividad."""
    palabra = list(palabra)
    if(len(palabra) == 1):
        return palabra
    else:
        x = palabra[0]
        palabra.remove(palabra[0])
        palabra = inver_recurs(palabra)
        palabra.append(x)
        return palabra

#Probador
pal = input("Introduzca la palabra a invertir: ")
inv_pal = "".join(inver_recurs(pal))
print("La palabra invertida es:",inv_pal)
