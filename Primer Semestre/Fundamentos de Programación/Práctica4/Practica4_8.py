def son_iguales(cad1, cad2):
    """str,str -> bool
       OBJ: Comprueba si dos cadenas de carácteres son iguales (no toma como diferencias las mayúsculas/minúsculas)."""
    cad1 = list(cad1)
    cad2 = list(cad2)
    term = cad1[0]
    while(term == " "):
        cad1.remove(" ")
        term = cad1[0]
    term = cad1[len(cad1)-1]
    while(term == " "):
        cad1.pop()
        term = cad1[len(cad1)-1]
    term = cad2[0]
    while(term == " "):
        cad2.remove(" ")
        n += 1
        term = cad2[0]
    term = cad2[len(cad2)-1]
    while(term == " "):
        cad2.pop()
        term = cad2[len(cad2)-1]
    return "".join(cad1).upper() == "".join(cad2).upper()
            
        

#Probador
cad1 = str(input("Introduzca una cadena de carácteres: "))
cad2 = str(input("Introduzca otra cadena de carácteres: "))
if(son_iguales(cad1,cad2)):
    print("Las dos cadenas de carácteres son iguales.")
else:
    print("Las dos cadenas de carácteres son distintas.")
