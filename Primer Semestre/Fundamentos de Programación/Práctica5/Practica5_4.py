class Punto2D:
    def __init__(self,xx,yy):
        self.xx = xx
        self.yy = yy

def declarar_punto():
    """none -> Punto2D
       OBJ: Declarar un punto."""
    xx = input("Coordenada X: ")
    yy = input("Coordenada Y: ")
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

#Probador
p1 = declarar_punto()
p2 = declarar_punto()
psuma = suma_dos_puntos(p1,p2)
presta = resta_dos_puntos(p1,p2)
print(psuma.xx,psuma.yy)
print(presta.xx,presta.yy)
