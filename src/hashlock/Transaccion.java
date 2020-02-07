package hashlock;

public abstract class Transaccion {
    TipoTransaccion tipoTransaccion;

    public Transaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
}
