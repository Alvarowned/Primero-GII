package AcademiaIdiomas;

public class Personal extends Persona{
    private String categoria;
    
    public Personal(String nombre, String nif, String categoria) {
        super(nombre, nif);
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String listadoAlumnos(Curso curso){
        String listaAlumnos = "";
        for(int i = 0; curso.getAlumnos().size() > i; i++){
            listaAlumnos += (curso.getAlumnos().get(i).toString() + "\n");
        }
        return listaAlumnos;
    }
    
    @Override 
    public String toString(){
        return "Personal {" + super.toString() + ", categoría=" + categoria + "}";
    }
}
