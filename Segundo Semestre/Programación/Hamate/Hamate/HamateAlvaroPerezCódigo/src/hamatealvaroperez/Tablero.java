package hamatealvaroperez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * La clase Tablero representa el tablero de juego.
 * @author Álvaro Pérez Álamo
 */
public class Tablero implements Serializable {
    private ArrayList<Carta> tabl;
    
    /**
     * Este constructor de Tablero inicia su variable tabl, la cual es un ArrayList de objetos Carta, en null para sus 10 posiciones (de 0 a 9).
     */
    public Tablero () {
        this.tabl = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            tabl.add(null);
        }
    }
    
    /**
     * El método getTablCarta nos retorna un objeto Carta de la posición que nosotros indiquemos con el int i de la variable tabl que es un ArrayList.
     * @param i El parámetro i es un int que indica la posición de la variable tabl de la que queremos sacar el objeto Carta.
     * @return Este método retorna un dato de tipo Carta, que se haya en la posición i de tabl.
     */
    public Carta getTablCarta(int i) {
        return this.tabl.get(i);
    }
    
    /**
     * El método setTablCarta modifica la posición que indiquemos con el int i de la variable tabl que es un ArrayList, y pone en esa posición el objeto Carta que nosotros indiquemos.
     * @param i El parámetro i es un int que indica la posición de la variable tabl en la que queremos poner el objeto Carta.
     * @param c El parámetro c es un objeto de tipo Carta, y es el que vamos a colocar en la posición i.
     */
    public void setTablCarta(int i, Carta c) {
        this.tabl.set(i, c);
    }
    
    /**
     * El método tableroEstaLLeno nos retorna si la variable tabl del objeto Tablero desde el que lo invocamos está lleno, es decir, si las 10 primeras posiciones no son null sino una Carta.
     * @return Este método retorna un booleano, el cual es false si el tablero no está lleno, y true si está lleno.
     */
    public boolean tableroEstaLleno() {
        for(int i = 0; i < 10; i++) {
            if(tabl.get(i) == null) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * El método getTabl nos retorna la variable tabl, que contiene los objetos Carta del objeto Tablero desde el que lo llamamos.
     * @return Este método retorna tabl, que es un dato de tipo ArrayList que contiene objetos de tipo Carta.
     */
    public ArrayList getTabl() {
        return tabl;
    }
    
    /**
     * El método setTabl cambia la variable tabl del objeto Tablero desde el que lo llamemos y lo convierte en el ArrayList que nosotros queramos.
     * @param c El parámetro c es el ArrayList de objetos del tipo Carta por el que queremos cambiar el actual tabl.
     */
    public void setTabl(ArrayList<Carta> c) {
        this.tabl = c;
    }
}
