package Animales;

import IO.ClaseIO;

import java.util.Objects;

public class Animal {
    private String nombre, tipoAlimento, recetar;
    private int edad;
    private boolean estaVacunado, estaSedado;

    public Animal(String nombre, int edad, boolean estaVacunado, String tipoAlimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estaVacunado = estaVacunado;
        this.tipoAlimento = tipoAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public boolean estaVacunado() {
        return estaVacunado;
    }

    public void aplicarvacuna(boolean estaVacunado) {
        this.estaVacunado = estaVacunado;
    }

    public boolean estaSedado(){
        return estaSedado;
    }

    public void aplicarSedante(boolean sedante){
        estaSedado = sedante;
    }

    public void setRecetar(String receta){
        recetar = receta;
    }

    public String getRecetar(){
        return Objects.requireNonNullElse(recetar, "No se ha recetado nada");
    }

    public void caminar(){
        ClaseIO.imprimirMensaje(getNombre() + " esta caminando...");
    }

    public String[] generarDatosAnimal(){
        return new String[]{
                getNombre(),
                String.valueOf(getEdad()),
                getTipoAlimento(),
                getRecetar(),
                String.valueOf(estaVacunado()),
                String.valueOf(estaSedado())
        };
    }

}
