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

print("Elija una de las opciones que se le proponen.\n")
print("1. Seno\n2. Coseno\n3. Tangente\n4. Cotangente\n5. Secante\n6. Cosecante\n0. Salir\n")

#num es la opción a elegir
ent = False
num = 999
while(not num >= 0 or not num <= 6 or not ent):
    num = input("Elija una opción: ")
    ent = validar_entero(num)
    if(not ent):
        print("Esa no es una opción válida.\n")
        num = 999
    else:
        num = int(num)
        if(not num >= 0 or not num <= 6):
            print("Esa no es una opción válida.\n")

import math

if(num != 0):
    real = False
    while(not real):
        angulo_grad = input("\nIntroduzca el ángulo en grados: ")
        real = validar_real(angulo_grad)
        if(not real):
            print("Eso no es un ángulo.")
        else:
            angulo_grad = float(angulo_grad)
            
    angulo_rad = math.radians(angulo_grad)
    
    if(num == 1):
        solucion = math.sin(angulo_rad)
    elif(num == 2):
        solucion = math.cos(angulo_rad)
    elif(num == 3):
        solucion = math.tan(angulo_rad)
    elif(num == 4):
        solucion = 1/(math.tan(angulo_rad))
    elif(num == 5):
        solucion = 1/(math.cos(angulo_rad))
    elif(num == 6):
        solucion = 1/(math.sen(angulo_rad))
    print("La solución es", str(solucion) + ".")

    input("\nPulse intro para cerrar el programa.")
    





        
