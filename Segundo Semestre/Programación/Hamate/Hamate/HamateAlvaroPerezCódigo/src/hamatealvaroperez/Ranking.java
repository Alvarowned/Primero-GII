package hamatealvaroperez;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Esta clase inicializa un objeto del tipo ranking.
 * @author Álvaro Pérez Álamo
 */
public class Ranking implements Serializable {
    private HashMap<String, JugadorUsuario> rank;
    
    public Ranking(HashMap<String, JugadorUsuario> rank) {
        this.rank = rank;
    }
    
    public HashMap getRank() {
        return rank;
    }
    
    public void getRank(HashMap<String, JugadorUsuario> rank) {
        this.rank = rank;
    }
    
    /**
     * Función que devuelve un ArrayList<JugadorUsuario> con todos los jugadores del ranking ordenados por puntuación de mayor a menor.
     * @return Retorna un ArrayList<JugadorUsuario> con los jugadores ordenados por puntuación de mayor a menor.
     */
    public ArrayList ordenarRankMay() {
        Collection<JugadorUsuario> jugad = rank.values();
        ArrayList<JugadorUsuario> jugadOrd = new ArrayList<>(jugad);
        
        Comparator PuntPerComp = new Comparator() {
            public int compare(Object o1, Object o2) {
                JugadorUsuario jug1 = (JugadorUsuario) o1;
                JugadorUsuario jug2 = (JugadorUsuario) o2;
                if(jug1.getPunt() < jug2.getPunt()) return 1;
                else if(jug1.getPunt() > jug2.getPunt()) return -1;
                else return 0;
            }
        };
        
        Collections.sort(jugadOrd, PuntPerComp);
        
        return jugadOrd;
    }
}
