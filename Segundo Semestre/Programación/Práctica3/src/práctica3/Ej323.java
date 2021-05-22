package práctica3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej323 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        StringBuilder frase_r;
        
        System.out.print("Introduzca una frase: ");
        frase = entrada.nextLine();
        
        frase_r = girarFrase(frase);
        System.out.println(frase_r);
    }
    
    public static StringBuilder girarFrase(String str){
        StringTokenizer token = new StringTokenizer(str); 
        StringBuilder build = new StringBuilder();
        
        while(token.hasMoreElements()){
            build.insert(0, token.nextToken() + " ");
        }
        
        return build;
    }
}
