import IO.ClaseIO;
import IO.Tablas;

public class Equipo {
    private String nombreEquipo, division, nombreEntrenador;
    private int torneosConParticipacion, torneosGanados, torneosPerdidos;
    private Jugador[] jugadores;

    public Equipo(int numJugadores, String nombreEquipo, String division, String nombreEntrenador, int torneosConParticipacion, int torneosGanados, int torneosPerdidos) {
        jugadores = new Jugador[numJugadores];

        this.nombreEquipo = nombreEquipo;
        this.division = division;
        this.nombreEntrenador = nombreEntrenador;
        this.torneosConParticipacion = torneosConParticipacion;
        this.torneosGanados = torneosGanados;
        this.torneosPerdidos = torneosPerdidos;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getDivision() {
        return division;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public int getSumaTotalPuntosJugadores(){
        int total = 0;

        for(Jugador jugador: jugadores){
           total += jugador.getPuntosAnotados();
        }

        return total;
    }

    public int getCantidadJugadoresRegistrados(){ return this.jugadores.length; }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public void imprimirTablaInformacion(){
        ClaseIO.imprimirMensaje("Nombre equipo: " + getNombreEquipo());
        ClaseIO.imprimirMensaje("Division:" + getDivision());

        String [][] datos = new String[jugadores.length][];

        for(int i = 0; i <  jugadores.length; i++){
            datos[i] = jugadores[i].generarDatosJugador();
        }

        String [][] tabla = new String[jugadores.length + 1][];

        tabla[0] = new String[]{"Numero de uniforme", "Nombre Jugador"};

        for(int i = 0; i < datos.length; i++){
            if( i == 0)
                tabla[1] = datos[i];
            else
                tabla[i + 1] = datos[i];
        }

        Tablas.tablaSimple(tabla, true);

    }
}
