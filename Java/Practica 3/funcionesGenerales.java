public class funcionesGenerales {

    public static String primeros4caracteres(String nombre){
        StringBuilder cadenaIniciales = new StringBuilder();

        String [] nombreArr = separarCadenas(nombre.toLowerCase(), " ");

        cadenaIniciales.append(nombreArr[nombreArr.length - 2].charAt(0));
        cadenaIniciales.append(getPrimeraVocal(nombreArr[nombreArr.length - 2].substring(1)));
        cadenaIniciales.append(nombreArr[nombreArr.length - 1].charAt(0));
        cadenaIniciales.append(nombreArr[0].charAt(0));

        return cadenaIniciales.toString();
    }

    public static String fechaDeNacimiento(String fecha){
        StringBuilder cadenaFecha =  new StringBuilder();
        String [] fechaArr = separarCadenas(fecha, " ");

        //Ultimos dos caracteres para indicar la fecha
        cadenaFecha.append(fechaArr[2].substring(Math.max(fechaArr[2].length() - 2,0)));


        if(Integer.parseInt(fechaArr[1]) < 10)
            cadenaFecha.append("0" + fechaArr[1]);
        else
            cadenaFecha.append(fechaArr[1]);

        if(Integer.parseInt(fechaArr[0]) < 10)
            cadenaFecha.append("0" + fechaArr[0]);
        else
            cadenaFecha.append(fechaArr[0]);

        return cadenaFecha.toString();
    }

    public static char getPrimeraVocal(String c){
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};

        int indice = -1;

        principal:
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            for (char vocal : vocales) {
                if (vocal == ch) {
                    indice = i;
                    break principal;
                }
            }
        }


        if( indice >= 0)
            return c.charAt(indice);

        return 'x';
    }

    public static String[] separarCadenas(String cadena, String separador){
        return cadena.split(separador);
    }

}
