km = float(input("Introduzca el número de km recorridos:"))
l_gasoil = float(input("Introduzca los litros de gasoil utilizados:"))
coste_gasoil_total = float(input("Introduzca el coste total del gasoil:"))
coste_mantenimiento = float(input("Introduzca el dinero gastado en mantenimiento del camión:"))

km_por_l = km / l_gasoil
print("Los km recorridos por litro de gasoil son", str(km_por_l) + ".")

coste_total = coste_gasoil_total + coste_mantenimiento
print("El coste total del viaje ha sido de", coste_total, "euros.")

coste_por_km = coste_total / km
print("El coste por km es de", coste_por_km, "euros.")

input("\nIntroduce cualquier letra para finalizar el programa:")
