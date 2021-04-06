package Animales;

import IO.ClaseIO;

public class Gato extends Animal {

    public Gato(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void maullar(){
        ClaseIO.imprimirMensaje("Miau Miau...");
    }
}
