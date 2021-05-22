def calculo_TIEA(TNA,m,n):
    """float,int,int -> float
       OBJ: Calcular la TIEA a partir de la TNA, el numero de períodos de capitalización y el número de periodos total en un año"""
    TIEA = (1+ (TNA/m))**(n-1)
    return TIEA

#Probador
TNA = float(input("Introduzca su tasa de nómina anual: "))
m = int(input("Introduzca el número entero de periodos de capitalización: "))
n = int(input("Introduzca el número de periodos total en un año: "))

print("Su Tasa de Interés Efectivo Anual es de", calculo_TIEA(TNA,m,n),"euros.")

input("\nPulse intro para finalizar el programa.")
