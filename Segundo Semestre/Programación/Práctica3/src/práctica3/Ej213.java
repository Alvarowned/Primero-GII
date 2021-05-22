package práctica3;

import java.util.Scanner;

public class Ej213 {
    public static Scanner entrada = new Scanner(System.in);
    public static String dni_l,nif_l;
    public static int dni_n;
    public static boolean conf = false;
    
    public static void main(String[] args) {
        pedirDni();
        calculoNifLetra();
        
        System.out.println("Su NIF es: " + dni_n + "-" + nif_l + ".");
    }
    
    public static void pedirDni(){
        while(!conf){
            System.out.print("Introduzca la parte númerica de su DNI: ");
            dni_n = entrada.nextInt();
            if(dni_n > 99999999){
                System.err.println("Número de DNI no válido.");
                continue;
            }
            entrada.nextLine();
            System.out.print("Introduzca la letra de su DNI: ");
            dni_l = entrada.nextLine();
            System.out.print("¿Es " + dni_n + "-" + dni_l + " su DNI? (y = si; n = no) ");
            if("y".equals((entrada.nextLine()).toLowerCase())){
                conf = true;
            }
        }
    }
    
    public static void calculoNifLetra(){
        String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        nif_l = letras[dni_n%23];
    }
}
