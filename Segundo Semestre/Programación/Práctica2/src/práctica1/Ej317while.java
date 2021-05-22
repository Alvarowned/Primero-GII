package práctica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej317while {
    public static void main(String args[]) throws IOException {
        int total = 0;
        float media;
        String nota = "d";
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        // inicialización de variables
        while(!"F".equals(nota)) {
            System.out.println("\nTeclee calificación (A,B,C,D,E,F): ");
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