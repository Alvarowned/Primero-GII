package CuentasBanco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cuenta {
    private String numCuenta;
    private double saldo;
    private final LocalDate fechaApertura;
    private final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private ArrayList<Titular> titulares;
    
    public Cuenta(String numCuenta, double saldo){
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaApertura = LocalDate.now();
        this.titulares = new ArrayList<>();
    }
    
    public ArrayList<Titular> getTitulares() {
        return titulares;
    }
    
    public void altaTitular(Titular tit) {
        if(!titulares.contains(tit)){
            titulares.add(tit);
        }
    }
    
    public void bajaTitular(Titular tit) {
        if(titulares.contains(tit)){
            titulares.remove(tit);
        }
    }
    
    public LocalDate getFechaApertura(){
        return fechaApertura;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void ingresarDinero(double dinero){
        this.saldo += dinero;
    }
    
    public void retirarDinero(double dinero){
        this.saldo -= dinero;
    }
    
    public String getNumCuenta(){
        return numCuenta;
    }
    
    public void setNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
    }
    
    @Override
    public String toString(){
        return "Cuenta {" + this.getTitulares() + ", fecha de apertura=" + fechaApertura.format(formato) + ", número de cuenta=" + numCuenta + ", saldo=" + saldo + "}";
    }
}
