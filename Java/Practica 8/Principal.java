import IO.ClaseIO;

public class Principal {
    public static void main(String [] args){

        //Se crea el torneo
        Torneo torneo = new Torneo("Torneo de Baloncesto Nacional", "America", 5, 0, 4);

        String [] nombreEquipos = {"Los Angeles Lakers", "Golden State Warriors", "Los Angeles Clippers", "Phoenix Suns", "Sacramento kings"};
        String [] nombreEntrenadores = {"Steve Kerr", "Tyronn Lue", "Frank Vogel", "Jacob Withee", "Luke Walton"};

        //Se definen los 5 equipos
        Equipo[] equipos = GeneradorDatos.generarEquipos(5, nombreEquipos, nombreEntrenadores);

        torneo.setEquiposParticipantes(equipos);

        ClaseIO.imprimirMensaje("\n\t\tDATOS PREVIOS AL TORNEO\n");
        ClaseIO.imprimirMensaje("Nombre del torneo: " + torneo.getNombreTorneo());
        ClaseIO.imprimirMensaje("Region: " + torneo.getRegion());
        ClaseIO.imprimirMensaje("Equipos Participantes: " + torneo.getNumEquiposParticipantes());
        ClaseIO.imprimirMensaje("Partidos Jugados: " + torneo.getPartidosJugados());
        ClaseIO.imprimirMensaje("Partidos Pendientes: " + torneo.getPartidosPendientes());
        ClaseIO.imprimirMensaje("\n A continuacion se mostrara la tabla de Jugadores por Equipos\n");

        for(Equipo equipo : equipos){
            ClaseIO.imprimirMensaje("Jugadores registrados: " + equipo.getCantidadJugadoresRegistrados());
            equipo.imprimirTablaInformacion();
            ClaseIO.pausa();
            ClaseIO.imprimirMensaje("\n");
        }

        //Empieza el torneo
        ClaseIO.imprimirMensaje("Empieza El torneo");

        ClaseIO.imprimirMensaje("Jugaran: " + torneo.getEquiposParticipantes()[0].getNombreEquipo() + " vs. " + torneo.getEquiposParticipantes()[1].getNombreEquipo());
        String [] ganador_perdedor_partida1 = Partida.generarPartido(torneo.getEquiposParticipantes()[0], torneo.getEquiposParticipantes()[1]);

        ClaseIO.imprimirMensaje("Ganador: " + ganador_perdedor_partida1[0]);
        ClaseIO.imprimirMensaje("Marcador: " + torneo.buscarEquipo(ganador_perdedor_partida1[0]).getSumaTotalPuntosJugadores() + " - " + torneo.buscarEquipo(ganador_perdedor_partida1[1]).getSumaTotalPuntosJugadores());
        torneo.setPartidosJugados(1);
        torneo.setPartidosPendientes(3);
        ClaseIO.pausa();

        ClaseIO.imprimirMensaje("\n\n2do Partido\n");
        ClaseIO.imprimirMensaje("Jugaran: " + torneo.getEquiposParticipantes()[2].getNombreEquipo() + " vs. " + torneo.getEquiposParticipantes()[3].getNombreEquipo());
        String[] ganador_perdedor_partida2 = Partida.generarPartido(torneo.getEquiposParticipantes()[2], torneo.getEquiposParticipantes()[3]);

        ClaseIO.imprimirMensaje("Ganador: " + ganador_perdedor_partida2[0]);
        ClaseIO.imprimirMensaje("Marcador: " + torneo.buscarEquipo(ganador_perdedor_partida2[0]).getSumaTotalPuntosJugadores() + " - " + torneo.buscarEquipo(ganador_perdedor_partida2[1]).getSumaTotalPuntosJugadores());
        torneo.setPartidosJugados(2);
        torneo.setPartidosPendientes(2);
        ClaseIO.pausa();

        ClaseIO.imprimirMensaje("\n\n3er Partido\n");
        ClaseIO.imprimirMensaje("Jugaran: " + torneo.buscarEquipo(ganador_perdedor_partida2[0]).getNombreEquipo() + " vs. " + torneo.getEquiposParticipantes()[4].getNombreEquipo());
        String[] ganador_perdedor_partida3 = Partida.generarPartido(torneo.buscarEquipo(ganador_perdedor_partida2[0]), torneo.getEquiposParticipantes()[4]);

        ClaseIO.imprimirMensaje("Ganador: " + ganador_perdedor_partida3[0]);
        ClaseIO.imprimirMensaje("Marcador: " + torneo.buscarEquipo(ganador_perdedor_partida3[0]).getSumaTotalPuntosJugadores() + " - " + torneo.buscarEquipo(ganador_perdedor_partida3[1]).getSumaTotalPuntosJugadores());
        torneo.setPartidosJugados(3);
        torneo.setPartidosPendientes(1);
        ClaseIO.pausa();

        ClaseIO.imprimirMensaje("\n\n\t\tGRAN FINAL\n");
        ClaseIO.imprimirMensaje("Jugaran: " + torneo.buscarEquipo(ganador_perdedor_partida1[0]).getNombreEquipo() + " vs. " + torneo.buscarEquipo(ganador_perdedor_partida3[0]).getNombreEquipo());
        String[] ganador_perdedor_partida4 = Partida.generarPartido(torneo.buscarEquipo(ganador_perdedor_partida1[0]), torneo.buscarEquipo(ganador_perdedor_partida3[0]));

        ClaseIO.imprimirMensaje("GANADOR << " + ganador_perdedor_partida4[0] + " >>");
        ClaseIO.imprimirMensaje("Marcador: " + torneo.buscarEquipo(ganador_perdedor_partida4[0]).getSumaTotalPuntosJugadores() + " - " + torneo.buscarEquipo(ganador_perdedor_partida4[1]).getSumaTotalPuntosJugadores());
        torneo.setPartidosJugados(4);
        torneo.setPartidosPendientes(0);

        torneo.buscarEquipo(ganador_perdedor_partida4[0]).setTorneosGanados(1);

        ClaseIO.pausa();

    }
}
