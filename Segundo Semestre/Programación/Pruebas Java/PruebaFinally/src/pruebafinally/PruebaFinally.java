/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafinally;

/**
 *
 * @author Usuario
 */
public class PruebaFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenas[] = {"Cadena 1","Cadena 2","Cadena 3","Cadena 4"};
        try {
            for (int i=0; i<=4; i++) System.out.println(cadenas[i]);
        } catch( ArrayIndexOutOfBoundsException aie ) {
            System.out.println("\nError: Fuera del índice del array\n");
        } catch( Exception e ) {
            // Captura cualquier otra excepción
            System.out.println("Excepción: " + e.toString() );
        } finally {
            System.out.println( "Esto se imprime siempre." );
        }
    }
    
}
