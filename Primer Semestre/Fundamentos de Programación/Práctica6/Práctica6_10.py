def decim_base(n_dec,base):
    """int -> str
       OBJ: Pasar un número de decimal a otra base mediante recursividad.
       PRE: El número n debe ser positivo, y la base entre 1 y 9."""
    resto = n_dec % base
    if(n_dec <= base):
        return str(n_dec)
    else:
        resto = decim_base(n_dec//base,base) + str(resto)
        return resto

#Probador
n = int(input("Introduzca el número a traducir a otra base: "))
base = int(input("Introduzca la base: "))
print("El número en binario es", decim_base(n,base) + ".")
    
