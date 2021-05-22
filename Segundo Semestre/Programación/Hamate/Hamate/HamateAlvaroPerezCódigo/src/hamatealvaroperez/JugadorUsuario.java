package hamatealvaroperez;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * La clase JugadorUsuario hereda de Jugador y representa al jugador real, el usuario.
 * @author Álvaro Pérez Álamo
 */
public class JugadorUsuario extends Jugador implements Serializable {
    private final String nombre, apellidos, nif;
    private final LocalDate fecha_nac;
    private Integer punt, jugadas, ganadas;
    private JugadorMaquina rival;
    private Tablero tabl;
    private final ArrayList<Integer> puntosPorPartida;
    
    /**
     * Este constructor inicializa un objeto tipo JugadorUsuario y sus variables rojo (booleano heredado de Jugador), nombre (String), apellidos (String), nif (String), mano (ArrayList heredado de Jugador) y fecha_nac (LocalDate).
     * @param rojo El parámetro rojo es un booleano que modifica la variable rojo del objeto JugadorMaquina y si es true pone el color de este en rojo y si es false en azul.
     * @param mazo El parámetro mazo es un objeto tipo MazoDeCartas del cual JugadorMáquina obtiene 5 objetos Carta aleatoriamente y los pone en el ArrayList mano.
     * @param nombre El parámetro nombre es un String que indica el nombre del JugadorUsuario.
     * @param apellidos El parámetro apellidos es un String que indica los apellidos del JugadorUsuario.
     * @param nif El parámetro nif es un String que indica el NIF del JugadorUsuario.
     * @param fecha_nac El parámetro fecha_nac es un LocalDate que contiene la fecha de nacimiento del JugadorUsuario.
     */
    public JugadorUsuario(boolean rojo, MazoDeCartas mazo, String nombre, String apellidos, String nif, LocalDate fecha_nac){
        super(rojo, mazo);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.fecha_nac = fecha_nac;
        this.punt = 0;
        this.jugadas = 0;
        this.ganadas = 0;
        this.puntosPorPartida = new ArrayList<>();
        this.rival = null;
        this.tabl = null;
    }
    
    /**
     * El método getNombre retorna el valor del String nombre.
     * @return Este método retorna la variable nombre, que es un String con el nombre de JugadorUsuario.
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * El método getApellidos retorna el valor del String apellidos.
     * @return Este método retorna la variable apellidos, que es un String con los apellidos de JugadorUsuario.
     */
    public String getApellidos(){
        return apellidos;
    }
    
    /**
     * El método getNIF retorna el valor del String nif.
     * @return Este método retorna la variable nif, que es un String con el NIF de JugadorUsuario.
     */
    public String getNIF(){
        return nif;
    }
    
    /**
     * El método getFechaNac retorna el valor del LocalDate fecha_nac.
     * @return Este método retorna la variable fecha_nac, que es un LocalDate con la fecha de nacimiento de JugadorUsuario.
     */
    public LocalDate getFechaNac(){
        return fecha_nac;
    }
    
    /**
     * El método setPunt cambia el valor del Integer punt al que queramos.
     * @param punt Es un int que indica el valor que queremos dar a punt.
     */
    public void setPunt(int punt) {
        this.punt = punt;
    }
    
    /**
     * El método getPunt retorna el valor del Integer punt.
     * @return Este método retorna la variable punt, que es un int que contiene la puntuación del jugador.
     */
    public int getPunt() {
        return punt;
    }
    
    /**
     * El método incremPunt suma a la variable punt un valor dado, y además añade increm al ArrayList puntosPorPartida, que contiene todos los puntos que se han ido ganando en cada partida.
     * @param increm Es un int que indica el incremento de punt.
     */
    public void incremPunt(int increm) {
        punt += increm;
        puntosPorPartida.add(increm);
    }
    
    /**
     * El método getRival retorna la variable JugadorMaquina rival.
     * @return Este método retorna la variable rival, que es una variable JugadorMaquina.
     */
    public JugadorMaquina getRival() {
        return rival;
    }
    
    /**
     * El método setRival cambia la variable JugadorMaquina rival y le da el valor que se quiera.
     * @param rival Es un dato de tipo JugadorMaquina que indica el valor que queremos darle a rival.
     */
    public void setRival(JugadorMaquina rival) {
        this.rival = rival;
    }
    
    /**
     * El método getTablero retorna la variable Tablero tabl.
     * @return Este método retorna tabl, que es una variable Tablero.
     */
    public Tablero getTablero() {
        return tabl;
    }
    
    /**
     * El método setTabl cambia la variable Tablero tabl y le da el valor que se quiera.
     * @param tabl Es un dato de tipo Tabl que indica el valor que queremos darle a rival.
     */
    public void setTablero(Tablero tabl) {
        this.tabl = tabl;
    }
    
    /**
     * El método getJugadas retorna el valor int contenido por la variable Integer jugadas.
     * @return El método retorna un int que representa las partidas que lleva jugadas el usuario.
     */
    public int getJugadas() {
        return jugadas;
    }
    
    /**
     * El método sumarJugada suma una partida jugada, sumándole uno a la variable Integer jugadas.
     */
    public void sumarJugada() {
        this.jugadas++;
    }
    
    /**
     * El método getGanadas retorna el valor int contenido por la variable Integer ganadas.
     * @return El método retorna un int que representa las partidas que lleva ganadas el usuario.
     */
    public int getGanadas() {
        return ganadas;
    }
    
    /**
     * El método sumarGanada suma una partida ganada, sumándole uno a la variable Integer ganadas.
     */
    public void sumarGanada() {
        this.ganadas++;
    }
}
