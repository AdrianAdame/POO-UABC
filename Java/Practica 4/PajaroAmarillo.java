public class PajaroAmarillo extends Pajaro {

    public PajaroAmarillo(String nombre, String color, String tamano, String grito,boolean tieneHabilidad){
        super(nombre, color,tamano, grito,tieneHabilidad);
    }

    public void AumentoVelocidad(){
        System.out.println( getGrito() + " *Aumenta su velocidad* \t\t *Se estrella*");
    }

}
