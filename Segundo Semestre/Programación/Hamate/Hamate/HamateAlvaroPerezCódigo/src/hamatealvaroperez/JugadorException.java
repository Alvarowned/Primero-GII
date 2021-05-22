package hamatealvaroperez;

/**
 * La clase JugadorException hereda de la clase Exception, y contiene todos los tipos de excepciones que queremos controlar en el Login y el Juego.
 * @author Álvaro Pérez Álamo
 */
public class JugadorException extends Exception {
    
    public static final String NOMBRE_NO_EXISTE = "La casilla del nombre está vacía.";
    public static final String APELLIDO_NO_EXISTE = "La casilla del apellido está vacía.";
    public static final String NIF_NO_INTRODUCIDO = "No se ha introducido el DNI.";
    public static final String COLOR_NO_SELECCIONADO = "No se ha seleccionado ningún color.";
    public static final String DIFICULTAD_NO_SELECCIONADA = "No se ha seleccionado ninguna dificultad.";
    public static final String FECHA_NO_INTRODUCIDA = "No se ha introducido fecha.";
    public static final String FECHA_INCORRECTA = "La fecha introducida es incorrecta.";
    public static final String POS_TABL_NO_SELECCIONADA = "Posición del tablero no seleccionada.";
    
    public static final String NIF_INCORRECTO = "El NIF proporcionado es incorrecto.";
    public static final String EDAD_INCORRECTA = "El jugador debe ser mayor de edad para poder jugar.";
    public static final String CARTA_NO_SELECCIONADA = "No se ha seleccionado ninguna carta para jugar.";

    /**
     * Este método connstructor JugadorException crea una Excepción con el texto "Se ha producido una excepción en la aplicación.".
     */
    public JugadorException() {
        super("Se ha producido una excepción en la aplicación.");
    }

    /**
     * Este método constructor JugadorException crea una nueva Excepción con el texto que queramos, por si hay nuevas excepciones que controlar.
     * @param txt El parámetro txt es un String que supone el texto que se mostrará al controlar una excepción.
     */
    public JugadorException (String txt) {
        super(txt);
    }
}