import IO.ClaseIO;

import java.util.Random;

public class Partida {

    public static String[] generarPartido(Equipo equipo1, Equipo equipo2){

        Random ran = new Random();

        String [] ganador_perdedor;

        for(int i = 0; i < 10; i++){

            //Ciclo para asignar puntos a cada jugador
            for(int j = 0; j < 10; j++){
                equipo1.getJugadores()[j].setPuntosAnotados(equipo1.getJugadores()[j].getPuntosAnotados() + ran.nextInt(3));
            }

            for(int k = 0; k < 10; k++){
                equipo2.getJugadores()[k].setPuntosAnotados(equipo2.getJugadores()[k].getPuntosAnotados() + ran.nextInt(3));
            }

            ran.setSeed(24);

        }

        if(getEquipoGanador(equipo1.getSumaTotalPuntosJugadores(), equipo2.getSumaTotalPuntosJugadores()) == 1){
            ganador_perdedor = new String[]{equipo1.getNombreEquipo(), equipo2.getNombreEquipo()};
        }else{
            ganador_perdedor = new String[]{equipo2.getNombreEquipo(), equipo1.getNombreEquipo()};
        }

        if(getEquipoGanador(equipo1.getSumaTotalPuntosJugadores(), equipo2.getSumaTotalPuntosJugadores()) == 3) {
            ClaseIO.imprimirMensaje("Hubo empate, se volvera a jugar!!");
            generarPartido(equipo1, equipo2);
        }

        return ganador_perdedor;
    }

    public static int getEquipoGanador(int puntos1, int puntos2){
        int ganador;

        if(puntos1 > puntos2)
            ganador = 1;
        else
            ganador = 2;

        if(puntos1 == puntos2)
            ganador = 3;

        return ganador;
    }
}
