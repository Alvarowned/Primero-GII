print("En este programa se le van a pedir las horas, minutos y segundos por separado, en formato 24 horas.")

horas = int(input("Introduzca la hora actual:"))
minutos = int(input("Introduzca el minuto actual:"))
segundos = int(input("Introduzca el segundo actual:"))

segundos_transcurridos = horas*3600+minutos*60+segundos
print("Los segundos transcurridos desde la última medianoche son", str(segundos_transcurridos) + ".")

segundos_restantes = 86400 - segundos_transcurridos
print("Los segundos que quedan para la próxima medianoche son", str(segundos_restantes) + ".")

input("\nIntroduce cualquier letra para finalizar el programa:")
