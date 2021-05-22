package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double l1, l2, l3, area, x, h;
        
        System.out.println("Introduzca la medida de los lados del triángulo: ");
        System.out.print("-Lado 1: ");
        l1 = entrada.nextFloat();
        System.out.print("-Lado 2: ");
        l2 = entrada.nextFloat();
        System.out.print("-Lado 3: ");
        l3 = entrada.nextFloat();
        
        if((l1 + l2 > l3) && (l2 + l3 > l1) && (l3 + l1 > l2)){
            x = (Math.pow(l3, 2)-Math.pow(l2,2)+Math.pow(l1,2))/(2*l1);
            h = Math.sqrt(Math.pow(l3,2)-Math.pow(x,2));
            area = (l1*h)/2;
            System.out.println("El área del triángulo cuyos lados miden " + l1 + ", " + l2 + " y " + l3 + " uds es de " + area + " uds cuadradas.");
        }
        else System.out.println("No se puede construir ese triéngulo.");
    }
}
