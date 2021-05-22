ingreso_tot = float(input("Introduzca sus ingresos anuales totales:"))
n_hijos = int(input("Introduzca el numero de hijos que tiene:"))
ingreso_imp = ingreso_tot - 600 - n_hijos*60
impuesto = ingreso_imp/3
print("Su impuesto a pagar es: ", impuesto)

input("\nIntroduce cualquier letra para finalizar el programa:")
