public class Persona {
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String correoE;
    private String direccion;

    public Persona(String nombre, int edad, String fechaNacimiento, String correoE, String direccion){
        setNombre(nombre);
        setEdad(edad);
        setFechaNacimiento(fechaNacimiento);
        setCorreoE(correoE);
        setDireccion(direccion);
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String[] toArray(){

        return new String[]{getNombre(), String.valueOf(getEdad()), getFechaNacimiento(),getDireccion(), getCorreoE()};
    }
}
