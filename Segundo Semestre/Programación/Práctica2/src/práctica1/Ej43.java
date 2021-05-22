package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        float l1, l2, l3;
        
        System.out.println("Introduzca la medida de los lados del triángulo: ");
        System.out.print("-Lado 1: ");
        l1 = entrada.nextFloat();
        System.out.print("-Lado 2: ");
        l2 = entrada.nextFloat();
        System.out.print("-Lado 3: ");
        l3 = entrada.nextFloat();
        
        if((l1 + l2 > l3) && (l2 + l3 > l1) && (l3 + l1 > l2)){
            System.out.println("Es posible construir ese triángulo.");
        }
        else System.out.println("No se puede construir ese triéngulo.");
    }
}
