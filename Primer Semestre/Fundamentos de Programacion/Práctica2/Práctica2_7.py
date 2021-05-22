def segundos_transc_medianoche(h,m,s):
    """int,int,int -> int
       OBJ: Calcular el número de segundos transcurridos desde la última medianoche a partir de la hora, minutos y segundos actuales."""
    s_transcurridos = h*3600+m*60+s
    return s_transcurridos

#Prueba
print("En este programa se le van a pedir las horas, minutos y segundos por separado, en formato 24 horas.")

h = int(input("Introduzca la hora actual: "))
m = int(input("Introduzca el minuto actual: "))
s = int(input("Introduzca el segundo actual: "))

print("Los segundos transcurridos desde la última medianoche son", str(segundos_transc_medianoche(h,m,s)) + ".")

input("\nPulse intro para finalizar el programa.")
