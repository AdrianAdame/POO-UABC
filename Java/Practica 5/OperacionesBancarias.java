import java.util.ArrayList;

public class OperacionesBancarias {

    public static int getCuenta(int PIN, ArrayList<Cuenta> cuentasRegistradas){

        boolean encontrada = false;
        int indice = -1;

        for(int i = 0; i < cuentasRegistradas.size(); i++){
            if(cuentasRegistradas.get(i).getPIN() == PIN){
                indice = i;
                encontrada = true;
                break;
            }
        }

        return encontrada ? indice : -1;
    }

    public static boolean retiroEfectivo(Cuenta cuenta){
        try {
            float saldoAnterior = 0;

            float nuevaCantidad = ClaseIO.capturaFloat("Ingrese el monto a retirar");

            if (nuevaCantidad < 0) {
                System.out.println("ERROR: No se puede retirar cantidades menores a 0");
                return false;
            }
            else {
                if (nuevaCantidad <= cuenta.getSaldo()) {
                    saldoAnterior = cuenta.getSaldo();
                    cuenta.setSaldo(cuenta.getSaldo() - nuevaCantidad);
                } else {
                    ClaseIO.imprimirMensaje("ERROR: No se puede retirar mas de lo que tiene");
                }
            }

            ClaseIO.imprimirMensaje("Saldo anterior: " + saldoAnterior);
        } catch (Exception e) {
            ClaseIO.imprimirMensaje("Se requiere un valor numerico valido!");
            return false;
        }
        return true;
    }

    public static boolean depositoEfectivo(Cuenta cuenta){
        try {
            float saldoAnterior = 0;

            float nuevaCantidad = ClaseIO.capturaFloat("Ingrese el monto a depositar");

            if (nuevaCantidad < 0){
                System.out.println("ERROR: No se puede retirar cantidades menores a 0");
                return false;
            }
            else {
                saldoAnterior = cuenta.getSaldo();
                cuenta.setSaldo(cuenta.getSaldo() + nuevaCantidad);
            }

            ClaseIO.imprimirMensaje("Saldo anterior: " + saldoAnterior);

        } catch (Exception e) {
            ClaseIO.imprimirMensaje("Se requiere un valor numerico valido!");
            return false;
        }

        return true;

    }
}