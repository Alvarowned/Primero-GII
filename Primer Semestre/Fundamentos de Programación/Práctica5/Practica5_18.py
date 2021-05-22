def endict_noendict(dic,l):
    """dict,list -> list,list
       OBJ: Generar dos listas, una con los elementos del dict que están en la primera lista y otra con los que no están."""
    l_si = []
    l_no = []
    for key in dic.keys():
        if key in l:
            l_si.append(key)
        else:
            l_no.append(key)
    return l_si, l_no

#Prueba
dic = {"Susan": 2, "Manolo": 4, "Pepe": 1, "Kike": 89}
l = ["Pepe", "Manolo"]
l_si, l_no = endict_noendict(dic,l)
print(l_si)
print(l_no)
