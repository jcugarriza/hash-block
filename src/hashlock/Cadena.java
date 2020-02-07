package hashlock;

import java.util.ArrayList;

public class Cadena {
    //cada Cadena tiene un identificador y una lista de Bloque
    int chainId;
    ArrayList<Bloque> listBloques;

    public Cadena(int chainId, ContratoBanco c) {
        this.chainId = chainId;
        listBloques = new ArrayList<>();
        
        //cada vez que se crea una Cadena, se crea un BloqueGenesis
        this.listBloques.add(new BloqueGenesis("0", c));
    }
    
    //agregar un nuevo BloqueTransaccion
    void addBlock(Transacciones transacciones){
        
        
        //se halla el hashBloque del último Bloque de listBloques
        String hashAnterior = listBloques.get(listBloques.size() - 1).hashBloque;
        
        this.listBloques.add(new BloqueTransaccion(hashAnterior, transacciones));
    }
    
    void listAllBlocks(){
        
    }
}
