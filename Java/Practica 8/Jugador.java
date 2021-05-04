import java.util.Random;

public class Jugador {
    private String nombre, posicion;
    private int numeroUniforme, puntosAnotados;
    private float estatura;

    public Jugador(String nombre, String posicion, int numeroUniforme, int puntosAnotados, float estatura) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroUniforme = numeroUniforme;
        this.puntosAnotados = puntosAnotados;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroUniforme() {
        return numeroUniforme;
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public String[] generarDatosJugador(){
        return new String[]{String.valueOf(getNumeroUniforme()), getNombre()};
    }
}
