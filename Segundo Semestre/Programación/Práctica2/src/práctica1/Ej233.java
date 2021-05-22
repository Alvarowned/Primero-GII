package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej233 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        float x1,y1,x2,y2;
        System.out.println("Introduzca X1: ");
        x1 = entrada.nextFloat();
        System.out.println("Introduzca Y1: ");
        y1 = entrada.nextFloat();
        System.out.println("Introduzca X2: ");
        x2 = entrada.nextFloat();
        System.out.println("Introduzca Y2: ");
        y2 = entrada.nextFloat();
        System.out.println("La pendiente de esa recta es " + (y2-y1)/(x2-x1));
    }
}
