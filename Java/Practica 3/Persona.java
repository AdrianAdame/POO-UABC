public class Persona {
    String nombre, CURP, RFC;

    public Persona(String nombre, String CURP, String RFC){
        setNombre(nombre);
        setCURP(CURP);
        setRFC(RFC);
    }

    public void imprimirDatos(){
        System.out.println("---------------------------");
        System.out.println("- Nombre: " + getNombre());
        System.out.println("- CURP: " + getCURP());
        System.out.println("- RFC: " + getRFC());
        System.out.println("---------------------------");
    }

    public String getNombre() {
        return nombre;
    }

    public String getCURP() {
        return CURP;
    }

    public String getRFC() {
        return RFC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
