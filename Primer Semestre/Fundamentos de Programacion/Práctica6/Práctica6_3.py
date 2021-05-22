def divis_recursiva(a,b,x,y):
    """int,int -> int
       OBJ: Calcular el cociente de a y b recursivamente.
       PRE: x debe ser igual a 0 e y debe ser igual a a."""
    if(b < 0):
        b = -b
        a = -a
        y = -y
    if(abs(a) < b):
        if(y > 0):
            return x
        else:
            return -x
    else:
        return divis_recursiva(abs(a)-b,b,x+1,y)

a = int(input("Introduzca el primer número: "))
b = int(input("Introduzca el segundo número: "))
print(a,"//",b,"=",divis_recursiva(a,b,0,a))
