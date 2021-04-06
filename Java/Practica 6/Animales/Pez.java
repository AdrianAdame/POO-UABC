package Animales;

import IO.ClaseIO;

public class Pez extends Animal {

    public Pez(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void nadar(){
        ClaseIO.imprimirMensaje("Estoy moviendo las aletas...");
    }
}
