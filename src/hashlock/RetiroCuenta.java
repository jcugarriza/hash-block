package hashlock;

public class RetiroCuenta extends Transaccion{
    
    String hashCuenta;
    float monto;

    public RetiroCuenta(TipoTransaccion tipoTransaccion, String hashCuenta, float monto) {
        super(tipoTransaccion);
        this.hashCuenta = hashCuenta;
        this.monto = monto;
    }
}
