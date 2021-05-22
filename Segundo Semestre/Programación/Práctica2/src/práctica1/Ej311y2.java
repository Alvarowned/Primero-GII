package práctica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej311y2 {
    public static void main(String args[]) throws IOException {
        int contador = 1, total = 0, media;
        String nota;
        //Objeto para leer una cadena del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        // inicialización de variables
        while (contador <= 5) {
            System.out.println("\nTeclee calificación (A,B,C,D,E): ");
            nota = entrada.readLine();
            if (nota.equals("A")) {
                total += 4;
            } else if (nota.equals("B")) {
                total += 3;
            } else if (nota.equals("C")) {
                total += 2;
            } else if (nota.equals("D")) {
                total += 1;
            } else if (nota.equals("E")) {
                total += 0;
            }
            contador++;
        }
        media = total / 5;
        System.out.println("\n\nEl promedio del grupo es: " + media);
    }
}