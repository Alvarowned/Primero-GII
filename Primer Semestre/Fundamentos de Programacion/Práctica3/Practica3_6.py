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

def validar_real(x):
    """any -> bool
       OBJ: Saber si un valor introducido es un número real."""
    try:
       x = float(x)
       real = True
    except: real = False
    return real

print("Este programa eleva un número real a un número entero.")

a = input("Introduzca un número real: ")
while(not validar_real(a)):
    print("Ese número no es un real.")
    a = input("Introduzca un número real: ")

b = input("Introduzca un número entero: ")
while(not validar_entero(b)):
    print("Ese número no es un entero.")
    b = input("Introduzca un número entero: ")

a = float(a)
b = int(b)
c = 1

if(b>0):
    for b in range(1,b+1):
        c *= a
elif(b<0):
    b = abs(b)
    for b in range(1,b+1):
        c *= a
    c = 1/c
    b = -b
else: c = 1

print("El resultado de elevar",a,"a",b,"es", str(c) + ".")

input("Pulse enter para cerrar el programa.")
