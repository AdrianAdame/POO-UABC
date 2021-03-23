public class MenuTransaccionesCuenta {

    public static Cuenta menuTransacciones(Cuenta cuenta){

        int opcion = 0;
        boolean operacionRealizada = false;

        String []  opciones = {"Depositar Efectivo", "Retirar Efectivo", "Consultar Saldo Actual"};

        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\n\n\t\tMENU DE TRANSACCIONES\n\n \tBienvenido(a): " + cuenta.getCliente().getNombre()+ "\n\n");
            ClaseIO.imprimirMenu(opciones);
            opcion = ClaseIO.capturaEntero("Que opcion elige?");

            switch (opcion) {
                case 1 -> {
                    operacionRealizada = OperacionesBancarias.depositoEfectivo(cuenta);

                    if(operacionRealizada){
                        ClaseIO.imprimirMensaje(" \n\tLa nueva cantidad es ahora: $" + cuenta.getSaldo() + " MXN");
                    }else{
                        ClaseIO.imprimirMensaje("ERROR: No se puede retirar mas de lo que tiene");
                    }

                    operacionRealizada = false;

                    ClaseIO.pausa();
                }

                case 2 -> {
                    operacionRealizada = OperacionesBancarias.retiroEfectivo(cuenta);

                    if(operacionRealizada){
                        ClaseIO.imprimirMensaje(" \n\tLa nueva cantidad es ahora: $" + cuenta.getSaldo() + " MXN");
                    }else{
                        ClaseIO.imprimirMensaje("ERROR: No se puede retirar mas de lo que tiene");
                    }

                    operacionRealizada = false;

                    ClaseIO.pausa();
                }

                case 3 -> {
                    ClaseIO.imprimirMensaje("Saldo Actual: " + cuenta.getSaldo());
                    ClaseIO.pausa();
                }

                case 4 -> ClaseIO.imprimirMensaje("Regresando al menu Principal...");

                default -> {
                    ClaseIO.imprimirMensaje("Opcion ingresada no valida!");
                    ClaseIO.pausa();
                }
            }
        }while (opcion != 4);

        return cuenta;
    }
}
