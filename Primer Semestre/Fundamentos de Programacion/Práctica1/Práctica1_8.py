texto_numerico = "45"
int(texto_numerico)  #Si deja llevar a cabo esta conversión, al ser un texto numérico

int("Hola") #No puede llevar a cabo el cambio de tipo, al ser un string no numérico

int(3.999999)  #Al ser un valor de tipo float al pasarlo a tipo int, simplemente coge la parte entera del número

float(34)   #Al ser un valor de tipo int, simplemente le añadirá los decimales .00
