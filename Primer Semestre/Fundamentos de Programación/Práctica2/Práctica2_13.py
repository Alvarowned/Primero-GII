def dist_puntos(x1,y1,z1,x2,y2,z2):
    """float,float,float,float,float,float -> float
       OBJ: calcular la distancia entre dos puntos 3D."""
    vx = x2 - x1
    vy = y2 - y1
    vz = z2 - z1
    import math
    mod_v = math.sqrt(vx**2 + vy**2 + vz**2)
    return mod_v

#Prueba
x1 = float(input("Introduzca la coordenada x del punto 1: "))
y1 = float(input("Introduzca la coordenada y del punto 1: "))
z1 = float(input("Introduzca la coordenada z del punto 1: "))
x2 = float(input("\nIntroduzca la coordenada x del punto 2: "))
y2 = float(input("Introduzca la coordenada y del punto 2: "))
z2 = float(input("Introduzca la coordenada z del punto 2: "))

print("\nLa distancia entre los dos puntos es de", dist_puntos(x1,y1,z1,x2,y2,z2), "uds.")

input("\nPulse intro para cerrar el programa.")
