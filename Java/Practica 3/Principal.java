public class Principal {

    public static void main(String[] args){
        Persona [] personas =  new Persona[3];

        String nombre, fechaNacimiento;

        System.out.println("Persona 1\n\n");

        nombre = CapturaEntrada.capturaString("Nombre completo");

        personas[0] = new Persona(nombre,
                CURP.generarCURP(nombre,
                        CapturaEntrada.capturaChar("Genero"),
                        CapturaEntrada.capturaString("Fecha de nacimiento < Separado por un espacio >"),
                        CapturaEntrada.capturaString("Entidad")),
                null);

        System.out.println("Persona 2 \n\n");

        nombre = CapturaEntrada.capturaString("Nombre completo");

        personas[1] = new Persona(nombre,
                null,
                RFC.generarRFC(nombre,
                        CapturaEntrada.capturaString("Fecha de nacimiento < Separado por un espacio >"))
        );

        System.out.println("Persona 3 \n\n");

        nombre = CapturaEntrada.capturaString("Nombre completo");
        fechaNacimiento = CapturaEntrada.capturaString("Fecha de nacimiento < Separado por un espacio >");

        personas[2] = new Persona(nombre,
                CURP.generarCURP(nombre,
                        CapturaEntrada.capturaChar("Genero"),
                        fechaNacimiento,
                        CapturaEntrada.capturaString("Entidad")),
                RFC.generarRFC(nombre,
                        fechaNacimiento)
        );

        for(Persona persona : personas){
            persona.imprimirDatos();
        }




    }
}
