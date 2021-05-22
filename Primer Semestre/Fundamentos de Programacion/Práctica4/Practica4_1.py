import Biblio_4

def suma_listas_iguales(l1,l2):
    """list,list --> list
       OBJ: Sumar los términos de dos listas de igual longitud.
       PRE: Las dos listas deben tener igual longitud y sus terminos deben ser float."""
##    for i in range(len(l1)):
##        l1[i] = int(l1[i])
##    for i in range(len(l2)):
##        l2[i] = int(l2[i])
    lsuma = []
    for term in range(len(l1)):
        lsuma.append(l1[term]+l2[term])
    return lsuma

#Probador
n = int(input("¿Cuál es la longitud de las listas que quiere sumar?: "))
print("Lista 1:")
l1 = Biblio_4.crear_lista_nterm_float(n)
print("Lista 2:")
l2 = Biblio_4.crear_lista_nterm_float(n)
lsuma = suma_listas_iguales(l1,l2)
print(lsuma)
