import Biblio_5

print("Persona 1:")
pers1 = Biblio_5.escribir_datos()
print("\nPersona 2:")
pers2 = Biblio_5.escribir_datos()
print("\nPersona 3:")
pers3 = Biblio_5.escribir_datos()
print("\nPersona 4:")
pers4 = Biblio_5.escribir_datos()
print("\nPersona 5:")
pers5 = Biblio_5.escribir_datos()
print("\nPersona 6:")
pers6 = Biblio_5.escribir_datos()
print("\nPersona 7:")
pers7 = Biblio_5.escribir_datos()
print("\nPersona 8:")
pers8 = Biblio_5.escribir_datos()
print("\nPersona 9:")
pers9 = Biblio_5.escribir_datos()
print("\nPersona 10:")
pers10 = Biblio_5.escribir_datos()

media_edad = (pers1.edad+pers2.edad+pers3.edad+pers4.edad+pers5.edad+pers6.edad+pers7.edad+pers8.edad+pers9.edad+pers10.edad)/10
print("\nLa media de las edades de las 10 personas es",str(media_edad) + ".")

nh = 0
sum_hombres = 0
for pers in (pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10):
    if(pers.sexo == "H"):
        sum_hombres += pers.edad
        nh += 1
if(nh != 0):
    media_hombres = sum_hombres/nh
else: media_hombres = 0

nm = 0
sum_mujeres = 0
for pers in (pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10):
    if(pers.sexo == "M"):
        sum_mujeres += pers.edad
        nm += 1
if(nm != 0):
    media_mujeres = sum_mujeres/nm
else: media_mujeres = 0

print("\nLa media de edad de los hombres es",media_hombres,"años, y la de las mujeres",media_mujeres,"años.")

nm = 0
sum_mujeres_rango = 0
for pers in (pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10):
    if(pers.sexo == "M" and 13 <= pers.edad <= 16):
        sum_mujeres_rango += pers.edad
        nm += 1
if(nm != 0):
    media_mujeres_rango = sum_mujeres_rango/nm
else: media_mujeres_rango = 0

print("\nLa media de las edades de las mujeres entre 13 y 16 años son", media_mujeres_rango,"años.")

nh = 0
sum_hombres_men_veinte = 0
for pers in (pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10):
    if(pers.sexo == "H" and pers.edad <= 20):
        sum_hombres_men_veinte += pers.edad
        nh += 1
if(nh != 0):
    media_hombres_men_veinte = sum_hombres_men_veinte/nh
else: media_hombres_men_veinte = 0

print("\nLa media de las edades de los hombres menores de 20 años es de",media_hombres_men_veinte,"años.")

menor_edad_H = 100000
menor_edad_M = 100000
menor_M = Biblio_5.Datos(-0,"M",-0)
menor_H = Biblio_5.Datos(-0,"H",-0)
for pers in (pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10):
    if(pers.sexo == "H" and int(pers.edad) < menor_edad_H):
        menor_H.num = pers.num
        menor_H.edad = pers.edad
        menor_edad_H = pers.edad
    if(pers.sexo == "M" and int(pers.edad) < menor_edad_M):
        menor_M.num = pers.num
        menor_M.edad = pers.edad
        menor_edad_M = pers.edad

print("\nLos datos del hombre de menor edad son:")
Biblio_5.leer_datos(menor_H)
print("\nLos datos de la mujer de menor edad son:")
Biblio_5.leer_datos(menor_M)
