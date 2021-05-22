def leer_entero_validado():
    """none -> int
       OBJ: Solicita un entero al usuario, lo valida y lo retorna solo cuando se ha asegurado de que es un entero."""
    ent = False
    while(not ent):
        x = input("Introduzca un número entero: ")
        try:
            n = int(x)
            if(n == float(x)):
                ent = True
            else:
                raise
        except:
            print("Eso no es un entero.\n")
            ent = False
    x = int(x)
    return x

#Prueba
x = leer_entero_validado()
print("El número entero es " + str(x) + ".")

input("\nPulse enter para cerrar el programa.")
