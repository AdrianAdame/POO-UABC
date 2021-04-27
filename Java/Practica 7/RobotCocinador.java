import IO.ClaseIO;

public class RobotCocinador extends Robot implements AccionesCocina{
    private float temperaturaACocinar;

    public RobotCocinador(String nombre, int bateriaRestante, String id, String ultimaAccionRealizada, float temperaturaACocinar) {
        super(nombre, bateriaRestante, id, ultimaAccionRealizada);
        this.temperaturaACocinar = temperaturaACocinar;
    }

    public float getTemperaturaACocinar() {
        return temperaturaACocinar;
    }

    public void setTemperaturaACocinar(float temperaturaACocinar) {
        this.temperaturaACocinar = temperaturaACocinar;
    }

    @Override
    public void servirPlatillo() {
        ClaseIO.imprimirMensaje("Platillo servido!");
    }

    @Override
    public void moverBrazos() {
        try{
            ClaseIO.imprimirMensaje("Se estan calibrando los movimientos de los brazos para el movimiento de la flama...");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        ClaseIO.imprimirMensaje("Calibracion completa, listo para trabajar!");
        setUltimaAccionRealizada("Calibracion Brazos");
    }

    @Override
    public void enceder() {
        try{
            ClaseIO.imprimirMensaje("Encendiendo rutinas...");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        ClaseIO.imprimirMensaje("Rutinas cargadas correctamente!");
        setUltimaAccionRealizada("Encendido");
    }

    public void prepararIngredientes(){
        ClaseIO.imprimirMensaje("ERROR: El robot cocinador no esta programado para realizar esta accion!");
        setUltimaAccionRealizada("Preparar ingredientes (Fallido)");
    }

    @Override
    public void cocinarPlatillo() {
        try{
            ClaseIO.imprimirMensaje("Cocinando a temperatura seleccionada - " + getTemperaturaACocinar() + " grador C");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }

        ClaseIO.imprimirMensaje("Platillo listo para servirse!");
        setUltimaAccionRealizada("Cocinar Platillo");
    }

}
