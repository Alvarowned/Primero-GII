package AcademiaIdiomas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno extends Persona{
    private int edad;
    private String num;
    private float calificacion;
    private final LocalDate fechaInscripcion;
    private Curso curso;
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Alumno(String nombre, String nif, int edad, String num, Curso curso) {
        super(nombre, nif);
        this.edad = edad;
        this.num = num;
        this.calificacion = -1; //Se editara mediante un setCalificacion cuando haya una nota
        this.fechaInscripcion = LocalDate.now();
        this.curso = curso;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNum(){
        return num;
    }
    
    public void setNum(String num){
        this.num = num;
    }
    
    public float getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }
    
    public Curso getCurso(){
        return curso;
    }
    
    public void setCurso(Curso curso){ //Cuando cambia el curso, da de baja en el curso en el que está y lo inscribe en el nuevo
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return "Alumno {" + super.toString() + ", edad=" + edad + ", número de alumno=" + num + ", calificación=" + calificacion + ", fecha de inscripción=" + fechaInscripcion.format(formato) + ", " + curso.toString() + "}";
    }
}
