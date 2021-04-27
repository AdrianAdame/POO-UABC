public abstract class Robot implements Movimiento{
    private String nombre, id, ultimaAccionRealizada;
    private int bateriaRestante;

    public abstract void servirPlatillo();

    public Robot(String nombre, int bateriaRestante, String id, String ultimaAccionRealizada) {
        this.nombre = nombre;
        this.bateriaRestante = bateriaRestante;
        this.id = id;
        this.ultimaAccionRealizada = ultimaAccionRealizada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBateriaRestante() {
        return bateriaRestante;
    }

    public void setBateriaRestante(int bateriaRestante) {
        this.bateriaRestante = bateriaRestante;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUltimaAccionRealizada() {
        return ultimaAccionRealizada;
    }

    public void setUltimaAccionRealizada(String ultimaAccionRealizada) {
        this.ultimaAccionRealizada = ultimaAccionRealizada;
    }
}
