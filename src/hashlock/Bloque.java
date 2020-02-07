package hashlock;



public abstract class Bloque {
    String hashBloque;
    String hashAnterior;
    

    public Bloque(String hashAnterior) {
        this.hashAnterior = hashAnterior;
        
    }
    
}
