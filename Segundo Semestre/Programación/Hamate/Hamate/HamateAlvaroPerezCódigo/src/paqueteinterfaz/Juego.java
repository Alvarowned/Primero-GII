/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteinterfaz;

import hamatealvaroperez.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;
import java.io.*;
import java.util.HashMap;

/**
 * Esta clase ejecuta una ventana de Juego, con el tablero de juego y las manos de los jugadores.
 * @author Álvaro Pérez Álamo
 */
public class Juego extends javax.swing.JFrame {
    
    static JugadorUsuario jugU;
    static JugadorMaquina jugM;
    static Tablero tabl1;
    
    static ArrayList<JLabel> manoU = new ArrayList<>();
    static ArrayList<JLabel> manoM = new ArrayList<>();
    static ArrayList<JLabel> cartasTablero = new ArrayList<>();
    static ArrayList<JRadioButton> botonesRadioU = new ArrayList<>();
    static ArrayList<JRadioButton> botonesRadioTablero = new ArrayList<>();
    static ArrayList<JLabel> manoUValorIzq = new ArrayList<>();
    static ArrayList<JLabel> manoUValorDcha = new ArrayList<>();
    static ArrayList<JLabel> manoMValorIzq = new ArrayList<>();
    static ArrayList<JLabel> manoMValorDcha = new ArrayList<>();
    static ArrayList<JLabel> tableroValorIzq = new ArrayList<>();
    static ArrayList<JLabel> tableroValorDcho = new ArrayList<>();
    static ArrayList<JLabel> manoUEsp = new ArrayList<>();
    static ArrayList<JLabel> manoMEsp = new ArrayList<>();
    static ArrayList<JLabel> tableroEsp = new ArrayList<>();
    static Random rand = new Random();
    
    /**
     * Este constructor de Juego crea una nueva ventana de juego a partir de los parámetros j1 y j2, que son los jugadores.
     * @param j1 El parámetro j1 es un objeto del tipo JugadorUsuario que va a determinar los datos del jugador, su color y su mano.
     * @param j2 El parámetro j2 es un objeto del tipo JugadorMaquina que va a determinar los datos del rival, su color, su mano y su dificultad.
     */
    public Juego(JugadorUsuario j1, JugadorMaquina j2) {
        super("Hamate");
        this.setUndecorated(true);
        initComponents();
        
        jugU = j1;
        jugM = j2;
        inicializarMisComponentes(jugU, jugM);
    }
    
    /**
     * Este método inicializa los componentes adicionales (ArrayList de jLabels, jRadioButtons...) y pone las imágenes y valores de las manos.
     * @param j1 El parámetro j1 es un objeto del tipo JugadorUsuario que va a determinar los datos del jugador, su color y su mano.
     * @param j2 El parámetro j2 es un objeto del tipo JugadorMaquina que va a determinar los datos del rival, su color, su mano y su dificultad.
     */
    public void inicializarMisComponentes(JugadorUsuario j1, JugadorMaquina j2) {
        if(jugU.getTablero() == null) {
            tabl1 = new Tablero();
        } else tabl1 = jugU.getTablero();
        
        /* ArrayList con todas las JLabel de la mano del usuario */
        manoU.add(jLabelManoU0);
        manoU.add(jLabelManoU1);
        manoU.add(jLabelManoU2);
        manoU.add(jLabelManoU3);
        manoU.add(jLabelManoU4);

        /* ArrayList con todas las JLabel de la mano de la máquina */
        manoM.add(jLabelManoM0);
        manoM.add(jLabelManoM1);
        manoM.add(jLabelManoM2);
        manoM.add(jLabelManoM3);
        manoM.add(jLabelManoM4);
        
        /* ArrayList con todas las JLabel correspondientes al tablero */
        cartasTablero.add(jLabelTablero0);
        cartasTablero.add(jLabelTablero1);
        cartasTablero.add(jLabelTablero2);
        cartasTablero.add(jLabelTablero3);
        cartasTablero.add(jLabelTablero4);
        cartasTablero.add(jLabelTablero5);
        cartasTablero.add(jLabelTablero6);
        cartasTablero.add(jLabelTablero7);
        cartasTablero.add(jLabelTablero8);
        cartasTablero.add(jLabelTablero9);        
        
        /* ArrayList con todas los JLabel correspondientes a los valores izqdos del tablero */
        tableroValorIzq.add(jLabelTableroIzq0);
        tableroValorIzq.add(jLabelTableroIzq1);
        tableroValorIzq.add(jLabelTableroIzq2);
        tableroValorIzq.add(jLabelTableroIzq3);
        tableroValorIzq.add(jLabelTableroIzq4);
        tableroValorIzq.add(jLabelTableroIzq5);
        tableroValorIzq.add(jLabelTableroIzq6);
        tableroValorIzq.add(jLabelTableroIzq7);
        tableroValorIzq.add(jLabelTableroIzq8);
        tableroValorIzq.add(jLabelTableroIzq9);       
        
        /* ArrayList con todas los JLabel correspondientes a los valores dchos del tablero */
        tableroValorDcho.add(jLabelTableroDcha0);
        tableroValorDcho.add(jLabelTableroDcha1);
        tableroValorDcho.add(jLabelTableroDcha2);
        tableroValorDcho.add(jLabelTableroDcha3);
        tableroValorDcho.add(jLabelTableroDcha4);
        tableroValorDcho.add(jLabelTableroDcha5);
        tableroValorDcho.add(jLabelTableroDcha6);
        tableroValorDcho.add(jLabelTableroDcha7);
        tableroValorDcho.add(jLabelTableroDcha8);
        tableroValorDcho.add(jLabelTableroDcha9);
        
        /* ArrayList con todos los JRadioButton correspondientes a la mano del usuario */
        botonesRadioU.add(jRadioButtonJugadorU0);
        botonesRadioU.add(jRadioButtonJugadorU1);
        botonesRadioU.add(jRadioButtonJugadorU2);
        botonesRadioU.add(jRadioButtonJugadorU3);
        botonesRadioU.add(jRadioButtonJugadorU4);
        
        for(int i = 0; i < 5; i++) {
            botonesRadioU.get(i).setEnabled(true);
        }
        
        /* ArrayList con todos los JRadioButton correspondientes al tablero del juego */
        botonesRadioTablero.add(jRadioButtonTablero0);
        botonesRadioTablero.add(jRadioButtonTablero1);
        botonesRadioTablero.add(jRadioButtonTablero2);
        botonesRadioTablero.add(jRadioButtonTablero3);
        botonesRadioTablero.add(jRadioButtonTablero4);
        botonesRadioTablero.add(jRadioButtonTablero5);
        botonesRadioTablero.add(jRadioButtonTablero6);
        botonesRadioTablero.add(jRadioButtonTablero7);
        botonesRadioTablero.add(jRadioButtonTablero8);
        botonesRadioTablero.add(jRadioButtonTablero9);
        
        for(int i = 0; i < 10; i++) {
            botonesRadioTablero.get(i).setEnabled(true);
        }
        
        /* ArrayList con todos los JLabel que contienen los valores izquierdos de las cartas, en la mano del usuario */
        manoUValorIzq.add(jLabelManoUIzq0);
        manoUValorIzq.add(jLabelManoUIzq1);
        manoUValorIzq.add(jLabelManoUIzq2);
        manoUValorIzq.add(jLabelManoUIzq3);
        manoUValorIzq.add(jLabelManoUIzq4);
        
        /* ArrayList con todos los JLabel que contienen los valores derechos de las cartas, en la mano del usuario */
        manoUValorDcha.add(jLabelManoUDcha0);
        manoUValorDcha.add(jLabelManoUDcha1);
        manoUValorDcha.add(jLabelManoUDcha2);
        manoUValorDcha.add(jLabelManoUDcha3);
        manoUValorDcha.add(jLabelManoUDcha4);
        
        /* ArrayList con todos los JLabel que contienen los valores izquierdos de las cartas, en la mano de la máquina */
        manoMValorIzq.add(jLabelManoMIzq0);
        manoMValorIzq.add(jLabelManoMIzq1);
        manoMValorIzq.add(jLabelManoMIzq2);
        manoMValorIzq.add(jLabelManoMIzq3);
        manoMValorIzq.add(jLabelManoMIzq4);
        
        /* ArrayList con todos los JLabel que contienen los valores derechos de las cartas, en la mano del usuario */
        manoMValorDcha.add(jLabelManoMDcha0);
        manoMValorDcha.add(jLabelManoMDcha1);
        manoMValorDcha.add(jLabelManoMDcha2);
        manoMValorDcha.add(jLabelManoMDcha3);
        manoMValorDcha.add(jLabelManoMDcha4);
        
        /* ArrayList con los textos Esp de manoU */
        manoUEsp.add(jLabelEspManoU0);
        manoUEsp.add(jLabelEspManoU1);
        manoUEsp.add(jLabelEspManoU2);
        manoUEsp.add(jLabelEspManoU3);
        manoUEsp.add(jLabelEspManoU4);
        
        /* ArrayList con los textos Esp de manoM */
        manoMEsp.add(jLabelEspManoM0);
        manoMEsp.add(jLabelEspManoM1);
        manoMEsp.add(jLabelEspManoM2);
        manoMEsp.add(jLabelEspManoM3);
        manoMEsp.add(jLabelEspManoM4);
        
        /* ArrayList con los textos Esp de manoU */
        tableroEsp.add(jLabelEspTabl0);
        tableroEsp.add(jLabelEspTabl1);
        tableroEsp.add(jLabelEspTabl2);
        tableroEsp.add(jLabelEspTabl3);
        tableroEsp.add(jLabelEspTabl4);
        tableroEsp.add(jLabelEspTabl5);
        tableroEsp.add(jLabelEspTabl6);
        tableroEsp.add(jLabelEspTabl7);
        tableroEsp.add(jLabelEspTabl8);
        tableroEsp.add(jLabelEspTabl9);
        
        actualizarTablero();

        /* Desactiva el jButtonRivalAtaca y activa jButtonAtacarDcha y jButtonAtacarIzq (por si se usa el método para el reinicio) para que empiece siempre el jugador */
        jButtonRivalAtaca.setEnabled(false);
        jButtonAtacarDcha.setEnabled(true);
        jButtonAtacarIzq.setEnabled(true);
        
        /* Pone la puntuación en 0 */
        jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: 0 --------------------------------------------------------------");
        jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: 0 --------------------------------------------------------------");
    }
    
