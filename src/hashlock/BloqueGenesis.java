package hashlock;

public class BloqueGenesis extends Bloque {
    
    ContratoBanco c;
    
    public BloqueGenesis(String hashAnterior, ContratoBanco c) {
        super(hashAnterior);
        this.c = c;
        
        //hashBloque es calculado según hashAnterior y c
        this.hashBloque = Hashlock.calculateHash(hashAnterior + c.toString());
    }

}
