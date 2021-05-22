package hamatealvaroperez;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * La clase MazoDeCartas representa un mazo con todas las cartas del juego.
 * @author Álvaro Pérez Álamo
 */
public class MazoDeCartas implements Serializable {
    private final ArrayList<Carta> mazo;
    private final Random rand = new Random();
    
    /**
     * Este constructor inicializa un objeto MazoDeCartas, añadiendo a su variable mazo del tipo ArrayList las 110 cartas del juego.
     */
    public MazoDeCartas(){
        this.mazo = new ArrayList<>();
        for(int i = 1; i < 111; i++) {
            ImageIcon icon = new ImageIcon("./src/imagenes/" + i + ".png");
            Carta cart = new Carta(false, icon);
            if(i % 10 == 0) cart.setEsp(true);
            this.mazo.add(cart);
        }
    }
    
    /**
     * El método getMazo retorna el valor del ArrayList de Cartas mazo.
     * @return Este método retorna la variable mazo, que es un ArrayList con las cartas del objeto MazoDeCartas.
     */
    public ArrayList getMazo(){
        return mazo;
    }
    
    /**
     * El método devuelve un objeto Carta aleatorio de mazo, con el color que se indique, y entonces lo quita de mazo para que no se repita al hacer otra llamada al método.
     * @param rojo El parámetro rojo es un booleano que indica el color del que queremos que nos retorne la carta, si es true será roja y si es false será azul.
     * @return Este método retorna un objeto Carta que no ha sido sacado de mazo antes, y con el color que le indiquemos con rojo.
     */
    public Carta getRandCarta(boolean rojo){
        Carta c = new Carta(false, null);
        do {
            int i = rand.nextInt(110);
            c = mazo.get(i);
            mazo.set(i, null);
        } while(c == null);
        
        c.setRojo(rojo);
        return c;
    }
}
