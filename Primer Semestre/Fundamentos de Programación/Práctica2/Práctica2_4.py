def media_notas(n1,n2,n3):
    """float,float,float -> float
       OBJ: calcular la media de la nota de tres alumnos"""
    media = (n1+n2+n3)/3
    return media

#Prueba
n1 = float(input("Introduzca la nota del primer alumno: "))
n2 = float(input("Introduzca la nota del segundo alumno: "))
n3 = float(input("Introduzca la nota del tercer alumno: "))

print("La media de las notas de los tres alumnos es", str(media_notas(n1,n2,n3)) + ".")

input("\nPulse intro para finalizar el programa.")
