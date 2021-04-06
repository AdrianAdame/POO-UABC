package Animales;

import IO.ClaseIO;

public class Leon extends Animal {

    public Leon(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void rugir(){
        ClaseIO.imprimirMensaje("Roaar...");
    }
}
