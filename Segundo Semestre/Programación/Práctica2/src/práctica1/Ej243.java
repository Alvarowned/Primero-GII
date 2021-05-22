package práctica1;

import java.util.Scanner;
import java.util.Locale;

public class Ej243 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int hora,min,seg;
        
        System.out.print("Introduzca la hora: ");
        hora = entrada.nextInt();
        System.out.print("Introduzca los minutos: ");
        min = entrada.nextInt();
        System.out.print("Introduzca los segundos: ");
        seg = entrada.nextInt();
        
        seg++;
        if(seg == 60){
            seg = 0;
            min++;
            if(min == 60){
                min = 0;
                hora++;
                if(hora == 24) hora = 0;
            }
        }
        
        if(0 <= seg && seg <= 9){
            if(0 <= min && min <= 9){
                if(0 <= hora && hora <= 9) System.out.println("Si sumamos un segundo la hora es 0" + hora + ":0" + min + ":0" + seg + ".");
                else if(10 <= hora && hora <= 23) System.out.println("Si sumamos un segundo la hora es " + hora + ":0" + min + ":0" + seg + ".");
                else System.err.println("Hora errónea.");
            }
            else if(10 <= min && min <= 59){
                if(0 <= hora && hora <= 9) System.out.println("Si sumamos un segundo la hora es 0" + hora + ":" + min + ":0" + seg + ".");
                else if(10 <= hora && hora <= 23) System.out.println("Si sumamos un segundo la hora es " + hora + ":" + min + ":0" + seg + ".");
                else System.err.println("Hora errónea.");
            }
            else System.err.println("Hora errónea.");
        }
        else if(10 <= seg && seg <= 59){
            if(0 <= min && min <= 9){
                if(0 <= hora && hora <= 9) System.out.println("Si sumamos un segundo la hora es 0" + hora + ":0" + min + ":" + seg + ".");
                else if(10 <= hora && hora <= 23) System.out.println("Si sumamos un segundo la hora es " + hora + ":0" + min + ":" + seg + ".");
                else System.err.println("Hora errónea.");
            }
            else if(10 <= min && min <= 59){
                if(0 <= hora && hora <= 9) System.out.println("Si sumamos un segundo la hora es 0" + hora + ":" + min + ":" + seg + ".");
                else if(10 <= hora && hora <= 23) System.out.println("Si sumamos un segundo la hora es " + hora + ":" + min + ":" + seg + ".");
                else System.err.println("Hora errónea.");
            }
            else System.err.println("Hora errónea.");
        }
        else System.err.println("Hora errónea.");
    }
}
