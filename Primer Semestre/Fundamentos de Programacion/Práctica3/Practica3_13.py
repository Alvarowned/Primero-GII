x = False
while(not x):
    dia = input("Introduzca el dia del cual quiere saber su menú: ")
    if(dia == "L" or dia == "M" or dia == "X" or dia == "J" or dia == "V" or dia == "S" \
       or dia == "D"):
        x = True
    else:
        print("ERROR: Eso no es un día válido.\n")
        x = False

if(dia == "L"):
    print("El menú del lunes es ensalada y carne.")
elif(dia == "M"):
    print("El menú del martes es guisantes y pescado.")
elif(dia == "X"):
    print("El menú del miércoles son judías blancas.")
elif(dia == "J"):
    print("El menú del jueves es pizza.")
elif(dia == "V"):
    print("El menú del viernes es verdura y filete de pollo.")
elif(dia == "S"):
    print("El menú del sábado es hamburguesa.")
elif(dia == "D"):
    print("El menú del domingo es cocido.")

input("\nPulse enter para cerrar el programa.")
