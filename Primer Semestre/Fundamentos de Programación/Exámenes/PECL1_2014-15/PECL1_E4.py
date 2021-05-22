n = int(input("Introduzca un número entero: "))
suma = 0

if(n % 2 == 0):                 #Por si es par
    for x in range(1,n+1):
        suma += n+(x*2)
else:
    sig_par = n+1               #Por si es impar
    for x in range(1,n+1):
        suma += sig_par+(x*2)

print("La suma de los", n, "números pares siguientes a", n, "es", str(suma) + ".")