    /**
     * Este método guarda la partida. Para ello accede al archivo donde están los datos y lo edita con los nuevos datos.
     */
    public void guardarPartida() {
        try {
            FileInputStream fisRan = new FileInputStream("./src/paqueteinterfaz/ranking.ser");
            ObjectInputStream oisRan = new ObjectInputStream(fisRan);
            Ranking rank = (Ranking) oisRan.readObject();
            oisRan.close();
            fisRan.close();

            HashMap<String, JugadorUsuario> rankMap = rank.getRank();

            jugU.setRival(jugM);
            jugU.setTablero(tabl1);
            rankMap.put(jugU.getNIF(), jugU);
            rank = new Ranking(rankMap);

            FileOutputStream fosRan = new FileOutputStream("./src/paqueteinterfaz/ranking.ser");
            ObjectOutputStream oosRan = new ObjectOutputStream(fosRan);
            oosRan.writeObject(rank);
            oosRan.close();
            fosRan.close();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.toString(), "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     * Actualiza el tablero al completo.
     */
    public void actualizarTablero() {
        for(int i = 0; i < 5; i++) {
            if(jugU.getManoCarta(i) == null) {
                manoU.get(i).setBackground(null);
                manoUValorIzq.get(i).setText("");
                manoUValorDcha.get(i).setText("");
                manoUEsp.get(i).setText("");
                manoU.get(i).setSize(100,100);
                ImageIcon icono = new ImageIcon("./src/imagenes/frame-1-normal.png");
                ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(130, 130, 1));
                manoU.get(i).setIcon(icon);
                botonesRadioU.get(i).setEnabled(false);
            } else {
                manoU.get(i).setSize(130,130);
                ImageIcon icono = new ImageIcon(jugU.getManoCarta(i).getIcono().getImage().getScaledInstance(130, 130, 1));
                manoU.get(i).setIcon(icono);
                manoUValorIzq.get(i).setText("" + jugU.getManoCarta(i).getValorIzq());
                manoUValorDcha.get(i).setText("" + jugU.getManoCarta(i).getValorDcho());
                if(jugU.getManoCarta(i).getEsp()) manoUEsp.get(i).setText("ESP");
                else manoUEsp.get(i).setText("");
                if(jugU.getRojo()) manoU.get(i).setBackground(Color.red);
                else manoU.get(i).setBackground(Color.blue);
            }
            if(jugM.getManoCarta(i) == null) {
                manoM.get(i).setBackground(null);
                manoMValorIzq.get(i).setText("");
                manoMValorDcha.get(i).setText("");
                manoMEsp.get(i).setText("");
                manoM.get(i).setSize(100,100);
                ImageIcon icono = new ImageIcon("./src/imagenes/frame-1-normal.png");
                ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(130, 130, 1));
                manoM.get(i).setIcon(icon);
            } else {
                manoM.get(i).setSize(130,130);
                ImageIcon icono = new ImageIcon(jugM.getManoCarta(i).getIcono().getImage().getScaledInstance(130, 130, 1));
                manoM.get(i).setIcon(icono);
                manoMValorIzq.get(i).setText("" + jugM.getManoCarta(i).getValorIzq());
                manoMValorDcha.get(i).setText("" + jugM.getManoCarta(i).getValorDcho());
                if(jugM.getManoCarta(i).getEsp()) manoMEsp.get(i).setText("ESP");
                else manoMEsp.get(i).setText("");
                if(jugM.getRojo()) manoM.get(i).setBackground(Color.red);
                else manoM.get(i).setBackground(Color.blue);
            }
        }
        for(int i = 0; i < 10; i++) {
            if(tabl1.getTablCarta(i) == null){
                cartasTablero.get(i).setSize(100,100);
                ImageIcon icono = new ImageIcon("./src/imagenes/frame-1-normal.png");
                ImageIcon icon = new ImageIcon(icono.getImage().getScaledInstance(130, 130, 1));
                cartasTablero.get(i).setBackground(null);
                cartasTablero.get(i).setIcon(icon);
                tableroValorIzq.get(i).setText("");
                tableroValorDcho.get(i).setText("");
                tableroEsp.get(i).setText("");
            } else {
                cartasTablero.get(i).setSize(130,130);
                ImageIcon icono = new ImageIcon(tabl1.getTablCarta(i).getIcono().getImage().getScaledInstance(130, 130, 1));
                cartasTablero.get(i).setIcon(icono);
                tableroValorIzq.get(i).setText("" + tabl1.getTablCarta(i).getValorIzq());
                tableroValorDcho.get(i).setText("" + tabl1.getTablCarta(i).getValorDcho());
                if(tabl1.getTablCarta(i).getEsp()) tableroEsp.get(i).setText("ESP");
                else tableroEsp.get(i).setText("");
                if(tabl1.getTablCarta(i).getRojo()) cartasTablero.get(i).setBackground(Color.red);
                else cartasTablero.get(i).setBackground(Color.blue);
                botonesRadioTablero.get(i).setEnabled(false);
            }
        }
    }
    
