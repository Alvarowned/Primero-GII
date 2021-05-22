def rad_a_grados(rad):
    """float -> float
       OBJ: Convertir una cantidad de radianes en su equivalente en grados"""
    import math
    grados = (rad*180)/math.pi
    return grados

#Prueba
rad = float(input("Introduzca el número de radianes a convertir en grados: "))
print("El equivalente es", rad_a_grados(rad),"grados.")

input("\nPulse intro para finalizar el programa.")
