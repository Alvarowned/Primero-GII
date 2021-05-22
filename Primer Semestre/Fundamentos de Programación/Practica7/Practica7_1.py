class Fecha:
    def __init__(self,dia,mes,año):
        self.dia = dia
        self.mes = mes
        self.año = año

n = int(input("¿Cuántas fechas desea introducir?: "))
fechas = []
for i in range(n):
    print("\nFecha", str(i+1) + ":")
    dia = input("Introduzca el día: ")
    mes = input("Introduzca el mes: ")
    año = input("Introduzca el año: ")
    fecha = Fecha(dia,mes,año)
    fechas.append(fecha)

busq = 0
while(busq != "FIN"):
    busq = input("\n¿Desea buscar una fecha por año (introduzca '1'), por mes(introduzca '2'), por día (introduzca '3'), o terminar (introduzca 'FIN')?: ")
    if(busq == "1"):
        año_busc = input("¿Cuál es el año a buscar?: ") #Año
        for pasada in range(len(fechas)-1,0,-1): #Método de ordenación por burbuja por año
            for paso in range(pasada):
                if fechas[paso].año > fechas[paso+1].año:
                    fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
                elif fechas[paso].año == fechas[paso+1].año:
                    if fechas[paso].mes > fechas[paso+1].mes:
                        fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
                    elif fechas[paso].mes == fechas[paso+1].mes:
                        if fechas[paso].dia > fechas[paso+1].dia:
                            fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
        for paso in range(len(fechas)-1,0,-1): #Eliminar fechas repetidas por año
            if fechas[paso].año == fechas[paso-1].año:
                if fechas[paso].mes == fechas[paso-1].mes:
                    if fechas[paso].dia == fechas[paso-1].dia:
                        fechas.remove(fechas[paso])
        ini = 0 #Búsqueda binaria por año
        fin = len(fechas)-1
        posicion = -1
        while(ini <= fin):
            centro = (ini + fin)//2
            if(fechas[centro].año < año_busc):
                ini = centro + 1
            elif(fechas[centro].año > año_busc):
                fin = centro - 1
            else:
                posicion = centro
                fin = -3
                try:
                    while(fechas[posicion].año == fechas[centro].año):
                        print("Una fecha buscada es", str(fechas[posicion].dia) + "/" + str(fechas[posicion].mes) + "/" + str(fechas[posicion].año) + ".")
                        posicion += 1
                except: x = 0
                posicion = centro - 1
                try:
                    while(fechas[posicion].año == fechas[centro].año):
                        print("Una fecha buscada es", str(fechas[posicion].dia) + "/" + str(fechas[posicion].mes) + "/" + str(fechas[posicion].año) + ".")
                        posicion -= 1
                except: x = 0
                posicion = centro
        if(posicion == -1):
            print("No se ha encontrado ninguna fecha con ese año.")
    elif(busq == "2"): #Mes
        mes_busc = input("¿Cuál es el mes a buscar?: ")
        for pasada in range(len(fechas)-1,0,-1): #Método de ordenación por burbuja por mes
            for paso in range(pasada):
                if fechas[paso].mes > fechas[paso+1].mes:
                    fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
                elif fechas[paso].mes == fechas[paso+1].mes:
                    if fechas[paso].año > fechas[paso+1].año:
                        fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
                    elif fechas[paso].año == fechas[paso+1].año:
                        if fechas[paso].dia > fechas[paso+1].dia:
                            fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
        for paso in range(len(fechas)-1,0,-1): #Eliminar fechas repetidas por mes
            if fechas[paso].mes == fechas[paso-1].mes:
                if fechas[paso].año == fechas[paso-1].año:
                    if fechas[paso].dia == fechas[paso-1].dia:
                        fechas.remove(fechas[paso])
        ini = 0 #Búsqueda binaria por mes
        fin = len(fechas)-1
        posicion = -1
        while(ini <= fin):
            centro = (ini + fin)//2
            if(fechas[centro].mes < mes_busc):
                ini = centro + 1
            elif(fechas[centro].mes > mes_busc):
                fin = centro - 1
            else:
                posicion = centro
                fin = -3
                try:
                    while(fechas[posicion].mes == fechas[centro].mes):
                        print("Una fecha buscada es", str(fechas[posicion].dia) + "/" + str(fechas[posicion].mes) + "/" + str(fechas[posicion].año) + ".")
                        posicion += 1
                except: x = 0
                posicion = centro - 1
                try:
                    while(fechas[posicion].mes == fechas[centro].mes):
                        print("Una fecha buscada es", str(fechas[posicion].dia) + "/" + str(fechas[posicion].mes) + "/" + str(fechas[posicion].año) + ".")
                        posicion -= 1
                except: x = 0
                posicion = centro
        if(posicion == -1):
            print("No se ha encontrado ninguna fecha con ese mes.")
    elif(busq == "3"): #Día
        dia_busc = input("¿Cuál es el día a buscar?: ")
        for pasada in range(len(fechas)-1,0,-1): #Método de ordenación por burbuja por día
            for paso in range(pasada):
                if fechas[paso].dia > fechas[paso+1].dia:
                    fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
                elif fechas[paso].dia == fechas[paso+1].dia:
                    if fechas[paso].año > fechas[paso+1].año:
                        fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
                    elif fechas[paso].año == fechas[paso+1].año:
                        if fechas[paso].mes > fechas[paso+1].mes:
                            fechas[paso],fechas[paso+1] = fechas[paso+1],fechas[paso]
        for paso in range(len(fechas)-1,0,-1): #Eliminar fechas repetidas por dia
            if fechas[paso].dia == fechas[paso-1].dia:
                if fechas[paso].año == fechas[paso-1].año:
                    if fechas[paso].mes == fechas[paso-1].mes:
                        fechas.remove(fechas[paso])
        ini = 0 #Búsqueda binaria por dia
        fin = len(fechas)-1
        posicion = -1
        while(ini <= fin):
            centro = (ini + fin)//2
            if(fechas[centro].dia < dia_busc):
                ini = centro + 1
            elif(fechas[centro].dia > dia_busc):
                fin = centro - 1
            else:
                posicion = centro
                fin = -3
                try:
                    while(fechas[posicion].dia == fechas[centro].dia):
                        print("Una fecha buscada es", str(fechas[posicion].dia) + "/" + str(fechas[posicion].mes) + "/" + str(fechas[posicion].año) + ".")
                        posicion += 1
                except: x = 0
                posicion = centro - 1
                try:
                    while(fechas[posicion].dia == fechas[centro].dia):
                        print("Una fecha buscada es", str(fechas[posicion].dia) + "/" + str(fechas[posicion].mes) + "/" + str(fechas[posicion].año) + ".")
                        posicion -= 1
                except: x = 0
                posicion = centro
        if(posicion == -1):
            print("No se ha encontrado ninguna fecha con ese día.")
