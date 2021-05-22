package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num, total = 0;
        
        System.out.print("Introduzca un número entero: ");
        num = entrada.nextInt();
        
        for(int i = 1; i <= num; i++){
            total += i;
        }
        
        System.out.println("El sumatorio de los números enteros desde 0 hasta " + num + " es " + total + ".");
    }
}
