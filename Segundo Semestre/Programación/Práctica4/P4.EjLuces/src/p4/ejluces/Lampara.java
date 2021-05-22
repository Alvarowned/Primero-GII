package p4.ejluces;

public class Lampara {
    private boolean encendida;
    private int intensidad;
    private double voltaje;
    
    public Lampara() {
        this.voltaje = 0;
        this.encendida = false;
        this.intensidad = 0;
    }
    
    public boolean getEncendida() {
        return encendida;
    }
    
    public void setIntensidad(double voltaje) {
        this.voltaje = voltaje;
        this.intensidad = (int)(((voltaje - 1.5)/11)*100);
        if(voltaje > 12.5) this.intensidad = 100;
        if(voltaje < 0) System.err.println("Voltaje no válido.");
        this.encendida = (boolean)(voltaje > 1.5);
    }
    
    public int getIntensidad() {
        return intensidad;
    }
    
    public double getVoltaje() {
        return voltaje;
    }
    
    @Override
    public String toString() {
        String encendidatxt;
        if(encendida) encendidatxt = "ON";
        else encendidatxt = "OFF";
        return "Lámpara: " + encendidatxt + ", Intensidad: " + intensidad + "%.";
    }
}
