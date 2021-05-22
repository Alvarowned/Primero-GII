def decim_binario(n_dec):
    """int -> str
       OBJ: Pasar un número de decimal a binario mediante recursividad.
       PRE: El número n debe ser positivo."""
    resto = n_dec % 2
    if(n_dec  == 1):
        return "1"
    else:
        resto = decim_binario(n_dec//2) + str(resto)
        return resto

#Probador
n = int(input("Introduzca el número a traducir a binario: "))
print("El número en binario es", decim_binario(n) + ".")
