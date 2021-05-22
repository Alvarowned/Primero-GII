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

def n_a_mes(n):
    """int -> str
       OBJ: Indica el mes correspondiente a un número y si no corresponde a ninguno da error."""
    if(n == 1):
        mes = "Enero"
    elif(n == 2):
        mes = "Febrero"
    elif(n == 3):
        mes = "Marzo"
    elif(n == 4):
        mes = "Abril"
    elif(n == 5):
        mes = "Mayo"
    elif(n == 6):
        mes = "Junio"
    elif(n == 7):
        mes = "Julio"
    elif(n == 8):
        mes = "Agosto"
    elif(n == 9):
        mes = "Septiembre"
    elif(n == 10):
        mes = "Octubre"
    elif(n == 11):
        mes = "Noviembre"
    elif(n == 12):
        mes = "Diciembre"
    else:
        mes = "ERROR"
    return mes

#Prueba
n = leer_entero_validado()
print(n_a_mes(n), "es el mes que corresponde a ese entero.")

input("\nPulse enter para cerrar el programa.")
