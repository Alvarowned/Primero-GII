def es_bisiesto(anio):
    """int -> none
       OBJ: decir si un año es bisiesto o no."""
    if((anio % 400 == 0) or ((anio % 4 == 0) and (anio % 100 != 0))):
        print("Ese año es bisiesto.")
    else:
        print("Ese año no es bisiesto.")

#Prueba
anio = int(input("Introduzca un año: "))
print(es_bisiesto(anio))

input("\nPulse intro para finalizar el programa.")
