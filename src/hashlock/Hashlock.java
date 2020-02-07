package hashlock;

import java.security.MessageDigest;

public class Hashlock {

    public static void main(String[] args) {

        //se muestra un nuevo menú HashFrame
        HashFrame hf = new HashFrame();
        hf.setVisible(true);

        int chainId = 1234;

        ContratoBanco c = new ContratoBanco();
        Cadena cadena = new Cadena(chainId, c);

        Transacciones data = new Transacciones();
        data.addTransaccion(new CrearCuenta(TipoTransaccion.CREAR_CUENTA, "pedromario"));
        data.addTransaccion(new CrearCuenta(TipoTransaccion.CREAR_CUENTA, "pedromario"));
        cadena.addBlock(data);

        data.clear();
        data.addTransaccion(new RetiroCuenta(TipoTransaccion.RETIRAR_FONDOS,
                "2eb307b3dbe2bb6008b14c3341f377c29703694c31425202fa642b6b297aa46e", 1000));
        data.addTransaccion(new DepositoCuenta(TipoTransaccion.DEPOSITAR_FONDOS,
                "2eb307b3dbe2bb6008b14c3341f377c29703694c31425202fa642b6b297aa46e", 1000));
        data.addTransaccion(new RetiroCuenta(TipoTransaccion.RETIRAR_FONDOS,
                "2eb307b3dbe2bb6008b14c3341f377c29703694c31425202fa642b6b297aa46e", 1200));
        data.addTransaccion(new RetiroCuenta(TipoTransaccion.RETIRAR_FONDOS,
                "2eb307b3dbe2bb6008b14c3341f377c29703694c31425202fa642b6b297aa46e", 200));
        cadena.addBlock(data);

        data.clear();
        data.addTransaccion(new CrearCuenta(TipoTransaccion.CREAR_CUENTA, "carlosalberto"));
        cadena.addBlock(data);

        data.clear();
        data.addTransaccion(new TransferenciaCuentas(TipoTransaccion.TRANSFERENCIA_FONDOS,
                "2eb307b3dbe2bb6008b14c3341f377c29703694c31425202fa642b6b297aa46e", "62d050ed0a0d024dc1a31d102138644d9fbab890dd1576ac6d40abcb1f6b3470", 1000));
        data.addTransaccion(new TransferenciaCuentas(TipoTransaccion.TRANSFERENCIA_FONDOS,
                "2eb307b3dbe2bb6008b14c3341f377c29703694c31425202fa642b6b297aa46e", "62d050ed0a0d024dc1a31d102138644d9fbab890dd1576ac6d40abcb1f6b3470", 200));
        cadena.addBlock(data);

        cadena.listAllBlocks();
    }

    //Tomado de: https://stackoverflow.com/questions/5531455/how-to-hash-some-string-with-sha256-in-java
    public static String calculateHash(String base) {

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}
