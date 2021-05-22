import Biblio_5

class Cuadrado:
    def __init__(self,p1,p2,p3,p4,pc):
        self.p1 = Biblio_5.Punto2D(p1.xx,p1.yy)
        self.p2 = Biblio_5.Punto2D(p2.xx,p2.yy)
        self.p3 = Biblio_5.Punto2D(p3.xx,p3.yy)
        self.p4 = Biblio_5.Punto2D(p4.xx,p4.yy)
        self.pc = Biblio_5.Punto2D(pc.xx,pc.yy)

def crear_cuadrado(p1,p3):
    """Punto2D,Punto2D -> Cuadrado
       OBJ: Crear un dato de tipo Cuadrado.
       PRE: p1 y p3 deben ser vértices opuestos."""
    pc = Biblio_5.Punto2D((p3.xx-((p3.xx-p1.xx)/2)),(p3.yy-((p3.yy-p1.yy)/2)))
    p2 = Biblio_5.Punto2D((pc.xx+((p3.yy-p1.yy)/2)),(pc.yy-((p3.xx-p1.xx)/2)))
    p4 = Biblio_5.Punto2D((pc.xx-((p3.yy-p1.yy)/2)),(pc.yy+((p3.xx-p1.xx)/2)))
    return Cuadrado(p1,p2,p3,p4,pc)

#Prueba
p1 = Biblio_5.declarar_punto()
p3 = Biblio_5.declarar_punto()
c1 = crear_cuadrado(p1,p3)
print("P1:",c1.p1.xx,c1.p1.yy,", P2:",c1.p2.xx,c1.p2.yy,", P3:",c1.p3.xx,c1.p3.yy,", P4:",c1.p4.xx,c1.p4.yy,", P5:",c1.pc.xx,c1.pc.yy)
