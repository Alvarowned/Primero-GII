package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num, cont = 0;
        
        System.out.print("Introduzca un número entero positivo: ");
        num = entrada.nextInt();
        
        if(num == 0 || num == 1){
            System.out.println("El " + num + " es un número 'especial', ya que no se considera ni primo ni compuesto.");
        }
        else if(num < 0){
            System.out.println("El número introducido no es válido.");
        }
        else{
            for(int i = 2; i < num; i++){
                if(num%i == 0) cont += 1;
            }
            if(cont == 0) System.out.println("El número " + num + " es un número primo.");
            else System.out.println("El número " + num + " es un número compuesto.");
        }
    }
}