import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class ValidacionCuenta {
    public static boolean validarEdad(Cuenta nuevaCuenta){
        return nuevaCuenta.getCliente().getEdad() >= 18;
    }

    public static boolean validarFechaNacimiento(Cuenta cuenta){
        String fecha = cuenta.getCliente().getFechaNacimiento();

        SimpleDateFormat formatoFecha =  new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date d = formatoFecha.parse(fecha);
            Calendar calendario = Calendar.getInstance();
            calendario.setTime(d);

            int anio = calendario.get(Calendar.YEAR);
            int mes =  calendario.get(Calendar.MONTH) + 1;
            int dia = calendario.get(Calendar.DATE);

            LocalDate fechaLocal = LocalDate.of(anio, mes, dia);

            LocalDate fechaActual = LocalDate.now();

            Period diferencia = Period.between(fechaLocal, fechaActual);

            return diferencia.getYears() >= 18;
        }catch (ParseException e){
            return false;
        }
    }

    public static boolean validarMontoApertura(Cuenta cuenta){
        return cuenta.getSaldo() > 500;
    }
}
