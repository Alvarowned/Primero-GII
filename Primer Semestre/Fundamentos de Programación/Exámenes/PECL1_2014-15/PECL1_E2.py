lista_n = []
lista_ordenada_crec = []
lista_ordenada_desc = []
for i in range(10):
    x = int(input("Introduzca un número entero: "))
    lista_n.append(x)
    lista_ordenada_crec.append(x)
    lista_ordenada_desc.append(x)

lista_ordenada_crec.sort()
lista_ordenada_desc.sort()
lista_ordenada_desc.reverse()

if(lista_n == lista_ordenada_crec):
    print("Esos números están ordenados de forma creciente.")
elif(lista_n == lista_ordenada_desc):
    print("Esos números están ordenados de forma descendente.")
else:
    print("Esos números no están ordenados.")
