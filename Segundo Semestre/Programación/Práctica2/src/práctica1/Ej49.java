package práctica1;

import java.util.Locale;
import java.util.Scanner;

public class Ej49 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num, primo = 0;
        boolean comp = true;

        System.out.print("Introduzca un número entero positivo: ");
        num = entrada.nextInt();

        for (int i = num; comp; i++) {
            comp = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    comp = true;
                }
            }
            if(!comp){
                primo = i;
            }
        }
        System.out.println("El primer número primo mayor o igual a " + num + " es " + primo + ".");
    }
}
