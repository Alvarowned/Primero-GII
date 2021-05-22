package hamatealvaroperez;

import java.io.Serializable;

/**
 * La clase JugadorMaquina hereda de la clase Jugador, y representa el jugador rival.
 * @author Álvaro Pérez Álamo
 */
public class JugadorMaquina extends Jugador implements Serializable {
    private Boolean dificil;
    
    /**
     * Este constructor de JugadorMaquina inicializa las variables rojo (booleano heredado de Jugador), mano (ArrayList heredado de Jugador) y dificil (boolean).
     * @param rojo El parámetro rojo es un booleano que modifica la variable rojo del objeto JugadorMaquina y si es true pone el color de este en rojo y si es false en azul.
     * @param mazo El parámetro mazo es un objeto tipo MazoDeCartas del cual JugadorMáquina obtiene 5 objetos Carta aleatoriamente y los pone en el ArrayList mano.
     * @param dificil El parámetro dificil es un booleano que determina la dificultad del rival, si es true será Avanzado, y false fácil.
     */
    public JugadorMaquina(boolean rojo, MazoDeCartas mazo, boolean dificil) {
        super(rojo, mazo);
        this.dificil = dificil;
    }
    
    /**
     * El método getDificil retorna el valor del booleano dificil.
     * @return Este método retorna el booleano dificil, el cual es true cuando el modo es avanzado y false cuando el modo es fácil.
     */
    public boolean getDificil(){
        return dificil;
    }
    
    /**
     * El método setDificil cambia la variable dificil del objeto del que lo invoca.
     * @param dificil El parámetro dificil es un booleano el cual es true cuando el modo es avanzado y false cuando el modo es fácil.
     */
    public void setDificil(boolean dificil){
        this.dificil = dificil;
    }
}