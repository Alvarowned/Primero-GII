package Talleres;

public class PruebaTalleres {
    public static void main(String[] args) {
        Taller t1 = new Taller("Taller Pepe", "916759456", 50);
        Vehiculo v1 = new Vehiculo("7435TRE", "Picasso", "A4");
        Pieza p1 = new Pieza("Rueda", 38);
        Pieza p2 = new Pieza("Freno de mano", 100);
        
        v1.añadirPieza(p1);
        v1.añadirPieza(p2);
        
        System.out.println("Taller 1, vehículo 1. Precio: " + t1.repararVehiculo(v1, 20) + "€.");
    }
}