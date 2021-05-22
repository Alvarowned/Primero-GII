package hamatealvaroperez;

import java.io.Serializable;
import javax.swing.ImageIcon;
import java.util.Random;

/**
 * Esta clase inicializa una carta del juego Hamate en forma de objeto.
 * @author Álvaro Pérez Álamo
 */
public class Carta implements Serializable {
    private final Integer valor_izq, valor_dcho;
    private Boolean rojo, esp;
    private ImageIcon icono;
    private final Random rand = new Random();
    
    /**
     * Este constructor de Carta inicializa las variables icono (un ImageIcon con la imagen de la carta), rojo (un booleano que cuando es true nos indica que la carta es roja, y cuando es false, que esta es azul), valor_dcho (que es el valor derecho de la Carta y se elige aleatoriamente entre 1 y 6) y valor_izq (que es el valor izquierdo de la carta y se elige aleatoriamente entre 1 y 6).
     * @param rojo El parámetro rojo es un booleano que debemos introducir como true cuando queramos que la carta sea roja y como false cuando queramos que sea azul.
     * @param icono El parámetro icono es un ImageIcon que determina la imagen de la carta.
     */
    public Carta(boolean rojo, ImageIcon icono){
        this.icono = icono;
        this.rojo = rojo;
        this.valor_dcho = rand.nextInt(6) + 1;
        this.valor_izq = rand.nextInt(6) + 1;
        this.esp = false;
    }
    
    /**
     * El método getIcono retorna la variable icono del objeto Carta del que lo invoquemos.
     * @return Este método retorna la variable icono del objeto, que es un ImageIcon.
     */
    public ImageIcon getIcono(){
        return icono;
    }
    
    /**
     * El método setIcono modifica la variable icono del objeto y la iguala al parámetro icono introducido.
     * @param icono Icono es un parámetro de tipo ImageIcon que determina cuál sera el icono de la carta.
     */
    public void setIcono(ImageIcon icono){
        this.icono = icono;
    }
    
    /**
     * El método getRojo devuelve la variable rojo del objeto Carta del que lo invoquemos.
     * @return Este método retorna la variable rojo del objeto, que es un booleano en true si la carta es roja, y en false si es azul.
     */
    public boolean getRojo(){
        return rojo;
    }
    
    /**
     * El método setRojo modifica la variable rojo del objeto y la iguala al parámetro rojo introducido.
     * @param rojo Rojo es un parámetro de tipo booleano, el cual indica que la carta cambia a roja si es true y si a azul si es false.
     */
    public void setRojo(boolean rojo){
        this.rojo = rojo;
    }
    
    /**
     * El método getValorIzq retorna la variable valor_izq del objeto Carta del que lo invoquemos.
     * @return Este método retorna la variable valor_izq del objeto, que es un int entre 1 y 6 que ha sido elegido aleatoriamente.
     */
    public int getValorIzq() {
        return valor_izq;
    }
    
    /**
     * El método getValorDcho retorna la variable valor_dcho del objeto Carta del que lo invoquemos.
     * @return Este método retorna la variable valor_dcho del objeto, que es un int entre 1 y 6 que ha sido elegido aleatoriamente.
     */
    public int getValorDcho() {
        return valor_dcho;
    }
    
    /**
     * El método getEsp retorna la variable esp del objeto Carta del que lo invoquemos.
     * @return Este método retorna la variable valor_dcho del objeto, que es un boolean que indica si la carta es especial.
     */
    public boolean getEsp() {
        return esp;
    }
    
    /**
     * El método setEsp modifica la variable esp del objeto y la iguala al parámetro esp introducido.
     * @param esp Esp es un parámetro de tipo boolean, el cual indica si la carta es especial o no.
     */
    public void setEsp(boolean esp) {
        this.esp = esp;
    }
}
