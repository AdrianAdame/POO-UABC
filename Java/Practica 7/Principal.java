import IO.ClaseIO;

public class Principal {

    public static void main(String [] args){

        RobotPreparador robotPreparador = new RobotPreparador("Masashi", 100, "Robot-01", "Apagado");
        RobotCocinador robotCocinador = new RobotCocinador("Sakuta", 100, "Robot-02", "Apagado", 185);

        Platillo platillo = new Platillo("Dumplings", 0);

        int opciones = 0, seleccionRobot = -1;

        String[] menuOpciones = new String[]{"Robot Preparador", "Robor Cocinador","Accion a realizar","Mostrar estado del platillo"};

        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\t\t RESTAURANTE CON LOS ROBOTS CHEF PIONEROS!");
            ClaseIO.imprimirMenu(menuOpciones);
            ClaseIO.imprimirMensaje("\t Estado de los robots:");
            ClaseIO.imprimirMensaje(
                    "Robot: " + robotPreparador.getNombre() + "   ID: " + robotPreparador.getId() +
                    " | Bateria restante: " + robotPreparador.getBateriaRestante() + " | Ultima Accion realizada: " + robotPreparador.getUltimaAccionRealizada());
            ClaseIO.imprimirMensaje(
                    "Robot: " + robotCocinador.getNombre() + "    ID: " + robotCocinador.getId() +
                            " | Bateria restante: " + robotCocinador.getBateriaRestante() + " | Ultima Accion realizada: " + robotCocinador.getUltimaAccionRealizada());

            opciones = ClaseIO.capturaEntero("\nIngresa la opcion a utilizar");

            switch (opciones){
                case 1 -> {
                    ClaseIO.imprimirMensaje("Selecciono Robot " + robotPreparador.getNombre());
                    robotPreparador.enceder();
                    robotPreparador.moverBrazos();
                    seleccionRobot = 0;
                    ClaseIO.pausa();
                }

                case 2 -> {
                    ClaseIO.imprimirMensaje("Selecciono Robot " + robotCocinador.getNombre());
                    robotCocinador.enceder();
                    robotCocinador.moverBrazos();
                    seleccionRobot = 1;
                    ClaseIO.pausa();
                }

                case 3 -> {
                    if(seleccionRobot != -1){
                        if(seleccionRobot == 0){
                            menuAccionesPlatillo(robotPreparador ,platillo);
                        }else{
                            menuAccionesPlatillo(robotCocinador, platillo);
                        }
                    }else{
                        ClaseIO.imprimirMensaje("ERROR: Se tiene que seleccionar un robot antes de continuar");
                    }
                    ClaseIO.pausa();
                }

                case 4 -> {
                    ClaseIO.imprimirMensaje("Estado del platillo: " + platillo.getEstadoPlatillo());
                    ClaseIO.imprimirMensaje("¡Hurra! El plato estaba delicioso");
                    ClaseIO.pausa();
                }

                case 5-> {
                    ClaseIO.imprimirMensaje("Gracias por utilizar nuestros robots!");
                    ClaseIO.pausa();
                }

                default -> {
                    ClaseIO.imprimirMensaje("ERROR: Opcion no valida!");
                    ClaseIO.pausa();
                }

            }
        }while (opciones != 5);


    }

    public static void menuAccionesPlatillo(Robot r, Platillo platillo){
        int opciones = 0;

        String [] menuOpciones = new String[]{"Preparar ingredientes", "Cocinar Platillo", "Servir Platillo"};

        do{
            ClaseIO.imprimirMensaje("Esta trabajando con el robot: " + r.getNombre());
            ClaseIO.imprimirMenu(menuOpciones);

            opciones = ClaseIO.capturaEntero("Que Accion desea realizar primero?");

            switch (opciones){
                case 1-> {
                    if( r instanceof RobotPreparador){
                        ((RobotPreparador) r).prepararIngredientes();
                        platillo.setEstadoPlatillo(1);
                    }else{
                        ((RobotCocinador) r).prepararIngredientes();
                    }
                    ClaseIO.pausa();
                }
                case 2 -> {
                    if( r instanceof RobotPreparador){
                        ((RobotPreparador) r).cocinarPlatillo();
                    }else{
                        ((RobotCocinador) r).cocinarPlatillo();
                        platillo.setEstadoPlatillo(3);
                    }
                    ClaseIO.pausa();
                }

                case 3 -> {
                    if(platillo.getNombrePlatilloI() > 2){
                        r.servirPlatillo();
                    }else{
                        ClaseIO.imprimirMensaje("ERROR: Falto algun paso por realizar!");
                    }
                    ClaseIO.pausa();
                }

                default -> {
                    ClaseIO.imprimirMensaje("ERROR: Opcion no valida!");
                    ClaseIO.pausa();
                }

                case 4 -> ClaseIO.imprimirMensaje("Regresando al menu principal");
            }

        }while (opciones != 4);
    }

    static class Platillo{
        protected String nombrePlatillo;
        int estadoPlatillo;

        public Platillo(String nombrePlatillo, int estadoPlatillo){
            this.nombrePlatillo = nombrePlatillo;
            this.estadoPlatillo = estadoPlatillo;
        }

        public String getEstadoPlatillo() {
            return switch (estadoPlatillo) {
                case 0 -> "No iniciado";
                case 1 -> "Ingredientes preparados";
                case 2 -> "Platillo cocinado";
                case 3 -> "Platillo servido";
                default -> "Error: Estado desconocido!!";
            };
        }

        public String getNombrePlatillo() {
            return nombrePlatillo;
        }

        public int getNombrePlatilloI(){
            return estadoPlatillo;
        }

        public void setEstadoPlatillo(int estadoPlatillo) {
            this.estadoPlatillo = estadoPlatillo;
        }

        public void setNombrePlatillo(String nombrePlatillo) {
            this.nombrePlatillo = nombrePlatillo;
        }
    }
}
