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

def orden_int(a,b,c):
    """int,int,int -> int,int,int
       OBJ: Ordenar tres numeros enteros en orden ascendente, de menor a mayor."""
    while((a > b) or (b > c)):
        if(a > b):
            x = a
            a = b
            b = x
        if(b > c):
            x = b
            b = c
            c = x
    return a,b,c

print("Este programa sirve para ordenar de menor a mayor tres enteros.\n")

a = input("Introduzca el primer entero: ")
while(not validar_entero(a)):
    print("Eso no es un entero.")
    a = input("Introduzca el primer entero: ")
a = int(a)

b = input("Introduzca el segundo entero: ")
while(not validar_entero(b)):
    print("Eso no es un entero.")
    b = input("Introduzca el segundo entero: ")
b = int(b)

c = input("Introduzca el tercer entero: ")
while(not validar_entero(c)):
    print("Eso no es un entero.")
    c = input("Introduzca el tercer entero: ")
c = int(c)

print("Los números ordenados son", str(orden_int(a,b,c)) + ".")

input("Pulse enter para cerrar el programa.")
