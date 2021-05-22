def calif_letra(nota):
    """float -> str
       OBJ: Asignar a una calificacion numérica una calificación por letras."""
    if(nota >= 8.5):
        letra = "A"
    elif(nota >= 6.5):
        letra = "B"
    elif(nota >= 5):
        letra = "C"
    elif(nota >= 3.5):
        letra = "D"
    else: letra = "F"
    return letra

nota = float(input("Introduzca la nota: "))
while(nota > 10):
    nota = float(input("Introduzca una nota válida: "))

print("La calificación de esa nota es", calif_letra(nota) + ".")
