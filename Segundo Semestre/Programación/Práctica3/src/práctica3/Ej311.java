package práctica3;

import java.util.Scanner;

public class Ej311 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String pal, pal_f;
        int n;
        
        System.out.print("Introduzca la palabra a modificar: ");
        pal = entrada.nextLine();
        
        System.out.print("Introduzca el número de carácteres que quiere mover: ");
        n = entrada.nextInt();
        
        while(pal.length() < n) n -= pal.length();
        
        pal_f = pal.substring(n) + pal.substring(0, n);
        
        System.out.println("La palabra sería " + pal_f + ".");
    }
}
