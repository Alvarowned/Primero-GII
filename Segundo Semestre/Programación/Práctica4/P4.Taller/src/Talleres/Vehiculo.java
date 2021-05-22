package Talleres;

import java.util.ArrayList;

public class Vehiculo {
    private final String matricula, marca, modelo;
    private ArrayList<Pieza> piezas;
    
    public Vehiculo (String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.piezas = new ArrayList<>();
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void añadirPieza(Pieza pieza) {
        if(!piezas.contains(pieza)){
            piezas.add(pieza);
        }
    }
    
    public void eliminarPieza(Pieza pieza) {
        if(piezas.contains(pieza)){
            piezas.remove(pieza);
        }
    }
    
    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }
    
    @Override
    public String toString() {
        return "Vehiculo {" + piezas + ", matrícula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "}";
    }
}
