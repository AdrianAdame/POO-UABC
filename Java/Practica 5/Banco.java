import java.util.ArrayList;

public class Banco {
    private String nombreBanco;
    private ArrayList<Cuenta> cuentasRegistradas;

    public Banco(String nombreBanco){
        setNombreBanco(nombreBanco);

        cuentasRegistradas = new ArrayList<>();
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public ArrayList<Cuenta> getCuentasRegistradas() {
        return cuentasRegistradas;
    }

    public void setCuentasRegistradas(ArrayList<Cuenta> cuentasRegistradas) {
        this.cuentasRegistradas = cuentasRegistradas;
    }

    public void agregarNuevaCuenta(Cuenta nuevaCuenta){
        cuentasRegistradas.add(nuevaCuenta);
    }

    public void imprimirCuentasRegistradas(boolean protegerInformacionPersonal){
        boolean bandera = protegerInformacionPersonal;

        String [][] datos =  new String[cuentasRegistradas.size()][];

        for(int i = 0; i < cuentasRegistradas.size(); i++){
            if(protegerInformacionPersonal)
                datos[i] = ClaseIO.encriptarCadenas(cuentasRegistradas.get(i).paraArreglo(), "*".charAt(0));
            else
                datos[i] = cuentasRegistradas.get(i).paraArreglo();

        }

        String [][] tabla = new String[cuentasRegistradas.size() + 1][];

        tabla[0] = new String[]{"Nombre", "Edad", "Fecha de nacimiento", "Direccion", "Correo Electronico", "Saldo total"};



        for(int i = 0; i < datos.length; ++i){
            if( i == 0)
                tabla[1] = datos[i];
            else
                tabla[i+1] = datos[i];
        }

        Tablas.tablaSimple(tabla, true);
    }
}
