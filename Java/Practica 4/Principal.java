public class Principal {

    public static void main(String [] args){

        PajaroRojo rojo = new PajaroRojo("Red", "Rojo", "Mediano", "Woaaaaa", false);
        PajaroAzul azul = new PajaroAzul("Blue", "Azul", "Chico", "Wuuuu", true);
        PajaroAmarillo amarillo = new PajaroAmarillo("Chuck", "Amarillo", "Mediano", "Weeeee", true);

        Pajaro [] pajaros = new Pajaro[3];

        pajaros[0] = rojo;
        pajaros[1] = azul;
        pajaros[2] = amarillo;

        //Como las subclases tiene sus propios metodos, no es posible llamarlos desde un arreglo de la clase padre
        //Por lo que se imprimimen aparte

        pajaros[0].imprimirInformacion();
        System.out.println("Ataque o accion:");
        rojo.lanzarse();
        System.out.println("\n\n");

        pajaros[1].imprimirInformacion();
        System.out.println("Ataque o accion:");
        azul.dividirse();
        System.out.println("\n\n");

        pajaros[2].imprimirInformacion();
        System.out.println("Ataque o accion:");
        amarillo.AumentoVelocidad();

    }
}
