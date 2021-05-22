package práctica1;

import java.util.Random;

public class Ej261 {
    public static void main(String[] args) {
        Random rand = new Random();
        float ventas[][] = new float[2][12],total = 0;
        
        for(int i = 0; i < 12; i++) ventas[0][i] = ((float)rand.nextInt(501))+1000;
        for(int i = 0; i < 12; i++) ventas[1][i] = ((float)rand.nextInt(6) / 10) + 1;
        for(int i = 0; i < 12; i++) total += (ventas[0][i]) * (ventas[1][i]);
        System.out.println("El total de las ventas del año es " + total + ".");
    }
}