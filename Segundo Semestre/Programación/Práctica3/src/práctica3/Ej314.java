package práctica3;

import java.util.Scanner;

public class Ej314 {

    public static Scanner entrada = new Scanner(System.in);
    public static int nif_n;
    public static String nif_l;
    
    public static void main(String[] args) {
        pedirNif();

        if (nif_l.equals(calculoNifLetra(nif_n))) {
            System.out.println("La letra de su NIF es correcta.");
        } else {
            System.out.println("La letra de su NIF es incorrecta, debería ser la " + calculoNifLetra(nif_n) + ".");
        }
    }

    public static void pedirNif() {
        boolean conf = false;
        
        while (!conf) {
            System.out.print("Introduzca la parte númerica de su NIF: ");
            nif_n = entrada.nextInt();
            if (nif_n > 99999999) {
                System.err.println("Número de NIF no válido.");
                continue;
            }
            entrada.nextLine();
            System.out.print("Introduzca la letra de su NIF: ");
            nif_l = entrada.nextLine();
            System.out.print("¿Es " + nif_n + "-" + nif_l + " su NIF? (y = si; n = no) ");
            if ("y".equals((entrada.nextLine()).toLowerCase())) {
                conf = true;
            }
        }
    }

    public static String calculoNifLetra(int nif_n) {
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return letras[nif_n % 23];
    }
}
