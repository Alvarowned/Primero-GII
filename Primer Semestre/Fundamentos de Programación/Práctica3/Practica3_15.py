def validar_real(x):
    """any -> bool
       OBJ: Saber si un valor introducido es un número real."""
    try:
        x = float(x)
        real = True
    except: real = False
    return real

print("Este programa calculará el resultado de una ecuación de segundo grado en formato ax^2 + bx + c = 0.\n")

real = False
while(not real):
    a = input("Introduzca el valor a de la ecuación: ")
    real = validar_real(a)
    if(real):
        a = float(a)
    elif(not real):
        print("Eso no es un número real.\n")
real = False
while(not real):
    b = input("Introduzca el valor b de la ecuación: ")
    real = validar_real(b)
    if (real):
        b = float(b)
    elif(not real):
        print("Eso no es un número real.\n")
real = False
while(not real):
    c = input("Introduzca el valor c de la ecuación: ")
    real = validar_real(c)
    if(real):
        c = float(c)
    elif(not real):
        print("Eso no es un número real.\n")

import math
discriminante = b**2 - 4*a*c
if(discriminante > 0):
    raiz1 = (-b + math.sqrt(discriminante)) / (2*a)
    raiz2 = (-b - math.sqrt(discriminante)) / (2*a)
    print("Esa ecuación tiene dos raíces, una es", raiz1, "y la otra es", str(raiz2) + ".")
elif(discriminante == 0):
    raiz = (-b) / (2*a)
    print("Esa ecuación tiene una raíz, que es", str(raiz) + ".")
elif(discriminante < 0):
    print("Esa ecuación tiene raíces imaginarias como solución.")

input("Pulse intro para cerrar el programa.")
