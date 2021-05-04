public class Torneo {
    private final String nombreTorneo, region;
    private final int numEquiposParticipantes;
    private int partidosJugados;
    private int partidosPendientes;
    private Equipo[] equiposParticipantes;

    public Torneo(String nombreTorneo, String region, int numEquiposParticipantes, int partidosJugados, int partidosPendientes) {
        this.nombreTorneo = nombreTorneo;
        this.region = region;
        this.numEquiposParticipantes = numEquiposParticipantes;
        this.partidosJugados = partidosJugados;
        this.partidosPendientes = partidosPendientes;
    }

    public Equipo[] getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(Equipo[] equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public String getRegion() {
        return region;
    }

    public int getNumEquiposParticipantes() {
        return numEquiposParticipantes;
    }


    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosPendientes() {
        return partidosPendientes;
    }

    public void setPartidosPendientes(int partidosPendientes) {
        this.partidosPendientes = partidosPendientes;
    }

    public Equipo buscarEquipo(String nombre){
        Equipo equipo = null;

        for (Equipo equiposParticipante : equiposParticipantes) {
            if (equiposParticipante.getNombreEquipo().equals(nombre)) {
                equipo = equiposParticipante;
            }
        }

        return equipo;
    }
}
