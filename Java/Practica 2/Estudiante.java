public class Estudiante {
    private String nombre;
    private String materia;
    private String estado;
    private int matricula;
    private float calificacion;

    public Estudiante(String nombre, int matricula, String materia,float calificacion){
        setNombre(nombre);
        setMatricula(matricula);
        setMateria(materia);
        setCalificacion(calificacion);
        setEstado(calificacion);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setEstado(float calificacion) {
        this.estado = calificacion < 60 ? "Reprobado" : "Aprobado";
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    public String getEstado() {
        return estado;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void imprimirEstudiante(){
        /*
        System.out.println("------------------------------");
        System.out.println("| Nombre: " + getNombre());
        System.out.println("| Matricula:" + getMatricula());
        System.out.println("| Materia:" + getMateria() + " | Calificacion: " + getCalificacion());
        System.out.println("| Estado:" + getEstado());
        System.out.println("------------------------------");
        */
        System.out.println(String.format("%20s %20s %30s %20s %20s\n",getNombre(), getMatricula(), getMateria(), getCalificacion(), getEstado()));
    }
}
