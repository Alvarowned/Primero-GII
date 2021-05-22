def suma_pares(n):
    """int -> int
       OBJ: Sumar los números pares entre 0 y n, n incluido."""
    if(n % 2 == 1):
        n -= 1
    if(n == 2):
        return n
    else:
        n += suma_pares(n-2)
        return n

#Prueba
n = int(input("Introduzca un número entero: "))
print("La suma de los pares entre 0 y", n, "es", str(suma_pares(n)) + ".")
