print("Este programa leerá palabras hasta que introduzca 'Fin'.")
long_dic = {}

pal = "0"
while(pal != "Fin"):
    pal = str(input("Introduzca una palabra: "))
    if str(len(pal)) not in long_dic:
        long_dic[str(len(pal))] = 1
    elif(pal == "Fin"): c = 0       #c no es nada, solo es para poder tener el elif, y que no tome Fin como otra palabra
    else: long_dic[str(len(pal))] += 1

lista_keys = long_dic.keys()
lista_keys = list(lista_keys)
lista_keys.sort()

for key in lista_keys:
    print("Palabras longitud", str(key) + ": ", long_dic[key])
