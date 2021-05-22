package práctica3;

import java.util.Scanner;

public class Ej313 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena;

        System.out.print("Introduzca una palabra: ");
        cadena = entrada.nextLine().toLowerCase();

        int contAEIOU[] = contVocales(cadena);
        
        System.out.println("La palabra '" + cadena + "' contiene " + contAEIOU[0] + " 'A', " + contAEIOU[1] + " 'E', " + contAEIOU[2] + " 'I', " + contAEIOU[3] + " 'O' y " + contAEIOU[4] + " 'U'.");
    }
    
    public static int[] contVocales(String cadena){
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0, contAEIOU[] = new int[5];
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 97:
                    contA += 1;
                    break;
                case 101:
                    contE += 1;
                    break;
                case 105:
                    contI += 1;
                    break;
                case 111:
                    contO += 1;
                    break;
                case 117:
                    contU += 1;
                    break;
                default:
                    break;
            }
        }
        
        contAEIOU[0] = contA;
        contAEIOU[1] = contE;
        contAEIOU[2] = contI;
        contAEIOU[3] = contO;
        contAEIOU[4] = contU;
        
        return contAEIOU;
    }
}
