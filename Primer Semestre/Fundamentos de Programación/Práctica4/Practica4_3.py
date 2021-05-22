import Biblio_4

l1_ordenada = Biblio_4.crear_lista_nterm_float(20)

l1_ordenada.sort()
l1_inversa = []
long = len(l1_ordenada)

for term in range(long):
    l1_inversa.append(l1_ordenada[long-1-term])

print("Lista ordenada: ",l1_ordenada)
print("Lista inversa: ",l1_inversa)
