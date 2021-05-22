package práctica3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej322 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        int cont = 0;
        
        System.out.print("Introduzca una frase: ");
        frase = entrada.nextLine();
        StringTokenizer token = new StringTokenizer(frase);
        
        while(token.hasMoreTokens()){
            token.nextToken();
            cont += 1;
        }
        
        System.out.println("Hay " + cont + " palabras en esa frase.");
    }
    
}
