package práctica3;

import java.util.Scanner;

public class Ej143 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Introduzca un número: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca otro número: ");
        n2 = entrada.nextInt();
        
        if(n1 == n2) System.out.println("Los dos números son iguales.");
        else System.out.println("El número mayor es " + mayor(n1, n2) + ".");
    }
    
    public static int mayor(int n1, int n2){
        if(n1 < n2){
            return n2;
        }
        else return n1;
    }
}
