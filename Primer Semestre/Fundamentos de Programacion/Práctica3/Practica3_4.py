def validar_entero(x):
    """any -> bool
       OBJ: Saber si un valor introducido es un int."""
    try:
        n = float(x)
        x = int(x)
        if(n == x):
            ent = True
        else:
            ent = False
    except: ent = False
    return ent

x = input("Introduzca un valor: ")
print(validar_entero(x))
