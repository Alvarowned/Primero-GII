package CuentasBanco;

public class PruebaCuentas {
    public static void main(String[] args) {
        Titular t1 = new Titular("34871154J", "Manolo Pérez", 918025743, "Alcalá");
        Titular t2 = new Titular("73196132Y", "Pepito Paéz", 602754835, "Madrid");
        
        CuentaPlazo cp1 = new CuentaPlazo("85724923", 1500, 6, t1);
        System.out.println(cp1.toString());
        
        cp1.altaTitular(t2);
        System.out.println(cp1.toString());
        System.out.println(cp1.getTitulares());
        
        CuentaCorriente cc1 = new CuentaCorriente("23525223", 2300, 5345525, t1);
        System.out.println(cc1.getFechaApertura());
        cc1.ingresarDinero(64000);
        System.out.println(cc1.toString());
    }
}
