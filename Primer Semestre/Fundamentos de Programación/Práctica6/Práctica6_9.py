class Alumno:
    def __init__(self,nombre,edad,titulacion):
        self.nombre = nombre
        self.edad = edad
        self.titul = titulacion

def suma_edades(alumnos):
    """list -> int
       OBJ: Calcular la suma de las edades de una lista de alumnos.
       PRE: La lista solo debe contener datos del tipo Alumno."""
    if(len(alumnos) == 1):
        return alumnos[0].edad
    else:
        x = alumnos[0].edad
        alumnos.remove(alumnos[0])
        return suma_edades(alumnos) + x

#Probador
alumno1 = Alumno("Pepe",20,"GII")
alumno2 = Alumno("Esther",18,"GIC")
alumno3 = Alumno("Manuel",22,"GIT")
alumnos = [alumno1,alumno2,alumno3]
print("La suma de la edad de los alumnos es", str(suma_edades(alumnos)) + ".")
