public class Pajaro {
    private String nombre, color, tamano, grito;
    private boolean tieneHabilidad;

    public Pajaro(String nombre, String color, String tamano, String grito,boolean tieneHabilidad){
        setNombre(nombre);
        setColor(color);
        setTamano(tamano);
        setGrito(grito);
        setTieneHabilidad(tieneHabilidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean TieneHabilidad() {
        return tieneHabilidad;
    }

    public void setTieneHabilidad(boolean tieneHabilidad) {
        this.tieneHabilidad = tieneHabilidad;
    }

    public void setGrito(String grito){
        this.grito = grito;
    }

    public String getGrito(){
        return grito;
    }

    public void imprimirInformacion(){
        System.out.println("-----------------------------------");
        System.out.println("Nomnbre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Tamano: " + getTamano());
        System.out.println("Habilidad?: " + TieneHabilidad());
        System.out.println("-----------------------------------");
    }
}
