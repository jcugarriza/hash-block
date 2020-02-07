package hashlock;

import java.util.ArrayList;

public class ContratoBanco {

    ArrayList<Cuenta> listCuentas;

    public ContratoBanco() {
        this.listCuentas = new ArrayList<>();
    }

    //lógica del contrato
    public void ejecutar(Transacciones t) {

    }

    //agrega cuenta en listCuentas
    void addCuenta(Cuenta cuenta) {
        this.listCuentas.add(cuenta);
    }
    
    //retorna una Cuenta con hashCuenta en listCuentas
    Cuenta getCuenta(String hashCuenta){
        for (Cuenta cuentaIndex : listCuentas) {
            if (cuentaIndex.hashCuenta.equals(hashCuenta)) {
                return cuentaIndex;
            }
        }
        return null;
    }

    //busca si existe una Cuenta con hashCuenta en listCuentas
    boolean buscarCuenta(String hashCuenta) {
        for (Cuenta cuentaIndex : listCuentas) {
            if (cuentaIndex.hashCuenta.equals(hashCuenta)) {
                return true;
            }
        }
        return false;
    }
    
    //busca cuenta en listCuentas
    boolean buscarCuenta(Cuenta cuenta){
        return listCuentas.contains(cuenta);
    }
    
    //verifica si la Cuenta con hashCuenta tiene fondos iguales o mayores que monto
    boolean suficientesFondos(String hashCuenta, float monto){
        Cuenta cuenta = getCuenta(hashCuenta);
        if (cuenta != null) {
            if (suficientesFondos(cuenta, monto)) {
                return true;
            }
        }
        return false;
    }
    
    //verifica si cuenta tiene fondos iguales o mayores que monto
    boolean suficientesFondos(Cuenta cuenta, float monto){
        return cuenta.fondos >= monto;
    }
}
