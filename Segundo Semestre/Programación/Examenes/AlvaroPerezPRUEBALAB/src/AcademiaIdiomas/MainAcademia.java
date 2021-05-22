package AcademiaIdiomas;

public class MainAcademia {
    public static void main(String[] args) {
        Personal per1 = new Personal("Álvaro", "06026427J", "Secretario");
        Profesor p1 = new Profesor("Stina", "156405Y", "Inglés");
        Curso c1 = new Curso("Inglés", "B1", 45.60, p1);
        Alumno a1 = new Alumno("Pepe", "5427640J", 15, "1", c1);
        Alumno a2 = new Alumno("Marta", "8531784U", 67, "2", c1);
        
        double precio1 = c1.inscripcionAlumno(a1);
        
        System.out.println("Precio para Pepe = " + precio1 + "€.");
        System.out.println(per1.listadoAlumnos(c1));
        
        double precio2 = c1.inscripcionAlumno(a2);
                
        System.out.println("Precio para Marta = " + precio2 + "€.");
        System.out.println(per1.listadoAlumnos(c1));
        
        if(c1.bajaAlumno(a2)){
            System.out.println("Dado de baja satisfactoriamente.");
        }
        
        System.out.println(per1.listadoAlumnos(c1));
    }
}
