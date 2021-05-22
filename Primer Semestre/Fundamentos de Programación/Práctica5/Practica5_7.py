import Biblio_5

def cuadrado_es_mayor(c1,c2):
    """Cuadrado,Cuadrado -> bool
       OBJ: Saber si el cuadrado c1 es más grande que el c2."""
    d1 = Biblio_5.dist_puntos(c1.p1,c1.p2)
    d2 = Biblio_5.dist_puntos(c2.p1,c2.p2)
    return d1**2 > d2**2
