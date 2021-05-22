def Fibonacci(term):
    """int -> int
       OBJ: Calcula un término dado de la sucesión de Fibonacci."""
    if(term == 1):
        return 0
    elif(term == 2):
        return 1
    else:
        return Fibonacci(term-1) + Fibonacci(term-2)

#Probador
term = int(input("Introduzca el término de la sucesión de Fibonacci del cual quiere conocer su valor: "))
print("El valor de ese término de la sucesión es:", Fibonacci(term))
