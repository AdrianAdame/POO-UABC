import java.text.Normalizer;
import java.util.Arrays;
import java.util.Random;

public class CURP {

    public static String generarCURP(String nombre, char genero, String fecha, String entidad){

        //Caracteres pertenecientes a el nombre

        String CURP = funcionesGenerales.primeros4caracteres(nombre) +

                //Caracteres pertenecientes a la fecha de nacimiento
                funcionesGenerales.fechaDeNacimiento(fecha) +

                //genero
                genero +

                //Entidad de nacimiento
                obtenerEntidad(entidad) +

                //Consonantes del nombre
                caracteresConsonante(nombre) +

                //diferenciador y digito verificador
                generarDiferenciadorDigitoVerificador(fecha);

        return CURP.toUpperCase();
    }

    public static String obtenerEntidad(String entidad){
        return switch (Normalizer.normalize(entidad.toLowerCase(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "")){
            case "aguascalientes" -> "as";

            case "baja california" -> "bc";
            case "baja california sur" -> "bs";
            case "campeche" -> "cc";
            case "chiapas" -> "cs";
            case "chihuahua" -> "ch";
            case "ciudad de mexico" -> "df";
            case "coahuila" -> "cl";
            case "colima" -> "cm";
            case "durango" -> "dg";
            case "guanajuato" -> "gt";
            case "guerrero" -> "gr";
            case "hidalgo" -> "hg";
            case "jalisco" -> "jc";
            case "mexico" -> "mc";
            case "michoacan" -> "mn";
            case "morelos" -> "ms";
            case "nayarit" -> "nt";
            case "nuevo leon" -> "nl";
            case "oaxaca" -> "oc";
            case "puebla" -> "pl";
            case "queretaro" -> "qo";
            case "quintana roo" -> "qr";
            case "san luis potosi" -> "sp";
            case "sinaloa" -> "sl";
            case "sonora" -> "sr";
            case "tabasco" -> "tc";
            case "tamaulipas" -> "ts";
            case "tlaxcala" -> "tl";
            case "veracruz" -> "vz";
            case "yucatan" -> "yn";
            case "zacatecas" -> "zs";
            default -> "ne";
        };
    }

    public static String caracteresConsonante(String nombre){
        StringBuilder consonantes = new StringBuilder();
        String [] nombreArr = funcionesGenerales.separarCadenas(nombre.toLowerCase(), " ");

        consonantes.append(getPrimeraConsonante(nombreArr[nombreArr.length - 2].substring(1)));
        consonantes.append(getPrimeraConsonante(nombreArr[nombreArr.length - 1].substring(1)));
        consonantes.append(getPrimeraConsonante(nombreArr[0].substring(1)));

        return consonantes.toString();
    }

    public static char getPrimeraConsonante(String c){
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};

        int indice = -1;

        for (int i = 0; i < c.length(); i++) {
            if(Arrays.toString(vocales).indexOf(c.charAt(i)) < 0){
                indice = i;
                break;
            }
        }


        if( indice >= 0)
            return c.charAt(indice);

        return 'x';
    }

    public static String generarDiferenciadorDigitoVerificador(String fecha){
        StringBuilder diferenciadorDigito = new StringBuilder();

        String [] fechaArr = funcionesGenerales.separarCadenas(fecha, " ");
        char diferenciador = genDiferenciadorHomonimia(Integer.parseInt(fechaArr[2]));
        int digVerificador = genDigitoVerificador();

        diferenciadorDigito.append(diferenciador);
        diferenciadorDigito.append(digVerificador);

        return diferenciadorDigito.toString();
    }

    public static char genDiferenciadorHomonimia(int anio){
        Random ran =  new Random();
        char diferenciador;
        if(anio < 2000){
            System.out.println("Anio debajo del 2000");
            diferenciador = String.valueOf(ran.nextInt(9)).charAt(0);
        }else{
            System.out.println("Anio despues del 2001");
            diferenciador = (char)(ran.nextInt(12) + 'a');
        }

        return diferenciador;
    }

    public static int genDigitoVerificador(){
        Random ran =  new Random();

        return ran.nextInt(10);
    }
}
