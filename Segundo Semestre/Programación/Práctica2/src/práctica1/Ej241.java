package práctica1;

import java.util.Scanner;
import java.util.Locale;

public class Ej241 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        float n1,n2;
        
        System.out.println("Introduzca un número: ");
        n1 = entrada.nextFloat();
        System.out.println("Introduzca otro número: ");
        n2 = entrada.nextFloat();
        
        if(n1 < n2) System.out.println("El menor es " + n1 + " y el mayor " + n2 + ".");
        else if(n1 > n2) System.out.println("El menor es " + n2 + " y el mayor " + n1 + ".");
        else System.out.println("Los dos números son iguales.");
    }
}
