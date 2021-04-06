import IO.ClaseIO;

public class Principal {

    public static void main(String [] args){

        int opcion;

        Zoo zoologico = new Zoo(new Veterinario("Adrian Adame", 12000));

        String [] opciones = new String[]{"Animales dentro del complejo", "Actividades para Veterinario", "Imprimir registros"};

        do{
            ClaseIO.limpiaPantalla();
            ClaseIO.imprimirMensaje("\t\tMENU DE OPCIONES PARA EL ZOO\n\n");
            ClaseIO.imprimirMenu(opciones);
            opcion = ClaseIO.capturaEntero("Que opcion elige?");

            switch (opcion){
                case 1 ->{
                    MenusSecundarios.menuAnimales(zoologico);
                    ClaseIO.pausa();
                }

                case 2 ->{
                    MenusSecundarios.menuVeterinario(zoologico);
                    ClaseIO.pausa();
                }

                case 3 ->{
                    zoologico.imprimirInformacionVeterinario();

                    if(!zoologico.getAnimales().isEmpty()) {
                        ClaseIO.imprimirMensaje("\n\nAnimales registrados en el zoologico:\n");

                        zoologico.imprimirRegistroAnimales();
                    }else{
                        ClaseIO.imprimirMensaje("ERROR: No hay animales registrados!");
                    }

                    ClaseIO.pausa();
                }

                case 4 -> ClaseIO.imprimirMensaje("Gracias por su visita!");

                default -> {
                    ClaseIO.imprimirMensaje("Opcion no valida!");
                    ClaseIO.pausa();
                }
            }
        }while(opcion != 4);

    }
}
