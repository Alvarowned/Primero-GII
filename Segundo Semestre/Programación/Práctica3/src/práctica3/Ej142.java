package práctica3;

import java.util.Scanner;

public class Ej142 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduzca un número: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca otro número: ");
        num2 = entrada.nextInt();

        rango(num1, num2);
    }

    public static void rango(int n1, int n2) {
        int n;
        if (n1 > n2) {
            n = n1;
            n1 = n2;
            n2 = n;
        }
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
