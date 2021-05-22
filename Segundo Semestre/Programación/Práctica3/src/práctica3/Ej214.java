package práctica3;

import java.text.DecimalFormat;
import java.util.Random;

public class Ej214 {

    public static Random rand = new Random();
    public static double sueldos[][] = new double[3][20];
    
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("'$'###,###.##");
        crear20Sueldos();
        calcular20Retenciones();
        calcular20SN();
        for(int i = 0; i < 20; i++){
            System.out.println("Sueldo del empleado " + i + ": SB: " + format.format(sueldos[0][i]) + " - R: " + format.format(sueldos[1][i]) + " - SN: " + format.format(sueldos[2][i]));
        }
    }
    
    public static void crear20Sueldos(){
        for (int i = 0; i < 20; i++) {
            sueldos[0][i] = rand.nextInt(300000) + rand.nextDouble();
        }
    }

    public static void calcular20Retenciones() {
        for (int i = 0; i < 20; i++) {
            if (sueldos[0][i] < 17708) {
                sueldos[1][i] = sueldos[0][i] * 0.24;
            } else if (sueldos[0][i] > 17707 && sueldos[0][i] < 33008) {
                sueldos[1][i] = sueldos[0][i] * 0.3;
            } else if (sueldos[0][i] > 33007 && sueldos[0][i] < 53408) {
                sueldos[1][i] = sueldos[0][i] * 0.4;
            } else if (sueldos[0][i] > 53407 && sueldos[0][i] < 120001) {
                sueldos[1][i] = sueldos[0][i] * 0.47;
            } else if (sueldos[0][i] > 120000 && sueldos[0][i] < 175001) {
                sueldos[1][i] = sueldos[0][i] * 0.49;
            } else if (sueldos[0][i] > 175000 && sueldos[0][i] < 300001) {
                sueldos[1][i] = sueldos[0][i] * 0.51;
            }
        }
    }
    
    public static void calcular20SN(){
        for(int i = 0; i < 20; i++){
            sueldos[2][i] = sueldos[0][i] - sueldos[1][i];
        }
    }
}
