lado = int(input("Introduzca el número de asteriscos que tiene de lado el cuadrado: "))

print(lado*"*")

for i in range(1,lado-1):
    print("*" + (lado-2)*" " + "*")

print(lado*"*")
