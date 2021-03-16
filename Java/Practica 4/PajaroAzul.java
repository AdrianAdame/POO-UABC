public class PajaroAzul extends Pajaro{

    public PajaroAzul(String nombre, String color, String tamano, String grito,boolean tieneHabilidad){
        super(nombre, color,tamano, grito,tieneHabilidad);
    }

    public void dividirse(){
        System.out.println( getGrito() + " *Se divide* \t\t *Se estrella*");
    }
}
