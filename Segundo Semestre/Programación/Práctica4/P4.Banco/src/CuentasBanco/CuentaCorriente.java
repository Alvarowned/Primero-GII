package CuentasBanco;

public class CuentaCorriente extends Cuenta {
    private long numTarjetaCredito;
    
    public CuentaCorriente(String numCuenta, double saldo, long numTarjetaCredito, Titular titular) {
        super(numCuenta, saldo);
        this.numTarjetaCredito = numTarjetaCredito;
        super.altaTitular(titular);
    }
    
    public long getNumTarjetaCredito() {
        return numTarjetaCredito;
    }
    
    public void setNumTarjetaCredito(long numTarjetaCredito) {
        this.numTarjetaCredito = numTarjetaCredito;
    }
    
    @Override
    public String toString() {
        return "Cuenta Corriente {" + super.toString() + ", número de tarjeta de crédito=" + numTarjetaCredito + "}";
    }
}
