package CuentasBanco;

public class Titular {
    private String nif, direccion;
    private final String nombre;
    private int numTelefono;
    
    public Titular (String nif, String nombre, int numTelefono, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
    }
    
    public String getNif() {
        return nif;
    }
    
    public void setNif(String nif) {
        this.nif = nif;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNumTelefono() {
        return numTelefono;
    }
    
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Titular {Nombre=" + nombre + ", NIF=" + nif + ", número de teléfono=" + numTelefono + ", dirección=" + direccion + "}";
    }
}