    /**
     * El método comprobarBotonManoUSeleccionado comprueba si hay algún boton seleccionado en la mano del usuario, y devuelve un entero con el valor correspondiente a la posición en la que está. Si no hay ningún botón seleccionado abre un mensaje de aviso.
     * @return Este método retorna posU, un int que indica la posición del jButton seleccionado, y -1 si no hay ningún jButton seleccionado.
     */ 
    public int comprobarBotonManoUSeleccionado() {
        int posU = -1;
        
        try {
            for(int i = 0; i < 5; i++) {
                if(botonesRadioU.get(i).isSelected()) {
                    if(jugU.getManoCarta(i) == null) throw new JugadorException();
                    posU = i;
                }
            }
            if(posU == -1) throw new JugadorException();
        } catch(JugadorException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.CARTA_NO_SELECCIONADA, "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return posU;
    }
    
    /**
     * El método comprobarBotonTablSeleccionado comprueba si hay algún boton seleccionado en el tablero, y devuelve un entero con el valor correspondiente a la posición en la que está. Si no hay ningún botón seleccionado abre un mensaje de aviso.
     * @return Este método retorna posT, un int que indica la posición del jButton seleccionado, y -1 si no hay ningún jButton seleccionado.
     */
    public int comprobarBotonTablSeleccionado() {
        int posTabl = -1;
        
        try {
            for(int i = 0; i < 10; i++) {
                if(botonesRadioTablero.get(i).isSelected()) {
                    if(tabl1.getTablCarta(i) != null) throw new JugadorException();
                    posTabl = i;
                }
            }
            if(posTabl == -1) throw new JugadorException();
        } catch(JugadorException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.POS_TABL_NO_SELECCIONADA, "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        return posTabl;
    }
    
    /**
     * El método mayorCartaCompIzqU compara el valor de la izq de la carta de la mano del usuario (manoU) con el valor dcho de la carta en posT-1 del tablero (en caso de ser posC = 0, lo compara con el valor dcho de 9), pone la carta del usuario en la posición del tablero correspondiente y ajusta los colores de los jLabel y las cartas.
     * @param posC El parámetro posC es un int que indica la posición de la mano del usuario en la que se encuentra la carta a mover.
     * @param posT El parámetro posT es un int que indica la posición del tablero en la que el usuario quiere poner la carta.
     */
    public void mayorCartaCompIzqU(int posC, int posT){
        tabl1.setTablCarta(posT, jugU.getManoCarta(posC));
        jugU.setManoCarta(posC, null);

        if(posT == 0) {
            if(tabl1.getTablCarta(9) != null) {
                if(tabl1.getTablCarta(0).getValorIzq() > tabl1.getTablCarta(9).getValorDcho()) {
                    if(jugU.getRojo()) {
                        Carta c = tabl1.getTablCarta(9);
                        c.setRojo(true);
                        tabl1.setTablCarta(9, c);
                    } 
                    else {
                        Carta c = tabl1.getTablCarta(9);
                        c.setRojo(false);
                        tabl1.setTablCarta(9, c);
                    }
                }
                else if(tabl1.getTablCarta(0).getValorIzq() < tabl1.getTablCarta(9).getValorDcho()) {
                    if(jugU.getRojo()) {
                        if(!tabl1.getTablCarta(9).getRojo()) {
                            Carta c = tabl1.getTablCarta(0);
                            c.setRojo(false);
                            tabl1.setTablCarta(0, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(9).getRojo()) {
                            Carta c = tabl1.getTablCarta(0);
                            c.setRojo(true);
                            tabl1.setTablCarta(0, c);
                        }
                    }
                }
            }
        }
        else {
            if(tabl1.getTablCarta(posT - 1) != null) {
                if(tabl1.getTablCarta(posT).getValorIzq() > tabl1.getTablCarta(posT - 1).getValorDcho()) {
                    if(jugU.getRojo()) {
                        Carta c = tabl1.getTablCarta(posT - 1);
                        c.setRojo(true);
                        tabl1.setTablCarta(posT - 1, c);
                    } else {
                        Carta c = tabl1.getTablCarta(posT - 1);
                        c.setRojo(false);
                        tabl1.setTablCarta(posT - 1, c);
                    }
                } else if(tabl1.getTablCarta(posT).getValorIzq() < tabl1.getTablCarta(posT - 1).getValorDcho()) {
                    if(jugU.getRojo()) {
                        if(!tabl1.getTablCarta(posT - 1).getRojo()) {
                                Carta c = tabl1.getTablCarta(posT);
                                c.setRojo(false);
                                tabl1.setTablCarta(posT, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(posT - 1).getRojo()) {
                            Carta c = tabl1.getTablCarta(posT);
                            c.setRojo(true);
                            tabl1.setTablCarta(posT, c);
                        }
                    }
                }
            }
        }
        
        actualizarTablero();
    }
    
    /**
     * El método mayorCartaCompDchaU compara el valor de la dcha de la carta de la mano del usuario (manoU) con el valor izq de la carta en posT+1 del tablero (en caso de ser posC = 9, lo compara con el valor izq de 0), pone la carta del usuario en la posición del tablero correspondiente y ajusta los colores de los jLabel y las cartas.
     * @param posC El parámetro posC es un int que indica la posición de la mano del usuario en la que se encuentra la carta a mover.
     * @param posT El parámetro posT es un int que indica la posición del tablero en la que el usuario quiere poner la carta.
     */
    public void mayorCartaCompDchaU(int posC, int posT){
        tabl1.setTablCarta(posT, jugU.getManoCarta(posC));
        jugU.setManoCarta(posC, null);

        if(posT == 9) {
            if(tabl1.getTablCarta(0) != null) {
                if(tabl1.getTablCarta(9).getValorDcho() > tabl1.getTablCarta(0).getValorIzq()) {
                    if(jugU.getRojo()) {
                        Carta c = tabl1.getTablCarta(0);
                        c.setRojo(true);
                        tabl1.setTablCarta(0, c);
                    } 
                    else {
                        Carta c = tabl1.getTablCarta(0);
                        c.setRojo(false);
                        tabl1.setTablCarta(0, c);
                    }
                }
                else if(tabl1.getTablCarta(9).getValorDcho() < tabl1.getTablCarta(0).getValorIzq()) {
                    if(jugU.getRojo()) {
                        if(!tabl1.getTablCarta(0).getRojo()) {
                            Carta c = tabl1.getTablCarta(9);
                            c.setRojo(false);
                            tabl1.setTablCarta(9, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(0).getRojo()) {
                            Carta c = tabl1.getTablCarta(9);
                            c.setRojo(true);
                            tabl1.setTablCarta(9, c);
                        }
                    }
                }
            }
        }
        else {
            if(tabl1.getTablCarta(posT + 1) != null) {
                if(tabl1.getTablCarta(posT).getValorDcho() > tabl1.getTablCarta(posT + 1).getValorIzq()) {
                    if(jugU.getRojo()) {
                        Carta c = tabl1.getTablCarta(posT + 1);
                        c.setRojo(true);
                        tabl1.setTablCarta(posT + 1, c);
                    } else {
                        Carta c = tabl1.getTablCarta(posT + 1);
                        c.setRojo(false);
                        tabl1.setTablCarta(posT + 1, c);
                    }
                } else if(tabl1.getTablCarta(posT).getValorDcho() < tabl1.getTablCarta(posT + 1).getValorIzq()) {
                    if(jugU.getRojo()) {
                        if(!tabl1.getTablCarta(posT + 1).getRojo()) {
                            Carta c = tabl1.getTablCarta(posT);
                            c.setRojo(false);
                            tabl1.setTablCarta(posT, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(posT + 1).getRojo()) {
                            Carta c = tabl1.getTablCarta(posT);
                            c.setRojo(true);
                            tabl1.setTablCarta(posT, c);
                        }
                    }
                }
            }
        }
        
        actualizarTablero();
    }
    
    /**
     * El método obtenerValorManoMFac elige una carta de la mano del rival aleatoriamente y retorna su posición, y se usa en el modo fácil.
     * @return Este método retorna posM, que es un int que indica la posición de la mano del rival en la cual está la carta que se ha elegido.
     */
    public int obtenerValorManoMFac() {
        int posM = -1;
        
        while(posM == -1) {
            posM = rand.nextInt(5);
            if(jugM.getManoCarta(posM) == null) {
                posM = -1;
            }
        }
        return posM;
    }
    
    /**
     * El método obtenerValorTablMFac elige una posición del tablero aleatoriamente y la retorna, y se usa en el modo fácil.
     * @return Este método retorna posT, que es un int que indica la posición del tablero que se ha elegido.
     */
    public int obtenerValorTablMFac() {
        int posT = -1;
        
        while(posT == -1) {
            posT = rand.nextInt(10);
            if(tabl1.getTablCarta(posT) != null) {
                posT = -1;
            }
        }
        return posT;
    }
    
    /**
     * El método mayorCartaCompIzqM compara el valor de la izq de la carta de la mano del rival (manoM) con el valor dcho de la carta en posT-1 del tablero (en caso de ser posC = 0, lo compara con el valor dcho de 9), pone la carta del rival en la posición del tablero correspondiente y ajusta los colores de los jLabel y las cartas.
     * @param posC El parámetro posC es un int que indica la posición de la mano del rival en la que se encuentra la carta a mover.
     * @param posT El parámetro posT es un int que indica la posición del tablero en la que el rival va a poner la carta.
     */
    public void mayorCartaCompIzqM(int posC, int posT){
        tabl1.setTablCarta(posT, jugM.getManoCarta(posC));
        jugM.setManoCarta(posC, null);

        if(posT == 0) {
            if(tabl1.getTablCarta(9) != null) {
                if(tabl1.getTablCarta(0).getValorIzq() > tabl1.getTablCarta(9).getValorDcho()) {
                    if(jugM.getRojo()) {
                        Carta c = tabl1.getTablCarta(9);
                        c.setRojo(true);
                        tabl1.setTablCarta(9, c);
                    } 
                    else {
                        Carta c = tabl1.getTablCarta(9);
                        c.setRojo(false);
                        tabl1.setTablCarta(9, c);
                    }
                }
                else if(tabl1.getTablCarta(0).getValorIzq() < tabl1.getTablCarta(9).getValorDcho()) {
                    if(jugM.getRojo()) {
                        if(!tabl1.getTablCarta(9).getRojo()) {
                            Carta c = tabl1.getTablCarta(0);
                            c.setRojo(false);
                            tabl1.setTablCarta(0, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(9).getRojo()) {
                            Carta c = tabl1.getTablCarta(0);
                            c.setRojo(true);
                            tabl1.setTablCarta(0, c);
                        }
                    }
                }
            }
        }
        else {
            if(tabl1.getTablCarta(posT - 1) != null) {
                if(tabl1.getTablCarta(posT).getValorIzq() > tabl1.getTablCarta(posT - 1).getValorDcho()) {
                    if(jugM.getRojo()) {
                        Carta c = tabl1.getTablCarta(posT - 1);
                        c.setRojo(true);
                        tabl1.setTablCarta(posT - 1, c);
                    } else {
                        Carta c = tabl1.getTablCarta(posT - 1);
                        c.setRojo(false);
                        tabl1.setTablCarta(posT - 1, c);
                    }
                } else if(tabl1.getTablCarta(posT).getValorIzq() < tabl1.getTablCarta(posT - 1).getValorDcho()) {
                    if(jugM.getRojo()) {
                        if(!tabl1.getTablCarta(posT - 1).getRojo()) {
                                Carta c = tabl1.getTablCarta(posT);
                                c.setRojo(false);
                                tabl1.setTablCarta(posT, c);
                            }
                    } else {
                        if(tabl1.getTablCarta(posT - 1).getRojo()) {
                            Carta c = tabl1.getTablCarta(posT);
                            c.setRojo(true);
                            tabl1.setTablCarta(posT, c);
                        }
                    }
                }
            }
        }
        
        actualizarTablero();
    }
    
    /**
     * El método mayorCartaCompDchaM compara el valor de la dcha de la carta de la mano del rival (manoM) con el valor izq de la carta en posT+1 del tablero (en caso de ser posC = 9, lo compara con el valor izq de 0), pone la carta del rival en la posición del tablero correspondiente y ajusta los colores de los jLabel y las cartas.
     * @param posC El parámetro posC es un int que indica la posición de la mano del rival en la que se encuentra la carta a mover.
     * @param posT El parámetro posT es un int que indica la posición del tablero en la que el rival va a poner la carta.
     */
    public void mayorCartaCompDchaM(int posC, int posT){
        tabl1.setTablCarta(posT, jugM.getManoCarta(posC));
        jugM.setManoCarta(posC, null);

        if(posT == 9) {
            if(tabl1.getTablCarta(0) != null) {
                if(tabl1.getTablCarta(9).getValorDcho() > tabl1.getTablCarta(0).getValorIzq()) {
                    if(jugM.getRojo()) {
                        Carta c = tabl1.getTablCarta(0);
                        c.setRojo(true);
                        tabl1.setTablCarta(0, c);
                    } 
                    else {
                        Carta c = tabl1.getTablCarta(0);
                        c.setRojo(false);
                        tabl1.setTablCarta(0, c);
                    }
                }
                else if(tabl1.getTablCarta(9).getValorDcho() < tabl1.getTablCarta(0).getValorIzq()) {
                    if(jugM.getRojo()) {
                        if(!tabl1.getTablCarta(0).getRojo()) {
                            Carta c = tabl1.getTablCarta(9);
                            c.setRojo(false);
                            tabl1.setTablCarta(9, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(0).getRojo()) {
                            Carta c = tabl1.getTablCarta(9);
                            c.setRojo(true);
                            tabl1.setTablCarta(9, c);
                        }
                    }
                }
            }
        }
        else {
            if(tabl1.getTablCarta(posT + 1) != null) {
                if(tabl1.getTablCarta(posT).getValorDcho() > tabl1.getTablCarta(posT + 1).getValorIzq()) {
                    if(jugM.getRojo()) {
                        Carta c = tabl1.getTablCarta(posT + 1);
                        c.setRojo(true);
                        tabl1.setTablCarta(posT + 1, c);
                    } else {
                        Carta c = tabl1.getTablCarta(posT + 1);
                        c.setRojo(false);
                        tabl1.setTablCarta(posT + 1, c);
                    }
                } else if(tabl1.getTablCarta(posT).getValorDcho() < tabl1.getTablCarta(posT + 1).getValorIzq()) {
                    if(jugM.getRojo()) {
                        if(!tabl1.getTablCarta(posT + 1).getRojo()) {
                            Carta c = tabl1.getTablCarta(posT);
                            c.setRojo(false);
                            tabl1.setTablCarta(posT, c);
                        }
                    } else {
                        if(tabl1.getTablCarta(posT + 1).getRojo()) {
                            Carta c = tabl1.getTablCarta(posT);
                            c.setRojo(true);
                            tabl1.setTablCarta(posT, c);
                        }
                    }
                } 
            }
        }
        
        actualizarTablero();
    }
    
    /**
     * El método contarCartasAz cuenta las cartas azules en el tablero y devuelve el número.
     * @return Este método retorna numAz, un int que indica el número de cartas azules en la mesa.
     */
    public int contarCartasAz() {
        int numAz = 0;
        for(int i = 0; i < 10; i++) {
            if(tabl1.getTablCarta(i) != null) {
                if(!tabl1.getTablCarta(i).getRojo()) numAz++;
            }
        }
        return numAz;
    }
    
    /**
     * El método contarCartasRoj cuenta las cartas rojas en el tablero y devuelve el número.
     * @return Este método retorna numRoj, un int que indica el número de cartas rojas en la mesa.
     */
    public int contarCartasRoj() {
        int numRoj = 0;
        for(int i = 0; i < 10; i++) {
            if(tabl1.getTablCarta(i) != null) {
                if(tabl1.getTablCarta(i).getRojo()) numRoj++;
            }
        }
        return numRoj;
    }
    
    /**
     * El método elegirAtqIzqDif decide si es mejor atacar por la izquierda o por la derecha, y devuelve la posición del tablero en la que poner la carta también. Se usa para el rival en el modo dificil.
     * @return Este método retorna un array de int, en cuya posición 0 se encuentra posT (la posición del tablero en la que se colocará la carta), y en cuya posición 1 se encuentra atqIzq (que será 1 si se ataca por la izq y 0 si se ataca por la dcha). Si no consigue elegir una posición retorna en la posición 0 del array un -1.
     */
    public int[] elegirAtqIzqDif() {
        ArrayList<Carta> tablero = tabl1.getTabl();
        int posT = -1, menor = 1000, atqIzq = 0;

        if(jugM.getRojo()) {
            for(int i = 0; i < 10; i++) {
                Carta cTab = tablero.get(i);
                if(cTab != null) {
                    try {
                        if(cTab.getValorIzq() < cTab.getValorDcho()) {
                            if((!cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(i - 1) == null)) {
                                menor = cTab.getValorIzq();
                                posT = i - 1;
                                atqIzq = 0;
                            }
                        } else if(cTab.getValorIzq() > cTab.getValorDcho()) {
                            if((!cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(i + 1) == null)) {
                                menor = cTab.getValorDcho();
                                posT = i + 1;
                                atqIzq = 1;
                            }
                        } else {
                            if((!cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(i - 1) == null)) {
                                menor = cTab.getValorIzq();
                                posT = i - 1;
                                atqIzq = 0;
                            } else if((!cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(i + 1) == null)) {
                                menor = cTab.getValorDcho();
                                posT = i + 1;
                                atqIzq = 1;
                            }
                        }
                    } catch(Exception ex) {
                        if(i == 0) {
                            if(cTab.getValorIzq() < cTab.getValorDcho()) {
                                if((!cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(9) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 9;
                                    atqIzq = 0;
                                }
                            } else if(cTab.getValorIzq() > cTab.getValorDcho()) {
                                if((!cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(1) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 1;
                                    atqIzq = 1;
                                }
                            } else {
                                if((!cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(9) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 9;
                                    atqIzq = 0;
                                } else if((!cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(1) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 1;
                                    atqIzq = 1;
                                }
                            }
                        } else if(i == 9) {
                            if(cTab.getValorIzq() < cTab.getValorDcho()) {
                                if((!cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(8) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 8;
                                    atqIzq = 0;
                                }
                            } else if(cTab.getValorIzq() > cTab.getValorDcho()) {
                                if((!cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(0) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 0;
                                    atqIzq = 1;
                                }
                            } else {
                                if((!cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(8) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 8;
                                    atqIzq = 0;
                                } else if((!cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(0) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 0;
                                    atqIzq = 1;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for(int i = 0; i < 10; i++) {
                Carta cTab = tablero.get(i);
                if(cTab != null) {
                    try {
                        if(cTab.getValorIzq() < cTab.getValorDcho()) {
                            if((cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(i - 1) == null)) {
                                menor = cTab.getValorIzq();
                                posT = i - 1;
                                atqIzq = 0;
                            }
                        } else if(cTab.getValorIzq() > cTab.getValorDcho()) {
                            if((cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(i + 1) == null)) {
                                menor = cTab.getValorDcho();
                                posT = i + 1;
                                atqIzq = 1;
                            }
                        } else {
                            if((cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(i - 1) == null)) {
                                menor = cTab.getValorIzq();
                                posT = i - 1;
                                atqIzq = 0;
                            } else if((cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(i + 1) == null)) {
                                menor = cTab.getValorDcho();
                                posT = i + 1;
                                atqIzq = 1;
                            }
                        }
                    } catch(Exception ex) {
                        if(i == 0) {
                            if(cTab.getValorIzq() < cTab.getValorDcho()) {
                                if((cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(9) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 9;
                                    atqIzq = 0;
                                }
                            } else if(cTab.getValorIzq() > cTab.getValorDcho()) {
                                if((cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(1) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 1;
                                    atqIzq = 1;
                                }
                            } else {
                                if((cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(9) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 9;
                                    atqIzq = 0;
                                } else if((cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(1) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 1;
                                    atqIzq = 1;
                                }
                            }
                        } else if(i == 9) {
                            if(cTab.getValorIzq() < cTab.getValorDcho()) {
                                if((cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(8) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 8;
                                    atqIzq = 0;
                                }
                            } else if(cTab.getValorIzq() > cTab.getValorDcho()) {
                                if((cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(0) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 0;
                                    atqIzq = 1;
                                }
                            } else {
                                if((cTab.getRojo()) && (cTab.getValorIzq() < menor) && (tablero.get(8) == null)) {
                                    menor = cTab.getValorIzq();
                                    posT = 8;
                                    atqIzq = 0;
                                } else if((cTab.getRojo()) && (cTab.getValorDcho() < menor) && (tablero.get(0) == null)) {
                                    menor = cTab.getValorDcho();
                                    posT = 0;
                                    atqIzq = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        int[] res = new int[2];
        res[0] = posT;
        res[1] = atqIzq;
        return res;
    }
    
    /**
     * El método elegirCartaMDif se usa para el rival en modo dificil, y elige la carta con la que atacará, pero si no se puede ganar a ninguna carta del usuario retorna -1.
     * @param posT El parámetro posT representa la posición del tablero en la que se va a colocar la carta del rival.
     * @param atqIzq El parámetro atqIzq es un booleano que si es true indica que se ataca por la izq y si es false indica que se ataca por la dcha.
     * @return El método retorna posM, que es un int que indica la posición correspondiente a la carta de la mano del rival que se ha elegido, pero si no ha conseguido elegir ninguna retorna -1.
     */
    public int elegirCartaMDif(int posT, boolean atqIzq) {
        int posM = -1, menor = 10, comp;
        if(atqIzq) {
            for(int i = 0; i < 5; i++) {
                try {                                                               /* Este try es por si da Excepción de NullPointer */
                    if(posT == 0) {
                        comp = tabl1.getTablCarta(9).getValorDcho();
                        Carta x = jugM.getManoCarta(i);
                        if(x != null) {
                            if(x.getValorIzq() > comp && x.getValorIzq() < menor) {
                                posM = i;
                                menor = x.getValorIzq();
                            }
                        }
                    } else {
                        comp = tabl1.getTablCarta(posT - 1).getValorDcho();
                        Carta x = jugM.getManoCarta(i);
                        if(x != null) {
                            if(x.getValorIzq() > comp && x.getValorIzq() < menor) {
                                posM = i;
                                menor = x.getValorIzq();
                            }
                        }
                    }
                } catch(Exception ex) {
                }
            } return posM;
        } else {
            for(int i = 0; i < 5; i++) {
                try {
                    if(posT == 9) {
                        comp = tabl1.getTablCarta(0).getValorIzq();
                        Carta x = jugM.getManoCarta(i);
                        if(x != null) {
                            if(x.getValorDcho() > comp && x.getValorDcho() < menor) {
                                posM = i;
                                menor = x.getValorIzq();
                            }
                        }
                    } else {
                        comp = tabl1.getTablCarta(posT + 1).getValorIzq();
                        Carta x = jugM.getManoCarta(i);
                        if(x != null) {
                            if(x.getValorDcho() > comp && x.getValorDcho() < menor) {
                                posM = i;
                                menor = x.getValorDcho();
                            }
                        }
                    }
                } catch(Exception ex) {
                }
            } return posM;
        } 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCartasManoJ1 = new javax.swing.ButtonGroup();
        buttonGroupMesa = new javax.swing.ButtonGroup();
        jPanelRival = new javax.swing.JPanel();
        jLabelEspManoM0 = new javax.swing.JLabel();
        jLabelEspManoM1 = new javax.swing.JLabel();
        jLabelEspManoM2 = new javax.swing.JLabel();
        jLabelEspManoM3 = new javax.swing.JLabel();
        jLabelEspManoM4 = new javax.swing.JLabel();
        jLabelManoMDcha0 = new javax.swing.JLabel();
        jLabelManoMDcha1 = new javax.swing.JLabel();
        jLabelManoMDcha2 = new javax.swing.JLabel();
        jLabelManoMDcha3 = new javax.swing.JLabel();
        jLabelManoMDcha4 = new javax.swing.JLabel();
        jLabelManoMIzq0 = new javax.swing.JLabel();
        jLabelManoMIzq1 = new javax.swing.JLabel();
        jLabelManoMIzq2 = new javax.swing.JLabel();
        jLabelManoMIzq3 = new javax.swing.JLabel();
        jLabelManoMIzq4 = new javax.swing.JLabel();
        jLabelManoM3 = new javax.swing.JLabel();
        jLabelManoM4 = new javax.swing.JLabel();
        jLabelManoM0 = new javax.swing.JLabel();
        jLabelManoM1 = new javax.swing.JLabel();
        jLabelManoM2 = new javax.swing.JLabel();
        jLabelPuntM = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelEspManoU0 = new javax.swing.JLabel();
        jLabelEspManoU1 = new javax.swing.JLabel();
        jLabelEspManoU2 = new javax.swing.JLabel();
        jLabelEspManoU3 = new javax.swing.JLabel();
        jLabelEspManoU4 = new javax.swing.JLabel();
        jLabelManoUIzq0 = new javax.swing.JLabel();
        jLabelManoUDcha0 = new javax.swing.JLabel();
        jLabelManoUIzq1 = new javax.swing.JLabel();
        jLabelManoUDcha1 = new javax.swing.JLabel();
        jLabelManoUIzq2 = new javax.swing.JLabel();
        jLabelManoUDcha2 = new javax.swing.JLabel();
        jLabelManoUIzq3 = new javax.swing.JLabel();
        jLabelManoUDcha3 = new javax.swing.JLabel();
        jLabelManoUIzq4 = new javax.swing.JLabel();
        jLabelManoUDcha4 = new javax.swing.JLabel();
        jLabelManoU3 = new javax.swing.JLabel();
        jLabelManoU4 = new javax.swing.JLabel();
        jLabelManoU1 = new javax.swing.JLabel();
        jLabelManoU0 = new javax.swing.JLabel();
        jLabelManoU2 = new javax.swing.JLabel();
        jRadioButtonJugadorU0 = new javax.swing.JRadioButton();
        jRadioButtonJugadorU1 = new javax.swing.JRadioButton();
        jRadioButtonJugadorU2 = new javax.swing.JRadioButton();
        jRadioButtonJugadorU3 = new javax.swing.JRadioButton();
        jRadioButtonJugadorU4 = new javax.swing.JRadioButton();
        jLabelPuntU = new javax.swing.JLabel();
        jPanelTablero = new javax.swing.JPanel();
        jLabelEspTabl0 = new javax.swing.JLabel();
        jLabelEspTabl1 = new javax.swing.JLabel();
        jLabelEspTabl2 = new javax.swing.JLabel();
        jLabelEspTabl3 = new javax.swing.JLabel();
        jLabelEspTabl4 = new javax.swing.JLabel();
        jLabelEspTabl5 = new javax.swing.JLabel();
        jLabelEspTabl6 = new javax.swing.JLabel();
        jLabelEspTabl7 = new javax.swing.JLabel();
        jLabelEspTabl8 = new javax.swing.JLabel();
        jLabelEspTabl9 = new javax.swing.JLabel();
        jLabelTableroDcha9 = new javax.swing.JLabel();
        jLabelTableroDcha0 = new javax.swing.JLabel();
        jLabelTableroDcha1 = new javax.swing.JLabel();
        jLabelTableroDcha2 = new javax.swing.JLabel();
        jLabelTableroDcha3 = new javax.swing.JLabel();
        jLabelTableroDcha4 = new javax.swing.JLabel();
        jLabelTableroDcha5 = new javax.swing.JLabel();
        jLabelTableroDcha6 = new javax.swing.JLabel();
        jLabelTableroDcha7 = new javax.swing.JLabel();
        jLabelTableroDcha8 = new javax.swing.JLabel();
        jLabelTableroIzq0 = new javax.swing.JLabel();
        jLabelTableroIzq1 = new javax.swing.JLabel();
        jLabelTableroIzq2 = new javax.swing.JLabel();
        jLabelTableroIzq3 = new javax.swing.JLabel();
        jLabelTableroIzq4 = new javax.swing.JLabel();
        jLabelTableroIzq5 = new javax.swing.JLabel();
        jLabelTableroIzq6 = new javax.swing.JLabel();
        jLabelTableroIzq7 = new javax.swing.JLabel();
        jLabelTableroIzq8 = new javax.swing.JLabel();
        jLabelTableroIzq9 = new javax.swing.JLabel();
        jLabelTablero1 = new javax.swing.JLabel();
        jLabelTablero0 = new javax.swing.JLabel();
        jLabelTablero2 = new javax.swing.JLabel();
        jLabelTablero3 = new javax.swing.JLabel();
        jLabelTablero4 = new javax.swing.JLabel();
        jLabelTablero5 = new javax.swing.JLabel();
        jLabelTablero6 = new javax.swing.JLabel();
        jLabelTablero7 = new javax.swing.JLabel();
        jLabelTablero8 = new javax.swing.JLabel();
        jLabelTablero9 = new javax.swing.JLabel();
        jRadioButtonTablero0 = new javax.swing.JRadioButton();
        jRadioButtonTablero1 = new javax.swing.JRadioButton();
        jRadioButtonTablero2 = new javax.swing.JRadioButton();
        jRadioButtonTablero3 = new javax.swing.JRadioButton();
        jRadioButtonTablero4 = new javax.swing.JRadioButton();
        jRadioButtonTablero5 = new javax.swing.JRadioButton();
        jRadioButtonTablero6 = new javax.swing.JRadioButton();
        jRadioButtonTablero7 = new javax.swing.JRadioButton();
        jRadioButtonTablero8 = new javax.swing.JRadioButton();
        jRadioButtonTablero9 = new javax.swing.JRadioButton();
        jButtonRivalAtaca = new javax.swing.JButton();
        jButtonReinicio = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAtacarIzq = new javax.swing.JButton();
        jButtonAtacarDcha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1500, 648));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRival.setBackground(new java.awt.Color(25, 21, 18));
        jPanelRival.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEspManoM0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoM0.setForeground(new java.awt.Color(255, 255, 0));
        jPanelRival.add(jLabelEspManoM0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabelEspManoM1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoM1.setForeground(new java.awt.Color(255, 255, 0));
        jPanelRival.add(jLabelEspManoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabelEspManoM2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoM2.setForeground(new java.awt.Color(255, 255, 0));
        jPanelRival.add(jLabelEspManoM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabelEspManoM3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoM3.setForeground(new java.awt.Color(255, 255, 0));
        jPanelRival.add(jLabelEspManoM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabelEspManoM4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoM4.setForeground(new java.awt.Color(255, 255, 0));
        jPanelRival.add(jLabelEspManoM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabelManoMDcha0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMDcha0.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMDcha0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 10, 20));

        jLabelManoMDcha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMDcha1.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMDcha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 10, 20));

        jLabelManoMDcha2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMDcha2.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMDcha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 10, 20));

        jLabelManoMDcha3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMDcha3.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMDcha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 10, 20));

        jLabelManoMDcha4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMDcha4.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMDcha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 10, 20));

        jLabelManoMIzq0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMIzq0.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMIzq0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 10, 20));

        jLabelManoMIzq1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMIzq1.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMIzq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 10, 20));

        jLabelManoMIzq2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMIzq2.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMIzq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 10, 20));

        jLabelManoMIzq3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMIzq3.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMIzq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 10, 20));

        jLabelManoMIzq4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoMIzq4.setForeground(new java.awt.Color(51, 255, 51));
        jPanelRival.add(jLabelManoMIzq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 10, 20));

        jLabelManoM3.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoM3.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoM3.setOpaque(true);
        jLabelManoM3.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelRival.add(jLabelManoM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 10, -1, -1));

        jLabelManoM4.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoM4.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoM4.setOpaque(true);
        jLabelManoM4.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelRival.add(jLabelManoM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 10, -1, -1));

        jLabelManoM0.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoM0.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoM0.setOpaque(true);
        jLabelManoM0.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelRival.add(jLabelManoM0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelManoM1.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoM1.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoM1.setOpaque(true);
        jLabelManoM1.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelRival.add(jLabelManoM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 10, -1, -1));

        jLabelManoM2.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoM2.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoM2.setOpaque(true);
        jLabelManoM2.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelRival.add(jLabelManoM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 10, -1, -1));

        jLabelPuntM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPuntM.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: n --------------------------------------------------------------");
        jPanelRival.add(jLabelPuntM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 710, -1));

        getContentPane().add(jPanelRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 21, 740, 190));

        jPanelUsuario.setBackground(new java.awt.Color(25, 21, 18));
        jPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEspManoU0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoU0.setForeground(new java.awt.Color(255, 255, 0));
        jPanelUsuario.add(jLabelEspManoU0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabelEspManoU1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoU1.setForeground(new java.awt.Color(255, 255, 0));
        jPanelUsuario.add(jLabelEspManoU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabelEspManoU2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoU2.setForeground(new java.awt.Color(255, 255, 0));
        jPanelUsuario.add(jLabelEspManoU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabelEspManoU3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoU3.setForeground(new java.awt.Color(255, 255, 0));
        jPanelUsuario.add(jLabelEspManoU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabelEspManoU4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspManoU4.setForeground(new java.awt.Color(255, 255, 0));
        jPanelUsuario.add(jLabelEspManoU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabelManoUIzq0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUIzq0.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUIzq0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 10, 20));

        jLabelManoUDcha0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUDcha0.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUDcha0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 10, 20));

        jLabelManoUIzq1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUIzq1.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUIzq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 10, 20));

        jLabelManoUDcha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUDcha1.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUDcha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 10, 20));

        jLabelManoUIzq2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUIzq2.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUIzq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 10, 20));

        jLabelManoUDcha2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUDcha2.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUDcha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 10, 20));

        jLabelManoUIzq3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUIzq3.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUIzq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 10, 20));

        jLabelManoUDcha3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUDcha3.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUDcha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 10, 20));

        jLabelManoUIzq4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUIzq4.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUIzq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 10, 20));

        jLabelManoUDcha4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManoUDcha4.setForeground(new java.awt.Color(51, 255, 51));
        jPanelUsuario.add(jLabelManoUDcha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 10, 20));

        jLabelManoU3.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoU3.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoU3.setOpaque(true);
        jLabelManoU3.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelUsuario.add(jLabelManoU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 11, -1, -1));

