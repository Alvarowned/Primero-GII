def ml_a_pt(ml):
    """float -> float
       OBJ: calcular el equivalente a una cantidad de ml en pintas"""
    pt = ml/473.176473
    return pt

#Prueba
ml = float(input("Introduzca el número de mililitros a convertir en pintas: "))
print("Equivale a", ml_a_pt(ml),"pt.")

input("\nPulse enter para cerrar el programa.")
