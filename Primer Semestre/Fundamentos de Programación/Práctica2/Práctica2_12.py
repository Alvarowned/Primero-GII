def TC_a_TF(TC):
    """float -> float
       OBJ: convertir de grados Celsius a grados Fahrenheit"""
    TF = 9*TC/5 + 32
    return TF

def TC_a_TK(TC):
    """float -> float
       OBJ: conertir de grados Celsius a grados Kelvin"""
    TK = TC + 273.15
    return TK

#Prueba
TC = float(input("Introduzca la temperatura en Celsius a convertir: "))
print("La equivalencia en Fahrenheit es de", TC_a_TF(TC), "grados.")
print("La equivalencia en Kelvin es de", TC_a_TK(TC), "grados.")

input("\nPulse intro para cerrar el programa.")
