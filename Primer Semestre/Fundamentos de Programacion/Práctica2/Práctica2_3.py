def m2_a_barn(m2):
    """float -> float
       OBJ: convertir de metros cuadrados a Barns"""
    Barn = m2 * (10**-28)
    return Barn

def barn_a_m2(Barn):
    """float -> float
       OBJ: convertir de Barns a metros cuadrados"""
    m2 = Barn * (10**28)
    return m2


#Prueba

m2 = float(input("Introduzca la cantidad de metros cuadrados a convertir en Barnes: "))
print("La cantidad introducida en Barnes es", str(m2_a_barn(m2)) + ".")

Barn = float(input("\nIntroduzca la cantidad de Barnes a convertir en metros cuadrados: "))
print("La cantidad introducida en metros cuadrados es", str(barn_a_m2(Barn)) + ".")

input("\nIntroduce cualquier letra para finalizar el programa: ")
