def fuerza (m, a):
    """float, float -> float
OBJ: calcular la fuerza a partir de la masa y la aceleración de un cuerpo
"""
    f=m*a
    return f

#Probador
m = float(input("Introduzca la masa del cuerpo en kg: "))
a = float(input("Introduzca la aceleración del cuerpo en m/s: "))
print("La fuerza resultante es de", fuerza(m,a), "N.")

input("\nIntroduce cualquier letra para finalizar el programa: ")
