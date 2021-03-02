public class Principal {
    public static void main(String [] args){

        Estudiante[] estudiantes =  new Estudiante[10];

        estudiantes[0] =  new Estudiante("Adrian Adame", 1272202, "POO", 60.7f);
        estudiantes[1] = new Estudiante("Eduardo Adame", 1630205, "Espanol", 80.5f);
        estudiantes[2] = new Estudiante("Denisse Adame", 1228394, "Ecuaciones Diferenciales", 59.9f);
        estudiantes[3] = new Estudiante("Elizabeth Adame", 1264384, "LEOE", 90);
        estudiantes[4] = new Estudiante("Adriana Arroyo", 1274893, "Algebra Lineal", 96.5f);

        for(int i = 5; i < estudiantes.length; i++){
            estudiantes[i] = new Estudiante(
                    CapturaEntrada.capturaString("Nombre del estudiante"),
                    CapturaEntrada.capturaEntero("Matricula"),
                    CapturaEntrada.capturaString("Materia"),
                    CapturaEntrada.capturaFloat("Calificacion")
            );
        }

        System.out.println("\n\n\tEstudiantes registrados: " + estudiantes.length + "\n");
        System.out.print(String.format("%20s %20s %30s %20s %20s\n","Nombre", "Matricula", "Materia", "Calificacion", "Estado"));

        for (Estudiante estudiante : estudiantes) {
            estudiante.imprimirEstudiante();
        }
    }
}
