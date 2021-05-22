package CuentasBanco;

public class CuentaPlazo extends Cuenta {
    private int numAños;
    
    public CuentaPlazo(String numCuenta, double saldo, int numAños, Titular titular) {
        super(numCuenta, saldo);
        this.numAños = numAños;
        super.altaTitular(titular);
    }
    
    public long getNumAños() {
        return numAños;
    }
    
    public void setNumAños(int numAños) {
        this.numAños = numAños;
    }
    
    @Override
    public String toString() {
        return "Cuenta Plazo {" + super.toString() + ", número de años=" + numAños + "}";
    }
}
