package hashlock;

public class BloqueTransaccion extends Bloque {

    Transacciones transacciones;
    
    public BloqueTransaccion(String hashAnterior, Transacciones transacciones) {
        super(hashAnterior);
        this.transacciones = transacciones;
        
        //hashBloque es calculado según "0" y c
        this.hashBloque = Hashlock.calculateHash(hashAnterior + transacciones.toString());
    }

}
