import Biblio_4

def suma_listas(l1,l2):
    """list,list --> list
       OBJ: Sumar los términos de dos listas de igual longitud.
       PRE: Las dos listas deben tener igual longitud y sus terminos deben ser float."""
##    for i in range(len(l1)):
##        l1[i] = int(l1[i])
##    for i in range(len(l2)):
##        l2[i] = int(l2[i])
    lsuma = []
    minimo = min(len(l1),len(l2))
    maximo = max(len(l1),len(l2))
    for term in range(minimo):
        lsuma.append(l1[term]+l2[term])
    for term in range(minimo,maximo):
        if(len(l1)>len(l2)):
            lsuma.append(l1[term])
        elif(len(l1)<len(l2)):
            lsuma.append(l2[term])
    return lsuma

#Probador
n1 = int(input("¿Cuál es la longitud de la lista 1?: "))
print("Lista 1:")
l1 = Biblio_4.crear_lista_nterm(n1)
n2 = int(input("¿Cuál es la longitud de la lista 2?: "))
print("Lista 2:")
l2 = Biblio_4.crear_lista_nterm(n2)
lsuma = suma_listas(l1,l2)
print(lsuma)
