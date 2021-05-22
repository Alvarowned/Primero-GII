package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num, total = 1;
        
        System.out.print("Introduzca un número entero: ");
        num = entrada.nextInt();
        
        for(int i = 2; i <= num; i++){
            total *= i;
        }
        
        System.out.println("El factorial de " + num + " es " + total + ".");
    }
}