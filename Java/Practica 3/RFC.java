public class RFC {

    public static String generarRFC(String nombre, String fecha){
        StringBuilder RFC = new StringBuilder();

        //Primeros 4 caracteres de nombre
        RFC.append(funcionesGenerales.primeros4caracteres(nombre));

        //Fecha de nacimiento
        RFC.append(funcionesGenerales.fechaDeNacimiento(fecha));

        //Homoclave
        RFC.append(generarHomoclave(nombre));

        //Digito Verificador
        RFC.append(generarDigitoVerificador(RFC.toString()));

        return RFC.toString().toUpperCase();
    }

    public static String generarHomoclave(String nombre){
        StringBuilder homoclave = new StringBuilder();

        String nombreMapeadoDigitos = "0";

        for (int j = 0; j < nombre.length(); j++) {
            char ch = nombre.toLowerCase().charAt(j);
            if(asignacionCaracteresParte1(ch) == null){
                System.out.println("Error, no codigo de dos digitos para: " +ch);
                break;
            }else
                nombreMapeadoDigitos += asignacionCaracteresParte1(ch);
        }

        int sumaPares = 0;

        for(int i = 0; i < nombreMapeadoDigitos.length() - 1; i++){
            int num1 = Integer.parseInt(nombreMapeadoDigitos.substring(i, i+2));
            int num2 = Integer.parseInt(nombreMapeadoDigitos.substring(i + 1, i + 2));
            sumaPares += (num1 * num2);
        }

        int tresDigitos = sumaPares % 1000;
        int cociente = tresDigitos / 34;
        int residuo = tresDigitos % 34;

        homoclave.append(asignacionCaracteresParte2(cociente));
        homoclave.append(asignacionCaracteresParte2(residuo));

        return homoclave.toString();
    }

    public static String generarDigitoVerificador(String rfc10Digitos){
        int suma12Digitos = 0;

        for(int i = 0; i < 12; i++){
            char ch = rfc10Digitos.toLowerCase().charAt(i);
            suma12Digitos += asignacionCaracteresParte3(ch) * (13-i);
        }

        int residuo = suma12Digitos % 11;

        if(residuo == 0)
            return "0";
        else
            return Integer.toHexString(11-residuo);
    }

    public static String asignacionCaracteresParte1(char c){

        return switch (c) {
            case ' ', '0' -> "00";
            case '1' -> "01";
            case '2' -> "02";
            case '3' -> "03";
            case '4' -> "04";
            case '5' -> "05";
            case '6' -> "06";
            case '7' -> "07";
            case '8' -> "08";
            case '9' -> "09";
            case '&' -> "10";
            case 'a' -> "11";
            case 'b' -> "12";
            case 'c' -> "13";
            case 'd' -> "14";
            case 'e' -> "15";
            case 'f' -> "16";
            case 'g' -> "17";
            case 'h' -> "18";
            case 'i' -> "19";
            case 'j' -> "21";
            case 'k' -> "22";
            case 'l' -> "23";
            case 'm' -> "24";
            case 'n' -> "25";
            case 'o' -> "26";
            case 'p' -> "27";
            case 'q' -> "28";
            case 'r' -> "29";
            case 's' -> "32";
            case 't' -> "33";
            case 'u' -> "34";
            case 'v' -> "35";
            case 'w' -> "36";
            case 'x' -> "37";
            case 'y' -> "38";
            case 'z' -> "39";
            case 164 -> "40";
            default -> null;
        };
    }

    public static char asignacionCaracteresParte2(int c){
        String digitos = "123456789abcdefghijklmnpqrstuvwxyz";
        return digitos.charAt(c);
    }

    public static int asignacionCaracteresParte3(char c){

        return switch (c) {
            case ' ' -> 37;
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case '&' -> 24;
            case 'a' -> 10;
            case 'b' -> 11;
            case 'c' -> 12;
            case 'd' -> 13;
            case 'e' -> 14;
            case 'f' -> 15;
            case 'g' -> 16;
            case 'h' -> 17;
            case 'i' -> 18;
            case 'j' -> 19;
            case 'k' -> 20;
            case 'l' -> 21;
            case 'm' -> 22;
            case 'n' -> 23;
            case 'o' -> 25;
            case 'p' -> 26;
            case 'q' -> 27;
            case 'r' -> 28;
            case 's' -> 29;
            case 't' -> 30;
            case 'u' -> 31;
            case 'v' -> 32;
            case 'w' -> 33;
            case 'x' -> 34;
            case 'y' -> 35;
            case 'z' -> 36;
            case 164 -> 38;
            default -> -1;
        };
    }

}
