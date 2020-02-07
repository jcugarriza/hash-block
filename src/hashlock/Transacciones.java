package hashlock;

import java.util.ArrayList;

public class Transacciones {
    
    ArrayList<Transaccion> listTransacciones = new ArrayList<>();

    public Transacciones() {
        listTransacciones = new ArrayList<>();
    }
    
    void addTransaccion(Transaccion transaccion){
        this.listTransacciones.add(transaccion);
    }
    
    void clear(){
        this.listTransacciones.clear();
    }
    
}
