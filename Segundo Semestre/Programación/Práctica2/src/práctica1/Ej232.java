package práctica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej232 {
    public static void main(String[] args) throws IOException {
        float radio;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Introduzca el radio de la circunferencia: ");
        radio = Float.parseFloat(entrada.readLine());
      
        System.out.println("La longitud de la circunferencia es de " + 2*Math.PI*radio + " ud.");
        System.out.println("El área de la circunferencia es de " + Math.PI*radio*radio + " ud cuadradas.");
    }
}