package empleados.nominas;

import empleados.Departamento;
import empleados.Empleado;
import empleados.Empresa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nomina {
    private final LocalDate fecha;
    private final double salarioBruto, retencion, salarioNeto;
    private final Empleado empleado;
    private final Empresa empresa;
    private final Departamento departamento;
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Nomina(Empleado empleado, double retencion){
        this.departamento = empleado.getDepartamento();
        this.empresa = departamento.getEmpresa();
        this.empleado = empleado;
        this.retencion = retencion;
        this.salarioBruto = empleado.getSueldo();
        this.salarioNeto = salarioBruto - salarioBruto*(retencion/100);
        this.fecha = LocalDate.now();
    }
    
    @Override
    public String toString(){
        return empleado.toString() + "\n" + empresa.toString() + "\nNómina{salario bruto=" + salarioBruto + ", " + fecha.format(formato) + ", retencion=" + retencion + "%, salario neto=" + salarioNeto + "}";
    }
}
