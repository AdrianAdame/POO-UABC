package Animales;

import IO.ClaseIO;

public class Tortuga extends Animal {

    public Tortuga(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        super(nombre, edad, estaVacunado, tipoAlimento);
    }

    public void protegerse(){
        ClaseIO.imprimirMensaje("*Entra en su caparazon*");
    }
}
