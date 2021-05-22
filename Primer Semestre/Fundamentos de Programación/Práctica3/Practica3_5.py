def validar_real(x):
    """any -> bool
       OBJ: Saber si un valor introducido es un número real."""
    try:
       x = float(x)
       real = True
    except: real = False
    return real

x = input("Introduce lo que quieras: ")

if(validar_real(x)):
    print("Lo que has introducido es un número real.")
else:
    print("Lo que has introducido no es un número real.")

input("Pulse enter para cerrar el programa.")
