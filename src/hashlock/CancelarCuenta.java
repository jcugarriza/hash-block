package hashlock;

public class CancelarCuenta extends Transaccion{
    
    String hashCuenta;

    public CancelarCuenta(TipoTransaccion tipoTransaccion, String hashCuenta) {
        super(tipoTransaccion);
        this.hashCuenta = hashCuenta;
    }
    
}
