import IO.ClaseIO;

public class RobotPreparador extends Robot implements AccionesCocina{

    public RobotPreparador(String nombre, int bateriaRestante, String id, String ultimaAccionRealizada) {
        super(nombre, bateriaRestante, id, ultimaAccionRealizada);
    }

    @Override
    public void servirPlatillo() {
        ClaseIO.imprimirMensaje("Platillo servido!");
    }

    @Override
    public void moverBrazos() {
        try{
            ClaseIO.imprimirMensaje("Se estan calibrando los movimientos de los brazos para el corte de ingredientes...");
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
        try{
            ClaseIO.imprimirMensaje("Cortando ingredientes (Carnes, verduras) - Espere un momento por favor");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }

        ClaseIO.imprimirMensaje("Platillo listo para ser cocinado!");
        setUltimaAccionRealizada("Preparacion de ingredientes");
    }

    @Override
    public void cocinarPlatillo() {
        ClaseIO.imprimirMensaje("ERROR: El robot preparador no esta programado para realizar esta accion!");
        setUltimaAccionRealizada("Cocinar Platillo (Fallido)");
    }

}
