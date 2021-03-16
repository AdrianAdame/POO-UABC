public class PajaroRojo extends Pajaro{

    public PajaroRojo(String nombre, String color, String tamano, String grito,boolean tieneHabilidad){
        super(nombre, color,tamano, grito,tieneHabilidad);
    }

    public void lanzarse(){
        System.out.println(getGrito() + " \t\t *Se estrella*");
    }

}
