def conversion(h, m):
    """int, int -> str
       OBJ: pasar de formato 24h a 12h.
       PRE: La variable h debe ser >0 y <25, y m debe ser >0 y <61."""
    if(h <= 12):
        x = str(h) + ":" + str(m) + " a.m."
    elif(h >= 13):
         x = str(h-12) + ":" + str(m) + " p.m."
    return x

h = int(input("Introduzca las horas: "))
m = int(input("Introduzca los minutos: "))
while((h<1 or h>24) or (m<1 or m>59)):
    print("Error al introducir los valores.")
    h = int(input("\nIntroduzca las horas: "))
    m = int(input("Introduzca los minutos: "))

print("Las", str(h) + ":" + str(m), "son equivalentes a las", conversion(h,m))

input("Pulse intro para cerrar el programa.")
