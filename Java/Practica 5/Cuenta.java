public class Cuenta {
    private Persona cliente;
    private float saldo;
    private int PIN;

    public Cuenta(Persona persona, float saldoApertura, int pin){
        setCliente(persona);
        ClaseIO.imprimirMensaje("Para abir la cuenta se requiere pagar un monto de $500 MXN\n");
        setSaldoNuevaCuenta(saldoApertura);
        setPIN(pin);
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldoNuevaCuenta(float saldo){
        this.saldo = (saldo - 500);
    }

    public void setPIN(int pin){
        this.PIN = pin;
    }

    public int getPIN(){
        return PIN;
    }

    public String[] paraArreglo(){
        String [] tempArray = new String[cliente.toArray().length+1];

        for(int i = 0 ; i < cliente.toArray().length; ++i){
            tempArray[i] = cliente.toArray()[i];
        }

        tempArray[cliente.toArray().length] = String.valueOf(saldo);

        return tempArray;
    }
}
