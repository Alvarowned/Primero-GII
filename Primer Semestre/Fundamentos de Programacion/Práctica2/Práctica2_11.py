def tabla_multiplicar(n):
    """int -> none
       OBJ: Poner en pantalla la tabla de multiplicar de un número entero"""
    num = 0
    while (num<10):
        num = num + 1
        print("\n",n, "x", num, "=", n*num)


#Prueba
n = int(input("Introduzca el número del cual quiere saber la tabla de multiplicar: "))
print(tabla_multiplicar(n))

input("\nPulse enter para terminar el programa.")
