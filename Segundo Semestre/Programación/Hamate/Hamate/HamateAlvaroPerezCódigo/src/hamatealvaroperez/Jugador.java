package hamatealvaroperez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * La clase Jugador representa cualquiera de los dos jugadores del juego, por lo que de ella heredan JugadorUsuario y JugadorMaquina.
 * @author Álvaro Pérez Álamo
 */
public class Jugador implements Serializable {
    private final ArrayList<Carta> mano;
    private Boolean rojo;
    
    /**
     * Este constructor inicializa las variables rojo (un booleano que indica que el jugador tiene el color rojo cuando es true y azul cuando es false) y mano (un ArrayList de objetos Carta que se inicializa con 5 cartas del color que indique el parámetro introducido) de la clase Jugador.
     * @param rojo El parámetro rojo es un booleano que cuando es true indica que el jugador tiene el color rojo y cuando es false, que tiene el color azul.
     * @param mazo El parámetro mazo es un objeto de tipo MazoDeCartas, del cual el Jugador obtiene 5 de ellas y las introduce en su variable mano, que es un ArrayList de objetos tipo Carta.
     */
    public Jugador(boolean rojo, MazoDeCartas mazo){
        this.rojo = rojo;                                         /* Si es True es rojo y si es False, azul */
        this.mano = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            this.mano.add(mazo.getRandCarta(rojo));
        }
    }
    
    /**
     * El método getRojo retorna la variable rojo del objeto Jugador del que lo invoca.
     * @return Este método retorna la variable rojo, la cual es un booleano en true cuando el color del Jugador es rojo y en false cuando es azul.
     */
    public boolean getRojo(){
        return rojo;
    }
    
    /**
     * El método getMano nos retorna la variable mano del objeto Jugador del que se invoca.
     * @return Este método nos retorna la variable mano, la cual es un ArrayList de longitud 5 con objetos del tipo Carta.
     */
    public ArrayList getMano(){
        return mano;
    }
    
    /**
     * El método getManoCarta nos retorna un objeto del tipo Carta contenido en la variable del tipo ArrayList mano del Jugador.
     * @param i El parámetro i indica la posición del ArrayList de objetos Carta mano de la cual queremos obtener el objeto Carta.
     * @return Este método nos retorna un objeto del tipo Carta, contenido en la posición i del ArrayList mano.
     */
    public Carta getManoCarta(int i) {
        return this.mano.get(i);
    }
    
    /**
     * El método setManoCarta modifica una posición del ArrayList mano, poniéndole un objeto Carta nuevo.
     * @param i El parámetro i indica la posición del ArrayList mano que queremos cambiar.
     * @param c El parámetro c indica el nuevo objeto Carta que queremos añadir en la posición i del ArrayList.
     */
    public void setManoCarta(int i, Carta c) {
        this.mano.set(i, c);
    }
    
    /**
     * El método resetMano modifica todas las posiciones del ArrayList mano, poniendo así nuevos objetos Carta en todas.
     * @param mazo El parámetro mazo es un objeto del tipo MazoDeCartas del cual obtenemos los nuevos objetos Carta.
     */
    public void resetMano(MazoDeCartas mazo) {
        for(int i = 0; i < 5; i++){
            this.mano.set(i, mazo.getRandCarta(rojo));
        }
    }
    
    /**
     * El método setRojo le da el valor introducido a la variable rojo.
     * @param rojo Es el valor al que queremos cambiar la variable rojo.
     */
    public void setRojo(boolean rojo) {
        this.rojo = rojo;
    }
}
