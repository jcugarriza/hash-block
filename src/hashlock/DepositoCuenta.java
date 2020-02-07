package hashlock;

public class DepositoCuenta extends Transaccion{
    
    String hashCuenta;
    float monto;
    
    public DepositoCuenta(TipoTransaccion tipoTransaccion, String hashCuenta, float monto) {
        super(tipoTransaccion);
        this.hashCuenta = hashCuenta;
        this.monto = monto;
    }

}
