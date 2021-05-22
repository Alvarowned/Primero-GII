def ent_digitos(n):
    """int -> int
       OBJ: Calcular mediante recursividad cuántos dígitos tiene un número entero."""
    dig = 0
    if(n < 10):
        return 1
    else:
        n = n//10
        dig = ent_digitos(n)
        return dig+1

#Probador
n = int(input("Introduzca un número: "))
print("Ese número tiene",ent_digitos(n),"dígitos.")
