package AcademiaIdiomas;

import java.util.ArrayList;

public class Curso {
    private String idioma, nivel;
    private double precioBase;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos; 
    
    public Curso(String idioma, String nivel, double precioBase, Profesor profesor){
        this.idioma = idioma;
        this.nivel = nivel;
        this.precioBase = precioBase;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }
    
    public String getIdioma(){
        return idioma;
    }
    
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    
    public String getNivel(){
        return nivel;
    }
    
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    public void setPrecioBase(double precioBase){
        this.precioBase = precioBase ;
    }
    
    public Profesor getProfesor(){
        return profesor;
    }
    
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
            
    public double inscripcionAlumno(Alumno alumno){
        alumno.setCurso(this);
        if(!alumnos.contains(alumno)){
            alumnos.add(alumno);
        }
        if(alumno.getEdad() > 65){
            return (precioBase - 0.15*precioBase);
        } else return precioBase;
    }
    
    public boolean bajaAlumno(Alumno alumno){
        if(!alumnos.contains(alumno)) return false;
        else{
            alumnos.remove(alumno);
            return true;
        }
    }
    
    @Override
    public String toString(){ //No añado la lista de alumnos ya que se podrá obtener a traves del método listaAlumnos a través del personal de administración
        return "Curso {" + idioma + ", " + nivel + ", precio base=" + precioBase + ", " + profesor.toString() + "}";
    }
}
