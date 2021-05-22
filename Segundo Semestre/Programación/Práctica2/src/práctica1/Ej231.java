package práctica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Ej231 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        float num;
        int red;
        System.out.println("Introduzca un número decimal: ");
        num = Float.parseFloat(entrada.readLine());
        red = Math.round(num);
        System.out.println("El número redondeado es " + red + ".");
    }
    
}
