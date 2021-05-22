EUR = float(input("Introduzca la cantidad de euros a cambiar: "))
cambio_dia = float(input("Introduzca el cambio del día de euros a libras esterlinas: "))

GBP = EUR * cambio_dia
GBP_con_tasa = GBP * 0.98
print("El equivalente de esa cantidad de euros en libras esterlinas, \
teniendo en cuenta la tasa de cambio, sería de", str(GBP_con_tasa) + ".")

input("\nIntroduce cualquier letra para finalizar el programa: ")
