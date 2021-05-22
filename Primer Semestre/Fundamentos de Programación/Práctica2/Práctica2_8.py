def km_hm(km):
    """float -> float
       OBJ: Convertir de km a hm"""
    hm = km*10
    return hm

def km_dm(km):
    """float -> float
       OBJ: Convertir de km a dm"""
    dm = km*10000
    return dm

def km_m(km):
    """float -> float
       OBJ: Convertir de km a m"""
    m = km*1000
    return m

#Probador
km = float(input("Introduzca los km a convertir: "))
print("Esa cantidad es equivalente a",km_hm(km),"hm,",km_dm(km),"dm o",km_m(km),"m.")

input("Pulse intro para cerrar el programa.")