        jLabelManoU4.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoU4.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoU4.setOpaque(true);
        jLabelManoU4.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelUsuario.add(jLabelManoU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 11, -1, -1));

        jLabelManoU1.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoU1.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoU1.setOpaque(true);
        jLabelManoU1.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelUsuario.add(jLabelManoU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 11, -1, -1));

        jLabelManoU0.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoU0.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoU0.setOpaque(true);
        jLabelManoU0.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelUsuario.add(jLabelManoU0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabelManoU2.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelManoU2.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelManoU2.setOpaque(true);
        jLabelManoU2.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelUsuario.add(jLabelManoU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 11, -1, -1));

        jRadioButtonJugadorU0.setBackground(new java.awt.Color(25, 21, 18));
        buttonGroupCartasManoJ1.add(jRadioButtonJugadorU0);
        jPanelUsuario.add(jRadioButtonJugadorU0, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 148, -1, -1));

        jRadioButtonJugadorU1.setBackground(new java.awt.Color(25, 21, 18));
        buttonGroupCartasManoJ1.add(jRadioButtonJugadorU1);
        jPanelUsuario.add(jRadioButtonJugadorU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 148, -1, -1));

        jRadioButtonJugadorU2.setBackground(new java.awt.Color(25, 21, 18));
        buttonGroupCartasManoJ1.add(jRadioButtonJugadorU2);
        jPanelUsuario.add(jRadioButtonJugadorU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 148, -1, -1));

        jRadioButtonJugadorU3.setBackground(new java.awt.Color(25, 21, 18));
        buttonGroupCartasManoJ1.add(jRadioButtonJugadorU3);
        jPanelUsuario.add(jRadioButtonJugadorU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 148, -1, -1));

        jRadioButtonJugadorU4.setBackground(new java.awt.Color(25, 21, 18));
        buttonGroupCartasManoJ1.add(jRadioButtonJugadorU4);
        jPanelUsuario.add(jRadioButtonJugadorU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 148, -1, -1));

        jLabelPuntU.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPuntU.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: n --------------------------------------------------------------");
        jPanelUsuario.add(jLabelPuntU, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 180, 710, -1));

        getContentPane().add(jPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 740, 210));

        jPanelTablero.setBackground(new java.awt.Color(0, 0, 0));
        jPanelTablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEspTabl0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl0.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabelEspTabl1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl1.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabelEspTabl2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl2.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabelEspTabl3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl3.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabelEspTabl4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl4.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabelEspTabl5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl5.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, -1));

        jLabelEspTabl6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl6.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, -1, -1));

        jLabelEspTabl7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl7.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, -1, -1));

        jLabelEspTabl8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl8.setForeground(new java.awt.Color(255, 255, 0));
        jPanelTablero.add(jLabelEspTabl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 120, -1, -1));

        jLabelEspTabl9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEspTabl9.setForeground(new java.awt.Color(255, 255, 0));
        jLabelEspTabl9.setText("ESP");
        jPanelTablero.add(jLabelEspTabl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 120, -1, -1));

        jLabelTableroDcha9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha9.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1450, 60, 10, 20));

        jLabelTableroDcha0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha0.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha0, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 10, 20));

        jLabelTableroDcha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha1.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 10, 20));

        jLabelTableroDcha2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha2.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 10, 20));

        jLabelTableroDcha3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha3.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 10, 20));

        jLabelTableroDcha4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha4.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 10, 20));

        jLabelTableroDcha5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha5.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 10, 20));

        jLabelTableroDcha6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha6.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 10, 20));

        jLabelTableroDcha7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha7.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, 10, 20));

        jLabelTableroDcha8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroDcha8.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroDcha8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 60, 10, 20));

        jLabelTableroIzq0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq0.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 10, 20));

        jLabelTableroIzq1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq1.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 10, 20));

        jLabelTableroIzq2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq2.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 10, 20));

        jLabelTableroIzq3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq3.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 10, 20));

        jLabelTableroIzq4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq4.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 10, 20));

        jLabelTableroIzq5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq5.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 10, 20));

        jLabelTableroIzq6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq6.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 10, 20));

        jLabelTableroIzq7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq7.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, 10, 20));

        jLabelTableroIzq8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq8.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 60, 10, 20));

        jLabelTableroIzq9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTableroIzq9.setForeground(new java.awt.Color(51, 255, 51));
        jPanelTablero.add(jLabelTableroIzq9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 60, 10, 20));

        jLabelTablero1.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero1.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero1.setOpaque(true);
        jLabelTablero1.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 10, -1, -1));

        jLabelTablero0.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero0.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero0.setOpaque(true);
        jLabelTablero0.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelTablero2.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero2.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero2.setOpaque(true);
        jLabelTablero2.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 10, -1, -1));

        jLabelTablero3.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero3.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero3.setOpaque(true);
        jLabelTablero3.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 10, -1, -1));

        jLabelTablero4.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero4.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero4.setOpaque(true);
        jLabelTablero4.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 10, -1, -1));

        jLabelTablero5.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero5.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero5.setOpaque(true);
        jLabelTablero5.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabelTablero6.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero6.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero6.setOpaque(true);
        jLabelTablero6.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(898, 10, -1, -1));

        jLabelTablero7.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero7.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero7.setOpaque(true);
        jLabelTablero7.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1046, 10, -1, -1));

        jLabelTablero8.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero8.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero8.setOpaque(true);
        jLabelTablero8.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1194, 10, -1, -1));

        jLabelTablero9.setMaximumSize(new java.awt.Dimension(130, 130));
        jLabelTablero9.setMinimumSize(new java.awt.Dimension(130, 130));
        jLabelTablero9.setOpaque(true);
        jLabelTablero9.setPreferredSize(new java.awt.Dimension(130, 130));
        jPanelTablero.add(jLabelTablero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1342, 10, -1, -1));

        jRadioButtonTablero0.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero0);
        jPanelTablero.add(jRadioButtonTablero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 147, -1, -1));

        jRadioButtonTablero1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero1);
        jPanelTablero.add(jRadioButtonTablero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 147, -1, -1));

        jRadioButtonTablero2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero2);
        jPanelTablero.add(jRadioButtonTablero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 147, -1, -1));

        jRadioButtonTablero3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero3);
        jPanelTablero.add(jRadioButtonTablero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 147, -1, -1));

        jRadioButtonTablero4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero4);
        jPanelTablero.add(jRadioButtonTablero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 147, -1, -1));

        jRadioButtonTablero5.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero5);
        jPanelTablero.add(jRadioButtonTablero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 147, -1, -1));

        jRadioButtonTablero6.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero6);
        jPanelTablero.add(jRadioButtonTablero6, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 147, -1, -1));

        jRadioButtonTablero7.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero7);
        jPanelTablero.add(jRadioButtonTablero7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 147, -1, -1));

        jRadioButtonTablero8.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero8);
        jPanelTablero.add(jRadioButtonTablero8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1246, 147, -1, -1));

        jRadioButtonTablero9.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupMesa.add(jRadioButtonTablero9);
        jPanelTablero.add(jRadioButtonTablero9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1397, 147, -1, -1));

        getContentPane().add(jPanelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1480, -1));

        jButtonRivalAtaca.setText("Rival Ataca");
        jButtonRivalAtaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRivalAtacaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRivalAtaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 178, -1));

        jButtonReinicio.setText("Reiniciar");
        jButtonReinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReinicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1418, 11, -1, -1));

        jButtonAtacarIzq.setText("Atacar por la izquierda");
        jButtonAtacarIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtacarIzqActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtacarIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, -1, -1));

        jButtonAtacarDcha.setText("Atacar por la derecha");
        jButtonAtacarDcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtacarDchaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtacarDcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 141, -1));

        jLabel1.setBackground(new java.awt.Color(25, 21, 18));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/fondo1.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método ocurre cuando se pulsa jButtonReinicio, y reinicia el juego con una nueva mano para los dos jugadores.
     * @param evt 
     */
    private void jButtonReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReinicioActionPerformed
        MazoDeCartas mazo1 = new MazoDeCartas();
        jugU.resetMano(mazo1);
        jugM.resetMano(mazo1);
        ArrayList<Carta> tablero = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            tablero.add(null);
        }
        tabl1.setTabl(tablero);
        
        inicializarMisComponentes(jugU, jugM);
        
        this.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonReinicioActionPerformed

    /**
     * Este método ocurre cuando se pulsa jButtonCancelar, y sale del juego abriendo un mensaje de despedida.
     * @param evt 
     */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        JOptionPane.showMessageDialog(rootPane, "¡Hasta la próxima!");
        System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * Este método ocurre cuando se pulsa jButtonAtacarIzq, y lo que hace es obtener las posiciones de la mano y del tablero que el usuario ha elegido y mover la carta de la mano al tablero, atacando a la izq. Si no se ha seleccionado posición del tablero o de la mano no hace nada. Además después actualiza la puntuacuión del usuario y desactiva los botones de ataque del jugador y activa el botón de ataque del rival.
     * @param evt 
     */
    private void jButtonAtacarIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtacarIzqActionPerformed
        int posU = comprobarBotonManoUSeleccionado(), posTabl = comprobarBotonTablSeleccionado();
        if(posU != -1 && posTabl != -1) {
            botonesRadioU.get(posU).setEnabled(false);
            botonesRadioTablero.get(posTabl).setEnabled(false);
            mayorCartaCompIzqU(posU, posTabl);
            
            if(jugU.getRojo()) {
                jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: " + contarCartasRoj() + " --------------------------------------------------------------");
                jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: " + contarCartasAz() + " --------------------------------------------------------------");
            } else {
                jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: " + contarCartasAz() + " --------------------------------------------------------------");
                jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: " + contarCartasRoj() + " --------------------------------------------------------------");
            }
            
            jButtonAtacarIzq.setEnabled(false);
            jButtonAtacarDcha.setEnabled(false);
            jButtonRivalAtaca.setEnabled(true);
            
            guardarPartida();
        }
    }//GEN-LAST:event_jButtonAtacarIzqActionPerformed

    /**
     * Este método ocurre cuando se pulsa jButtonAtacarDcha, y lo que hace es obtener las posiciones de la mano y del tablero que el usuario ha elegido y mover la carta de la mano al tablero, atacando a la dcha. Si no se ha seleccionado posición del tablero o de la mano no hace nada. Además después actualiza la puntuacuión del usuario y desactiva los botones de ataque del jugador y activa el botón de ataque del rival.
     * @param evt 
     */
    private void jButtonAtacarDchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtacarDchaActionPerformed
        int posU = comprobarBotonManoUSeleccionado(), posTabl = comprobarBotonTablSeleccionado();
        if(posU != -1 && posTabl != -1) {
            botonesRadioU.get(posU).setEnabled(false);
            botonesRadioTablero.get(posTabl).setEnabled(false);
            mayorCartaCompDchaU(posU, posTabl);
            
            if(jugU.getRojo()) {
                jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: " + contarCartasRoj() + " --------------------------------------------------------------");
                jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: " + contarCartasAz() + " --------------------------------------------------------------");
            } else {
                jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: " + contarCartasAz() + " --------------------------------------------------------------");
                jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: " + contarCartasRoj() + " --------------------------------------------------------------");
            }
            
            jButtonAtacarIzq.setEnabled(false);
            jButtonAtacarDcha.setEnabled(false);
            jButtonRivalAtaca.setEnabled(true);
            
            guardarPartida();
        }
    }//GEN-LAST:event_jButtonAtacarDchaActionPerformed

    /**
     * Este método sucede cuando el usuario pulsa jButtonRival, y lo que hace es elegir el ataque que va a realizar el rival, dependiendo de su modo de juego con mayor o menor dificultad, actualiza la puntuación del rival y desactiva su botón de ataque y activa los del usuario. Además si el tablero está lleno, abre un mensaje para el usuario diciendo el resultado de la partida y preguntando si quiere jugar otra partida.
     * @param evt 
     */
    private void jButtonRivalAtacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRivalAtacaActionPerformed
        if(!jugM.getDificil()) {
            int posM = obtenerValorManoMFac(), posTabl = obtenerValorTablMFac();
            boolean atqIzq = rand.nextBoolean();
            if(atqIzq) mayorCartaCompIzqM(posM, posTabl);
            else mayorCartaCompDchaM(posM, posTabl);
            
            botonesRadioTablero.get(posTabl).setEnabled(false);
        } else {            
            int[] atq = elegirAtqIzqDif();
            
            int posTabl = atq[0];
            boolean atqIzq = (atq[1] == 1);
            
            if(posTabl == -1) {
                posTabl = obtenerValorTablMFac();
                atqIzq = rand.nextBoolean();
            }
            
            int posM = elegirCartaMDif(posTabl, atqIzq);
            if(posM == -1) {
                posM = obtenerValorManoMFac();
                atqIzq = !atqIzq;
            }
            
            if(atqIzq) mayorCartaCompIzqM(posM, posTabl);
            else mayorCartaCompDchaM(posM, posTabl);
            
            botonesRadioTablero.get(posTabl).setEnabled(false);
        }
        
        if(jugU.getRojo()) {
            jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: " + contarCartasRoj() + " --------------------------------------------------------------");
            jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: " + contarCartasAz() + " --------------------------------------------------------------");
        } else {
            jLabelPuntU.setText("--------------------------------------------------------------- Puntuación: " + contarCartasAz() + " --------------------------------------------------------------");
            jLabelPuntM.setText("--------------------------------------------------------------- Puntuación: " + contarCartasRoj() + " --------------------------------------------------------------");
        }
        
        jButtonAtacarIzq.setEnabled(true);
        jButtonAtacarDcha.setEnabled(true);
        jButtonRivalAtaca.setEnabled(false);
        
        guardarPartida();
        
        if(tabl1.tableroEstaLleno()) {
            int conf;
            
            if(jugU.getRojo()) {
                if(contarCartasRoj() > contarCartasAz()) {
                    conf = JOptionPane.showConfirmDialog(this, "¡Has ganado la partida! \n¿Quieres jugar otra vez?", "RESULTADO", JOptionPane.YES_NO_OPTION);
                    for(int i = 0; i < 10; i++) {
                        if(tabl1.getTablCarta(i).getRojo() == jugU.getRojo()) {
                            int increm = tabl1.getTablCarta(i).getValorDcho();
                            increm += tabl1.getTablCarta(i).getValorIzq();
                            if(tabl1.getTablCarta(i).getEsp()) increm = increm*2;
                            jugU.incremPunt(increm);
                        }
                    }
                    jugU.sumarGanada();
                }
                else if(contarCartasRoj() == contarCartasAz()) conf = JOptionPane.showConfirmDialog(this, "Has empatado la partida... ¡Ha estado reñido! \n¿Quieres jugar otra vez?", "RESULTADO", JOptionPane.YES_NO_OPTION);
                else conf = JOptionPane.showConfirmDialog(this, "Has perdido la partida... ¡Mejor suerte la próxima! \n¿Quieres jugar otra vez?", "RESULTADO", JOptionPane.YES_NO_OPTION);
            } else {
                if(contarCartasRoj() < contarCartasAz()) {
                    conf = JOptionPane.showConfirmDialog(this, "¡Has ganado la partida! \n¿Quieres jugar otra vez?", "RESULTADO", JOptionPane.YES_NO_OPTION);
                    for(int i = 0; i < 10; i++) {
                        if(tabl1.getTablCarta(i).getRojo() == jugU.getRojo()) {
                            int increm = tabl1.getTablCarta(i).getValorDcho();
                            increm += tabl1.getTablCarta(i).getValorIzq();
                            if(tabl1.getTablCarta(i).getEsp()) increm = increm*2;
                            jugU.incremPunt(increm);
                        }
                    }
                    jugU.sumarGanada();
                }
                else if(contarCartasRoj() == contarCartasAz()) conf = JOptionPane.showConfirmDialog(this, "Has empatado la partida... ¡Ha estado reñido! \n¿Quieres jugar otra vez?", "RESULTADO", JOptionPane.YES_NO_OPTION);
                else conf = JOptionPane.showConfirmDialog(this, "Has perdido la partida... ¡Mejor suerte la próxima! \n¿Quieres jugar otra vez?", "RESULTADO", JOptionPane.YES_NO_OPTION);
            }
            
            jugU.sumarJugada();
            jugU.setRival(null);
            jugU.setTablero(null);
            guardarPartida();
            
            if(conf == 0) jButtonReinicioActionPerformed(evt);
            else jButtonCancelarActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonRivalAtacaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCartasManoJ1;
    private javax.swing.ButtonGroup buttonGroupMesa;
    private javax.swing.JButton jButtonAtacarDcha;
    private javax.swing.JButton jButtonAtacarIzq;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonReinicio;
    private javax.swing.JButton jButtonRivalAtaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEspManoM0;
    private javax.swing.JLabel jLabelEspManoM1;
    private javax.swing.JLabel jLabelEspManoM2;
    private javax.swing.JLabel jLabelEspManoM3;
    private javax.swing.JLabel jLabelEspManoM4;
    private javax.swing.JLabel jLabelEspManoU0;
    private javax.swing.JLabel jLabelEspManoU1;
    private javax.swing.JLabel jLabelEspManoU2;
    private javax.swing.JLabel jLabelEspManoU3;
    private javax.swing.JLabel jLabelEspManoU4;
    private javax.swing.JLabel jLabelEspTabl0;
    private javax.swing.JLabel jLabelEspTabl1;
    private javax.swing.JLabel jLabelEspTabl2;
    private javax.swing.JLabel jLabelEspTabl3;
    private javax.swing.JLabel jLabelEspTabl4;
    private javax.swing.JLabel jLabelEspTabl5;
    private javax.swing.JLabel jLabelEspTabl6;
    private javax.swing.JLabel jLabelEspTabl7;
    private javax.swing.JLabel jLabelEspTabl8;
    private javax.swing.JLabel jLabelEspTabl9;
    private javax.swing.JLabel jLabelManoM0;
    private javax.swing.JLabel jLabelManoM1;
    private javax.swing.JLabel jLabelManoM2;
    private javax.swing.JLabel jLabelManoM3;
    private javax.swing.JLabel jLabelManoM4;
    private javax.swing.JLabel jLabelManoMDcha0;
    private javax.swing.JLabel jLabelManoMDcha1;
    private javax.swing.JLabel jLabelManoMDcha2;
    private javax.swing.JLabel jLabelManoMDcha3;
    private javax.swing.JLabel jLabelManoMDcha4;
    private javax.swing.JLabel jLabelManoMIzq0;
    private javax.swing.JLabel jLabelManoMIzq1;
    private javax.swing.JLabel jLabelManoMIzq2;
    private javax.swing.JLabel jLabelManoMIzq3;
    private javax.swing.JLabel jLabelManoMIzq4;
    private javax.swing.JLabel jLabelManoU0;
    private javax.swing.JLabel jLabelManoU1;
    private javax.swing.JLabel jLabelManoU2;
    private javax.swing.JLabel jLabelManoU3;
    private javax.swing.JLabel jLabelManoU4;
    private javax.swing.JLabel jLabelManoUDcha0;
    private javax.swing.JLabel jLabelManoUDcha1;
    private javax.swing.JLabel jLabelManoUDcha2;
    private javax.swing.JLabel jLabelManoUDcha3;
    private javax.swing.JLabel jLabelManoUDcha4;
    private javax.swing.JLabel jLabelManoUIzq0;
    private javax.swing.JLabel jLabelManoUIzq1;
    private javax.swing.JLabel jLabelManoUIzq2;
    private javax.swing.JLabel jLabelManoUIzq3;
    private javax.swing.JLabel jLabelManoUIzq4;
    private javax.swing.JLabel jLabelPuntM;
    private javax.swing.JLabel jLabelPuntU;
    private javax.swing.JLabel jLabelTablero0;
    private javax.swing.JLabel jLabelTablero1;
    private javax.swing.JLabel jLabelTablero2;
    private javax.swing.JLabel jLabelTablero3;
    private javax.swing.JLabel jLabelTablero4;
    private javax.swing.JLabel jLabelTablero5;
    private javax.swing.JLabel jLabelTablero6;
    private javax.swing.JLabel jLabelTablero7;
    private javax.swing.JLabel jLabelTablero8;
    private javax.swing.JLabel jLabelTablero9;
    private javax.swing.JLabel jLabelTableroDcha0;
    private javax.swing.JLabel jLabelTableroDcha1;
    private javax.swing.JLabel jLabelTableroDcha2;
    private javax.swing.JLabel jLabelTableroDcha3;
    private javax.swing.JLabel jLabelTableroDcha4;
    private javax.swing.JLabel jLabelTableroDcha5;
    private javax.swing.JLabel jLabelTableroDcha6;
    private javax.swing.JLabel jLabelTableroDcha7;
    private javax.swing.JLabel jLabelTableroDcha8;
    private javax.swing.JLabel jLabelTableroDcha9;
    private javax.swing.JLabel jLabelTableroIzq0;
    private javax.swing.JLabel jLabelTableroIzq1;
    private javax.swing.JLabel jLabelTableroIzq2;
    private javax.swing.JLabel jLabelTableroIzq3;
    private javax.swing.JLabel jLabelTableroIzq4;
    private javax.swing.JLabel jLabelTableroIzq5;
    private javax.swing.JLabel jLabelTableroIzq6;
    private javax.swing.JLabel jLabelTableroIzq7;
    private javax.swing.JLabel jLabelTableroIzq8;
    private javax.swing.JLabel jLabelTableroIzq9;
    private javax.swing.JPanel jPanelRival;
    private javax.swing.JPanel jPanelTablero;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JRadioButton jRadioButtonJugadorU0;
    private javax.swing.JRadioButton jRadioButtonJugadorU1;
    private javax.swing.JRadioButton jRadioButtonJugadorU2;
    private javax.swing.JRadioButton jRadioButtonJugadorU3;
    private javax.swing.JRadioButton jRadioButtonJugadorU4;
    private javax.swing.JRadioButton jRadioButtonTablero0;
    private javax.swing.JRadioButton jRadioButtonTablero1;
    private javax.swing.JRadioButton jRadioButtonTablero2;
    private javax.swing.JRadioButton jRadioButtonTablero3;
    private javax.swing.JRadioButton jRadioButtonTablero4;
    private javax.swing.JRadioButton jRadioButtonTablero5;
    private javax.swing.JRadioButton jRadioButtonTablero6;
    private javax.swing.JRadioButton jRadioButtonTablero7;
    private javax.swing.JRadioButton jRadioButtonTablero8;
    private javax.swing.JRadioButton jRadioButtonTablero9;
    // End of variables declaration//GEN-END:variables
}
