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

print("Este programa contará el número de enteros introducidos, el número de positivos y de negativos hasta que introduzca la cifra -9999.\n")
num = 0
total = 0
negativos = 0
positivos = 0
while(num != -9999):
    num = leer_entero_validado()
    if(num < 0 and num != -9999):
        negativos += 1
        total += 1
    elif(num > 0 and num != -9999):
        positivos += 1
        total += 1

print("\nSe han introducido un total de", total, "números enteros, de los cuales", positivos, "son positivos y", negativos, "son negativos, sin contar el -9999.")
input("\nPulse intro para cerrar el programa.")
