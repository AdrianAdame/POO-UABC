public class Principal {
    public static void main(String [] args){
        Cuenta tempCuenta = null;
        Banco banco = new Banco("Sin nombre");

        int opcion = 0;

        String [] opciones = {"Crear nueva cuenta", "Realizar transacciones sobre alguna cuenta existente", "Mostrar cuentas registradas"};
        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\n\t\t MENU DE OPCIONES \n\n Banco: " + banco.getNombreBanco() + "\n\n");
            ClaseIO.imprimirMenu(opciones);

            opcion = ClaseIO.capturaEntero("Que opcion elige?");

            switch (opcion) {
                case 1 -> {
                    tempCuenta = new Cuenta(
                            new Persona(
                                    ClaseIO.capturaCadena("Nombre completo"),
                                    ClaseIO.capturaEntero("Edad"),
                                    ClaseIO.capturaCadena("Fecha de nacimiento << Separados por una diagonal / >>"),
                                    ClaseIO.capturaCadena("Correo Electronico"),
                                    ClaseIO.capturaCadena("Direccion")),
                            ClaseIO.capturaFloat("Saldo inicial de la cuenta"),
                            ClaseIO.capturaEntero("PIN")
                    );

                    if(ValidacionCuenta.validarEdad(tempCuenta) && ValidacionCuenta.validarFechaNacimiento(tempCuenta) && ValidacionCuenta.validarMontoApertura(tempCuenta))
                        banco.agregarNuevaCuenta(tempCuenta);
                    else
                        ClaseIO.imprimirMensaje("ERROR: Para crear una cuenta se necesita ser mayor de edad y tener un saldo arriba de $500 MXN");
                    ClaseIO.pausa();
                }

                case 2 -> {
                    int tempPIN = ClaseIO.capturaEntero("Ingresa el PIN de la cuenta");
                    int indice = OperacionesBancarias.getCuenta(tempPIN, banco.getCuentasRegistradas());
                    if (indice != -1) {
                        tempCuenta = banco.getCuentasRegistradas().get(indice);

                        banco.getCuentasRegistradas().remove(tempCuenta);

                        banco.getCuentasRegistradas().add(
                                indice,
                                MenuTransaccionesCuenta.menuTransacciones(tempCuenta));
                    } else {
                        ClaseIO.imprimirMensaje("Cuenta no encontrada...");
                    }
                    ClaseIO.pausa();
                }
                case 3 -> {
                    if (banco.getCuentasRegistradas().isEmpty()) {
                        ClaseIO.imprimirMensaje("ERROR: No se encontraron datos por imprimir...");
                    } else {
                        int validacion = ClaseIO.capturaEntero("Codigo para mostrar informacion sensible");

                        if (validacion == 0) {
                            banco.imprimirCuentasRegistradas(false);
                        } else {
                            ClaseIO.imprimirMensaje("ERROR: Codigo incorrecto");
                            banco.imprimirCuentasRegistradas(true);
                        }
                    }
                    ClaseIO.pausa();
                }
            }
        }while(opcion != 4);
    }
}
