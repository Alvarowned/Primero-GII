package práctica1;

import java.util.Scanner;
import java.util.Locale;

public class Ej253 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int n;
        
        System.out.print("Introduzca un entero: ");
        n = entrada.nextInt();
        
        for(int i = n; i > 0; i--){
            System.out.println();
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
