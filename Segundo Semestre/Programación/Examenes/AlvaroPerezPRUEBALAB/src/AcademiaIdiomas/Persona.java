package AcademiaIdiomas;

public class Persona {
    //Para hacer herencia
    private String nombre, nif;
    
    public Persona(String nombre, String nif){
        this.nombre = nombre;
        this.nif = nif;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNIF(){
        return nif;
    }
    
    public void setNIF(String nif){
        this.nif = nif;
    }
    
    @Override
    public String toString(){
        return "Persona{" + nombre + ", NIF=" + nif + "}";
    }
}
