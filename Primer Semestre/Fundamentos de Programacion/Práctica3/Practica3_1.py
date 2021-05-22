compra = float(input("Introducir el dinero gastado en la compraen euros: "))
modo = input("Introducir el modo de pago ('Efectivo' o 'Tarjeta'): ")
if(compra > 0):
    if(compra > 100):
        if(modo == "Efectivo"):
            print("Se aplica un descuento del 5%, el importe a pagar es", compra*0.95, "euros.")
        elif(modo == "Tarjeta"):
            print("Se aplica un descuento del 2%, el importe a pagar es", compra*0.98, "euros.")
        else:
            print("Error en el modo.")
    else:
        print("No se aplica descuento, el importe a pagar es", compra, "euros.")
else:
    print("Error en el valor del importe.")

input("Pulse enter para finalizar el programa.")
