package Animales;

import IO.ClaseIO;

public class Perro extends Animal {

    public Perro(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void ladrar(){
        ClaseIO.imprimirMensaje("Woof woof...");
    }
}
