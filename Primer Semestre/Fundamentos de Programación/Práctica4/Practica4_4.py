import random

def crear_lista_nterm_int_aleat(n):
    """int-->lista
    OBJ: Crear una lista aleatoria de n terminos (de valores int)."""
    lista = []
    for i in range(n):
        x = random.randint(1,20)
        lista.append(x)
    return lista

print("Se va a crear una lista aleatoria de enteros y se va a hacer la media de ellos, y se enseñará en pantalla el mayor y el menor.")
n = int(input("Introduzca el número de términos de la lista: "))
l_aleat = crear_lista_nterm_int_aleat(n)
print("La lista es", l_aleat)
l_aleat.sort()

total = 0
for term in range(len(l_aleat)):
    total += l_aleat[term]
media = total/(len(l_aleat))
print("La media de los números en esa lista es:", str(media) + ".")
print("El mayor número es", l_aleat[len(l_aleat)-1],"y el menor es", str(l_aleat[0]) + ".")
