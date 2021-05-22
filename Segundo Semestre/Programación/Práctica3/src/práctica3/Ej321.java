package práctica3;
 
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej321 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String num_t, elem;
        long rest_n;
        int pref_n;
        
        System.out.print("Introduzca su número de teléfono (en el formato xx-xxxxxxx): ");
        num_t = entrada.nextLine();
        
        StringTokenizer token = new StringTokenizer(num_t, "-");
        elem = token.nextToken();
        pref_n = Integer.parseInt(elem);
        
        elem = token.nextToken();
        rest_n = Long.parseLong(elem);
        
        System.out.println("El prefijo de tu comunidad es " + pref_n + ".");
        System.out.println("El resto de tu número de teléfono es " + rest_n + ".");
    } 
}
