def area_circulo(r):
    """float -> float
       OBJ: calcular el area de un circulo a partir del radio"""
    import math
    a_circulo = math.pi * (r**2)
    return a_circulo

def area_cuadrado(l):
    """float -> float
       OBJ: calcular el area de un cuadrado a partir del lado"""
    import math
    a_cuadrado = l**2
    return a_cuadrado

def area_triangulo(b,a):
    """float, float -> float
       OBJ: calcular el area de un triangulo a partir de la base y la altura"""
    a_triangulo = (b*a)/2
    return a_triangulo


#Prueba

r = float(input("Introduzca el radio del círculo en m: "))
print("El área del círculo es", area_circulo(r), "metros cuadrados.")

l = float(input("\nIntroduzca el lado del cuadrado en m: "))
print("El área del cuadrado es", area_cuadrado(l), "metros cuadrados.")

b = float(input("\nIntroduzca la base del triángulo en m: "))
a = float(input("Introduzca la altura del triángulo en m: "))
print("El área del triángulo es", area_triangulo(b,a), "metros cuadrados.")

input("\nIntroduce cualquier letra para finalizar el programa: ")
