import Biblio_5
import math

def dist_puntos(p1,p2):
    """Punto2D,Punto2D -> float
       OBJ: Devuelve la distancia que entre dos puntos en 2D."""
    return math.sqrt(((p2.xx - p1.xx)**2)+((p2.yy - p1.yy)**2))

#Probador
p1 = Biblio_5.declarar_punto()
p2 = Biblio_5.declarar_punto()

print(dist_puntos(p1,p2))
