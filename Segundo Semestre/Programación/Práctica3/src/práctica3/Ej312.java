package práctica3;

import java.util.Scanner;

public class Ej312 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena, letra_S = "";
        char letra = 1;
        int cont = 0;
        
        System.out.print("Introduzca una palabra: ");
        cadena = entrada.nextLine().toLowerCase();
        while(letra_S.length() != 1){
            System.out.print("Introduzca una letra: ");
            letra_S = entrada.nextLine().toLowerCase();
            if(letra_S.length() != 1) System.err.println("Eso no es una letra.");
            letra = letra_S.charAt(0);
        }
        
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == letra) cont += 1;
        }
        
        System.out.println("La letra '" + letra_S.toUpperCase() + "' aparece " + cont + " veces en la palabra '" + cadena + "'.");
    }
}
