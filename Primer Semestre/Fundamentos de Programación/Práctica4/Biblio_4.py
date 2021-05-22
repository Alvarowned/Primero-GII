import random

def crear_lista_nterm(n):
    """int-->lista
    OBJ: Crear una lista de n terminos (de valores str)."""
    lista = []
    for i in range(n):
        lista.append(input("Introduzca el valor: "))
    return lista

def crear_lista_nterm_float(n):
    """int-->lista
    OBJ: Crear una lista de n terminos (de valores float)."""
    lista = []
    for i in range(n):
        lista.append(float(input("Introduzca el valor: ")))
    return lista

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

def crear_lista_nterm_int_aleat(n):
    """int-->lista
    OBJ: Crear una lista aleatoria de n terminos (de valores int)."""
    lista = []
    for i in range(n):
        x = random.randint(1,20)
        lista.append(x)
    return lista

def notas_float_a_str(l_notas_num):
    """list -> list
       OBJ: Pasar de notas númericas a Aprobado/Suspenso.
       PRE: Datos de la lista float y de 0 a 10."""
    l_notas_AS = []
    for term in range(len(l_notas_num)):
        if (l_notas_num[term] < 5):
            l_notas_AS.append(str("Suspenso"))
        else:
            l_notas_AS.append(str("Aprobado"))
    return l_notas_AS

def crear_lista_inversa(l1):
    """list -> list
       OBJ: Obtener la lista inversa."""
    l1_inversa = []
    long = len(l1)
    for term in range(long):
        l1_inversa.append(l1[long-1-term])
    return l1_inversa
