def agregaPreferencia(dicc,pers,pref):
    """dict,str,str -> none
       OBJ: Añadir la preferencia de una persona al diccionario."""
    if pers not in dicc.keys():
        dicc[pers] = [pref]
    elif pers in dicc.keys():
        if pref not in dicc[pers]:
            dicc[pers].append(pref)

#Prueba
dicc = {"Manolo": ["Correr"]}
pers = "Manolo"
pref = "Correr"
agregaPreferencia(dicc, pers, pref)
print(dicc[pers])

#Prueba
dicc = {"Manolo": ["Correr"]}
pers = "Manolo"
pref = "Nadar"
agregaPreferencia(dicc, pers, pref)
print(dicc[pers])

#Prueba
dicc = {"Manolo": ["Correr"]}
pers = "Paco"
pref = "Nadar"
agregaPreferencia(dicc, pers, pref)
print(dicc[pers])
