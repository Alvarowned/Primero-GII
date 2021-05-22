import Biblio_4

def notas_float_a_str(l_notas_num):
    """list -> list
       OBJ: Pasar de notas númericas a Aprobado/Suspenso.
       PRE: Datos de la lista float y de 0 a 10."""
    l_notas_AS = []
    for term in range(len(l_notas_num)):
        if (l_notas_num[term] < 5):
            l_notas_AS.append(str("Suspenso"))
        else:
            l_notas_AS.append(str("Aprobado"))
    return l_notas_AS

#Probador
n = int(input("Introduzca el número de alumnos: "))
l_notas_num = Biblio_4.crear_lista_nterm_float(n)
l_notas_AS = notas_float_a_str(l_notas_num)
print(l_notas_AS)
