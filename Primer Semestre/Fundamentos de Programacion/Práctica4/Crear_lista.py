def crear_lista():
    """lista, int-->lista
    OBJ: La lista se inicializa con todos sus valores a 0"""
    n = int(input("Introduzca el número de términos que tiene su lista: "))
    lista = []
    for i in range(0,n):
        lista.append(input("Introduzca el valor: "))
    return lista
