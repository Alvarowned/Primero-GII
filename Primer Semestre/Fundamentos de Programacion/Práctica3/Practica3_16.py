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

print("Este programa pide un número límite y calcula el mínimo número de términos de la serie armónica (1/1 + 1/2 +...+ 1/n) son necesarios para superar ese valor.\n")

ent = False
while(not ent):
    lim = input("Introduzca el número límite: ")
    ent = validar_entero(lim)
    if(ent):
        lim = float(lim)
    else:
        print("Eso no es un real.")

n = 0
x = 0
while(x < lim):
    n += 1
    x += 1/n

print("Necesitamos sumar los", n, "primeros términos de la serie armónica para llegar a", str(lim) + ".")
