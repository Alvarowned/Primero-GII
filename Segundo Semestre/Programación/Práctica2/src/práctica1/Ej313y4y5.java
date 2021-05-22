package práctica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej313y4y5 {
    public static void main(String args[]) throws IOException {
        int contador = 1, total = 0;
        float media;
        String nota;
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        // inicialización de variables
        for(int i = contador; i <= 5; i++) {
            System.out.println("\nTeclee calificación (A,B,C,D,E): ");
            nota = (entrada.readLine()).toUpperCase();
            switch (nota) {
                case "A" :
                    total += 4;
                    break;
                case "B":
                    total += 3;
                    break;
                case "C":
                    total += 2;
                    break;
                case "D":
                    total += 1;
                    break;
                case "E":
                    total += 0;
                    break;
                default:
                    break;
            }
        }
        media = (float)total / 5;
        System.out.println("\n\nEl promedio del grupo es: " + media);
    }
}