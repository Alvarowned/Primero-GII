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
    print("Los datos de esta persona son: Número", str(Datos.num) + ", sexo", Datos.sexo + ",", Datos.edad, "años.")

pers1 = escribir_datos()
leer_datos(pers1)
