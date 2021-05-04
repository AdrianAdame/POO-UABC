import java.util.ArrayList;
import java.util.Random;

public class GeneradorDatos {

    public static Equipo[] generarEquipos(int numeroEquipos, String [] nombreEquipos, String[] nombreEntrenadores){
        Random ran = new Random();

        ArrayList<String> nombreEquiposArray = new ArrayList<>(), nombreEntrenadoresArray = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            nombreEquiposArray.add(nombreEquipos[i]);
            nombreEntrenadoresArray.add(nombreEntrenadores[i]);
        }

        Equipo [] equipos = new Equipo[numeroEquipos];
        //Se definiran los jugadores del equipo

        for(int i = 0; i < equipos.length; i++){

            int num1 = ran.nextInt(nombreEquiposArray.size()), num2 = ran.nextInt(nombreEquiposArray.size());
            Equipo temp = new Equipo(10, nombreEquiposArray.get(num1), "Pacifico", nombreEntrenadoresArray.get(num2), 1, 0, 0);

            nombreEquiposArray.remove(num1);
            nombreEntrenadoresArray.remove(num2);

            equipos[i] = temp;

            equipos[i].setJugadores(GeneradorDatos.generarEquipoJugadores(equipos[i].getJugadores().length));


        }

        return equipos;
    }

    public static Jugador[] generarEquipoJugadores(int numJugadores){
        Jugador[] jugadores = new Jugador[numJugadores];

        for(int i = 0; i < jugadores.length; i++){
            Jugador temp = generarJugador(i);

            jugadores[i] = temp;
        }

        return jugadores;
    }

    public static Jugador generarJugador(int i){
        Random rand = new Random();

        String[] posiciones = {"Base", "Escolta", "Alero", "Ala-pivot", "Pivot"};

        return new Jugador(generarNombre(), posiciones[rand.nextInt(posiciones.length)], rand.nextInt(99), 0, (float)(1.50 + Math.random() * 0.5));
    }

    public static String generarNombre(){
        String[] Inicial = { "Kr", "Ca", "Ra", "Mrok", "Cru",
                "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
                "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
                "Mar", "Luk" };

        String[] Medio = { "air", "ir", "mi", "sor", "mee", "clo",
                "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
                "marac", "zoir", "slamar", "salmar", "urak" };
        String[] Final = { "d", "ed", "ark", "arc", "es", "er", "der",
                "tron", "med", "ure", "zur", "cred", "mur" };

        Random rand = new Random();

        return Inicial[rand.nextInt(Inicial.length)] + Medio[rand.nextInt(Medio.length)]+ Final[rand.nextInt(Final.length)] + " " +
                Inicial[rand.nextInt(Inicial.length)] + Medio[rand.nextInt(Medio.length)]+ Final[rand.nextInt(Final.length)];
    }
}
