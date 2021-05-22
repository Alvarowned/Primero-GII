n = int(input("Introduzca el número que quiere saber en letra: "))

n0 = n % 10
n1 = n // 10

if(n0 == 1):
    n0 = "uno"
elif(n0 == 2):
    n0 = "dos"
elif(n0 == 3):
    n0 = "tres"
elif(n0 == 4):
    n0 = "cuatro"
elif(n0 == 5):
    n0 = "cinco"
elif(n0 == 6):
    n0 = "seis"
elif(n0 == 7):
    n0 = "siete"
elif(n0 == 8):
    n0 = "ocho"
elif(n0 == 9):
    n0 = "nueve"

if(n1 == 1):
    n1 = "diez"
elif(n1 == 2):
    n1 = "veinte"
elif(n1 == 3):
    n1 = "treinta"
elif(n1 == 4):
    n1 = "cuarenta"
elif(n1 == 5):
    n1 = "cincuenta"
elif(n1 == 6):
    n1 = "sesenta"
elif(n1 == 7):
    n1 = "setenta"
elif(n1 == 8):
    n1 = "ochenta"
elif(n1 == 9):
    n1 = "noventa"

if(n0!=0 and n1!=0):
    print("El número que ha introducido es el", n1, "y", n0 + ".")
elif(n0==0 and n1!=0):
    print("El número que ha introducido es el", n1 + ".")
elif(n1==0 and n0!=0):
    print("El número que ha introducido es el", n0 + ".")
elif(n0==0 and n1==0):
    print("El número que ha introducido es el cero.")
