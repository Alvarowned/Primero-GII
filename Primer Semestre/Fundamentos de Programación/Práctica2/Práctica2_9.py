def p_en_circun(x,y):
    """float,float -> float
       OBJ: Saber si un punto en 2D se encuentra en la circunferencia x**2+y**2=1000"""
    return x**2+y**2 == 1000

#Probador
x = float(input("Introduzca las coordenadas x del punto: "))
y = float(input("Introduzca las coordenadas y del punto: "))

if(p_en_circun(x,y) == True):
    print("El punto se encuentra en la circunferencia.")
else:
    print("El punto no se encuentra en la circunferencia.")

input("Pulse intro para cerrar el programa.")
