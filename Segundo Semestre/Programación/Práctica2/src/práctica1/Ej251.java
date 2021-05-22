package práctica1;

import java.util.Scanner;
import java.util.Locale;

public class Ej251 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num;
        String frase;
        
        System.out.print("Introduzca lo que quiere repetir: ");
        frase = entrada.nextLine();
        System.out.print("Introduzca el número de veces a repetir: ");
        num = entrada.nextInt();
        
        for(int i = num; i > 0; i--){
            System.out.println(frase);
        }
    }
}
