package hashlock;

import javax.swing.JOptionPane;

public class FuncionesFrame {

    public static Cadena agregarCadena(ContratoBanco c, int size) {
        String inputValue = JOptionPane.showInputDialog(null,
                "Ingrese ID (mayor que 0) de la nueva cadena (# " + size + ")",
                "Crear Cadena", JOptionPane.QUESTION_MESSAGE);
        int chainId;
        try {
            int intInputValue = Integer.parseInt(inputValue);
            if (intInputValue > 0) {
                chainId = intInputValue;
            } else {
                chainId = -1;
            }
        } catch (NumberFormatException e) {
            chainId = -1;
        }
        if (chainId != -1) {
            return new Cadena(chainId, c);
        }
        return null;
    }
    
    public static void guardarBloque(Cadena cadena, Transacciones data){
        cadena.addBlock(data);
        data.clear();
    }
}
