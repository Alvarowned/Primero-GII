package práctica3;

import java.util.Scanner;
import java.util.Locale;

public class Ej145 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double n1, n2;
        String op;

        System.out.print("Introduzca el primer operando: ");
        n1 = entrada.nextDouble();
        System.out.print("Introduzca el segundo operando: ");
        n2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Introduzca la operación a realizar (+,-,*,/): ");
        op = entrada.nextLine();

        calculadora(n1, n2, op);
    }

    public static void calculadora(double n1, double n2, String op) {
        switch (op) {
            case "+":
                System.out.println("La suma de los dos números es " + n1 + "+" + n2 + " = " + (n1 + n2) + ".");
                break;
            case "-":
                System.out.println("La resta de los dos números es " + n1 + "-" + n2 + " = " + (n1 - n2) +".");
                break;
            case "*":
                System.out.println("La multiplicación de los dos números es " + n1 + "*" + n2 + " = " + (n1 * n2) + ".");
                break;
            case "/":
                System.out.println("La división entre los dos números es " + n1 + "/" + n2 + " = " + (n1 / n2) + ".");
                break;
            default:
                System.err.println("Ese carácter no es válido.");
                break;
        }
    }
}
