package práctica1;

import java.util.Scanner;
import java.util.Locale;

public class Ej242 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numi;
        float num,numf;
        
        System.out.print("Introduzca un número entero: ");
        num = entrada.nextFloat();
        
        numf = num/2;
        numi = (int)num/2;
        
        if(numi == numf) System.out.println("El número es par.");
        else if(numi != numf) System.out.println("El número es impar." + numi + numf);
        else if(num == 0) System.out.println("Este número es 0.");
    }
}
