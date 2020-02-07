package hashlock;

public class TransferenciaCuentas extends Transaccion{
    
    String hashOrigen;
    String hashDestino;
    float monto;
    
    public TransferenciaCuentas(TipoTransaccion tipoTransaccion, String hashOrigen, String hashDestino, float monto) {
        super(tipoTransaccion);
        this.hashOrigen = hashOrigen;
        this.hashDestino = hashDestino;
        this.monto = monto;
    }

}
