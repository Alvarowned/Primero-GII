import math
import random

class Datos:
    def __init__(self,num,sexo,edad):
        self.num = num
        self.sexo = sexo
        self.edad = edad

def escribir_datos():
    """none -> Datos
       OBJ: Leer datos anónimos sobre una persona."""
    num = int(input("Introduzca el número de secuencia: "))
    sexo = input("Introduzca el sexo de la persona(H o M): ")
    edad = int(input("Introduzca la edad de la persona: "))
    return Datos(num,sexo,edad)

def leer_datos(Datos):
    """Datos -> none
       OBJ: Mostrar en pantalla los datos de una persona."""
    print("Número de secuencia", str(Datos.num) + ", sexo", Datos.sexo + ",", Datos.edad, "años.")



class Punto2D:
    def __init__(self,xx,yy):
        self.xx = xx
        self.yy = yy

def declarar_punto():
    """none -> Punto2D
       OBJ: Declarar un punto."""
    xx = float(input("Coordenada X: "))
    yy = float(input("Coordenada Y: "))
    return Punto2D(xx,yy)

def suma_dos_puntos(p1,p2):
    """Punto2D,Punto2D -> Punto2D
       OBJ: Suma dos puntos en 2D."""
    x = p1.xx + p2.xx
    y = p1.yy + p2.yy
    return Punto2D(x,y)

def resta_dos_puntos(p1,p2):
    """Punto2D,Punto2D -> Punto2D
       OBJ: Resta dos puntos en 2D."""
    x = p1.xx - p2.xx
    y = p1.yy - p2.yy
    return Punto2D(x,y)

def dist_puntos(p1,p2):
    """Punto2D,Punto2D -> float
       OBJ: Devuelve la distancia que entre dos puntos en 2D."""
    return math.sqrt(((p2.xx - p1.xx)**2)+((p2.yy - p1.yy)**2))



class Cuadrado:
    def __init__(self,p1,p2,p3,p4,pc):
        self.p1 = Punto2D(p1.xx,p1.yy)
        self.p2 = Punto2D(p2.xx,p2.yy)
        self.p3 = Punto2D(p3.xx,p3.yy)
        self.p4 = Punto2D(p4.xx,p4.yy)
        self.pc = Punto2D(pc.xx,pc.yy)

def crear_cuadrado(p1,p3):
    """Punto2D,Punto2D -> Cuadrado
       OBJ: Crear un dato de tipo Cuadrado.
       PRE: p1 y p3 deben ser vértices opuestos."""
    pc = Punto2D((p3.xx-((p3.xx-p1.xx)/2)),(p3.yy-((p3.yy-p1.yy)/2)))
    p2 = Punto2D((pc.xx+((p3.yy-p1.yy)/2)),(pc.yy-((p3.xx-p1.xx)/2)))
    p4 = Punto2D((pc.xx-((p3.yy-p1.yy)/2)),(pc.yy+((p3.xx-p1.xx)/2)))
    return Cuadrado(p1,p2,p3,p4,pc)

def cuadrado_es_mayor(c1,c2):
    """Cuadrado,Cuadrado -> bool
       OBJ: Saber si el cuadrado c1 es más grande que el c2."""
    d1 = Biblio_5.dist_puntos(c1.p1,c1.p2)
    d2 = Biblio_5.dist_puntos(c2.p1,c2.p2)
    return d1**2 > d2**2
