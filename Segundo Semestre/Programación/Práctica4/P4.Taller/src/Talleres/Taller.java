package Talleres;

import java.util.ArrayList;

public class Taller {
    private String nombre, telefono;
    private double precioHora;
    
    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public double getPrecioHora() {
        return precioHora;
    }
    
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    public double repararVehiculo(Vehiculo vehiculo, double horas) {
        double precioTotal = this.precioHora*horas;
        ArrayList<Pieza> piezas = vehiculo.getPiezas();
        
        for (int i = 0; i < piezas.size(); i++) {
            precioTotal += (piezas.get(i).getPrecio());
        }
        
        return precioTotal;
    }
    
    @Override
    public String toString() {
        return "Taller {" + nombre + ", precio = " + precioHora + "€/hora}";
    }
}
