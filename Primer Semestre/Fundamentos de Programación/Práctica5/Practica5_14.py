import random

def crear_QR():
    """none -> none
       OBJ: Crear un QR totalmente aleatorio."""
    QR = [[0]*21]*21
    for i in range(21):
        for j in range(21):
            x = random.randint(1,2)
            if(x == 1):
                QR[i][j] = "*"
            else: QR[i][j] = " "
    for i in range(21):
        for j in range(21):
            if(j < 20):
                print(QR[i][j], end="")
            else: print(QR[i][j])
            
crear_QR()


            
            
    
