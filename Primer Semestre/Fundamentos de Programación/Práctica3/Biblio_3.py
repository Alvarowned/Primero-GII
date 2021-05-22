def multiplicacion(a,b):
    """int, int -> int
       OBJ: multiplicar sin usar el simbolo *."""
    c = 0
    if(a > 0 and b > 0):
        for b in range(1,b+1):
            c += a
    elif((a < 0 or b < 0) and (a > 0 or b > 0)):
        a = abs(a)
        b = abs(b)
        for b in range(1,b+1):
            c += a
        c = -c
    elif(a < 0 and b < 0):
        a = abs(a)
        b = abs(b)
        for b in range(1,b+1):
            c += a
    elif(a == 0 or b == 0):
        c = 0
    return c

def conversion(h, m):
    """int, int -> str
       OBJ: pasar de formato 24h a 12h.
       PRE: La variable h debe ser >0 y <25, y m debe ser >0 y <61."""
    if(h <= 12):
        x = str(h) + ":" + str(m) + " a.m."
    elif(h >= 13):
         x = str(h-12) + ":" + str(m) + " p.m."
    return x

def validar_entero(x):
    """any -> bool
       OBJ: Saber si un valor introducido es un int."""
    try:
        n = float(x)
        x = int(x)
        if(n == x):
            ent = True
        else:
            ent = False
    except: ent = False
    return ent

def validar_real(x):
    """any -> bool
       OBJ: Saber si un valor introducido es un número real."""
    try:
       x = float(x)
       real = True
    except: real = False
    return real

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

def orden_int(a,b,c):
    """int,int,int -> int,int,int
       OBJ: Ordenar tres numeros enteros en orden ascendente, de menor a mayor."""
    while((a > b) or (b > c)):
        if(a > b):
            x = a
            a = b
            b = x
        if(b > c):
            x = b
            b = c
            c = x
    return a,b,c

def leer_entero_validado():
    """none -> int
       OBJ: Solicita un entero al usuario, lo valida y lo retorna solo cuando se ha asegurado de que es un entero."""
    ent = False
    while(not ent):
        x = input("Introduzca un número entero: ")
        try:
            n = int(x)
            if(n == float(x)):
                ent = True
            else:
                raise
        except:
            print("Eso no es un entero.\n")
            ent = False
    x = int(x)
    return x

def n_a_mes(n):
    """int -> str
       OBJ: Indica el mes correspondiente a un número y si no corresponde a ninguno da error."""
    if(n == 1):
        mes = "Enero"
    elif(n == 2):
        mes = "Febrero"
    elif(n == 3):
        mes = "Marzo"
    elif(n == 4):
        mes = "Abril"
    elif(n == 5):
        mes = "Mayo"
    elif(n == 6):
        mes = "Junio"
    elif(n == 7):
        mes = "Julio"
    elif(n == 8):
        mes = "Agosto"
    elif(n == 9):
        mes = "Septiembre"
    elif(n == 10):
        mes = "Octubre"
    elif(n == 11):
        mes = "Noviembre"
    elif(n == 12):
        mes = "Diciembre"
    else:
        mes = "ERROR"
    return mes

