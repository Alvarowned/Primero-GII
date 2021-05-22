print("Este programa leerá las palabras que introduzca (con un límite de 25 carácteres) hasta que introduzca FIN.")

pal = " "
long = [0]*25
while(pal != "FIN"):
    pal = str(input("Introduzca una palabra: "))
    if(pal == "FIN"):
        print("Final de cuenta.")
    elif(len(pal) > 25):
        print("Palabra demasiado larga.")
    elif(len(pal) <= 25):
        long[len(pal)-1] += 1

for term in range(len(long)):
    print("Palabras longitud", str(term + 1) + ":", long[term])
