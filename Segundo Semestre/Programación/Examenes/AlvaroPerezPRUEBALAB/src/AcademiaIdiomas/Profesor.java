package AcademiaIdiomas;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String nif, String materia) {
        super(nombre, nif);
        this.materia = materia;
    }
    
    public String getMateria(){
        return materia;
    }
    
    public void setMateria(String materia){
        this.materia = materia;
    }
    
    @Override
    public String toString(){
        return "Profesor {" + super.toString() + ", materia=" + materia + "}";
    }
}
