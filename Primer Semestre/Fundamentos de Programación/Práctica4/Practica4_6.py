import Biblio_4

def es_palindromo(texto):
    """str -> bool
       OBJ: Comprobar si una palabra/texto es un palíndromo.
       PRE: No puede tener signos de puntuación ni tildes, solo espacios."""
    texto = texto.lower()
    l_pal = list(texto)
    n = 0
    while(n == 0):
        try:
            l_pal.remove(l_pal[l_pal.index(" ")])
        except: n = 1
    l_pal_alreves = Biblio_4.crear_lista_inversa(l_pal)
    return l_pal_alreves == l_pal

#Probador
texto = str(input("Introduzca su posible palíndromo: "))
pal = es_palindromo(texto)
if(pal):
    print("Esa palabra es un palíndromo.")
else:
    print("Esa palabra no es un palíndromo.")
