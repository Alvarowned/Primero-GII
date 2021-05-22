def suma_i(a,b,c,d):
    """float,float,float,float -> none
       OBJ: hacer una suma de números complejos, en el que (a+bi)+(c+di)."""
    print("(a+bi)+(c+di) = " + str((a+c)) + "+" + str((b+d)) + "i")

def resta_i(a,b,c,d):
    """float,float,float,float -> none
       OBJ: hacer una suma de números complejos, en el que (a+bi)-(c+di)."""
    print("(a+bi)-(c+di) = " + str((a-c)) + "+" + str((b-d)) + "i")

def producto_i(a,b,c,d):
    """float,float,float,float -> none
       OBJ: hacer una suma de números complejos, en el que (a+bi)*(c+di)."""
    print("(a+bi)*(c+di) = " + str((a*c-b*d)) + "+" + str((a*d+b*c)) + "i")

def division_i(a,b,c,d):
    """float,float,float,float -> none
       OBJ: hacer una suma de números complejos, en el que (a+bi)/(c+di)."""
    if c**2+d**2 != 0:
        print("(a+bi)/(c+di) = " + str((a*c+b*d)/(c**2+d**2)) + "+" + str((b*c-a*d)/(c**2+d**2)) + "i")
    else:
        print("El resultado de (a+bi)/(c+di) es inexistente.")

#Prueba
print("Este programa le va a pedir dos números complejos en formato a+bi y c+di.\n")

a = float(input("Introduzca el valor a: "))
b = float(input("Introduzca el valor b: "))
c = float(input("Introduzca el valor c: "))
d = float(input("Introduzca el valor d: "))

print(suma_i(a,b,c,d))
print(resta_i(a,b,c,d))
print(producto_i(a,b,c,d))
print(division_i(a,b,c,d))

input("\nPulsar intro para cerrar el programa.")
