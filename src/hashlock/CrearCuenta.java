package hashlock;

public class CrearCuenta extends Transaccion {
    
    String frase;

    public CrearCuenta(TipoTransaccion tipoTransaccion, String frase) {
        super(tipoTransaccion);
        this.frase = frase;
    }

    
    
}
