def multipl_recursiva(a,b,x):
    """float,float -> float
       OBJ: Calcular el producto de a y b recursivamente.
       PRE: x debe ser igual que a."""
    if(b < 0):
        b = -b
        a = -a
        x = -x
    if(b == 1):
        return a
    else:
        return multipl_recursiva(a+x,b-1,x)

a = float(input("Introduzca el primer número: "))
b = float(input("Introduzca el segundo número: "))
print(a,"x",b,"=",multipl_recursiva(a,b,a))
