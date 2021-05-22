package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num_ini, num, cifras = 1;
        
        System.out.print("Introduzca un número entero: ");
        num_ini = entrada.nextInt();
        num = num_ini;
        
        while(num > 9){
            num = num/10;
            cifras++;
        }
        
        System.out.println("El número " + num_ini + " tiene " + cifras + " cifras.");
    }
}
