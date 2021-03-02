import java.util.ArrayList;
import java.util.Scanner;

//ADAME ARROYO ADRIAN EDUARDO - 1272202
//PRACTICA 1 - FUNDAMENTOS Y SINTAXIS DEL LENGUAJE
//Fecha: 16 de febrero de 2021

public class Practica {

    public static void main(String [] args){

        ArrayList<String> nombres_alumnos =  new ArrayList<>();
        ArrayList<float[]> cal_alumnos =  new ArrayList<>();

        float [] tempArray;
        float prom, alta, baja;
        int opcion, total_cal;

        String nombre;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("\t.: Menu de opciones :.\n");
            System.out.println("1) Captura de nombre y calificaciones");
            System.out.println("2) Imprimir calificaciones y el promedio");
            System.out.println("3) Imprimir calificaciones y calificacion mas baja");
            System.out.println("4) Imprimir calificaciones y calificacion mas alta");
            System.out.println("5) Salir\n");
            System.out.print("Que opcion elige?: ");

            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    System.out.print("Ingresa el nombre: ");
                    nombre = entrada.nextLine();
                    nombres_alumnos.add(nombre);
                    System.out.print("Cuantas calificaciones desea capturar?: ");
                    total_cal = entrada.nextInt();
                    tempArray = new float[total_cal];
                    for(int i = 0; i < total_cal; i++){
                        System.out.print ("Calificacion No." + (i+1) + ": ");
                        tempArray[i] = entrada.nextFloat();
                    }
                    cal_alumnos.add(tempArray);
                    break;
                case 2:
                    if(nombres_alumnos.size() > 0) {
                        for (int i = 0; i < nombres_alumnos.size(); i++) {
                            prom = 0;
                            System.out.println("Calificaciones para: " + nombres_alumnos.get(i));
                            for (int j = 0; j < cal_alumnos.get(i).length; j++) {
                                System.out.println("Cal " + (j + 1) + ": " + cal_alumnos.get(i)[j]);
                                prom += cal_alumnos.get(i)[j];
                            }
                            System.out.println("Promedio: " + (prom / cal_alumnos.get(i).length));
                            System.out.println("*********************************************");
                        }
                    }else
                        System.out.println("Error, no existe algun registro de alumnos");

                    break;
                case 3:
                    if(nombres_alumnos.size() > 0) {
                        for (int i = 0; i < nombres_alumnos.size(); i++) {
                            System.out.println("Calificaciones para: " + nombres_alumnos.get(i));
                            baja = cal_alumnos.get(i)[0];
                            for (int j = 0; j < cal_alumnos.get(i).length; j++) {
                                System.out.println("Cal " + (j + 1) + ": " + cal_alumnos.get(i)[j]);
                                if (cal_alumnos.get(i)[j] < baja)
                                    baja = cal_alumnos.get(i)[j];
                            }
                            System.out.println(" Cal mas baja: " + baja);
                            System.out.println("*********************************************");
                        }
                    }else
                        System.out.println("Error, no existe algun registro de alumnos");

                    break;
                case 4:
                    if(nombres_alumnos.size() > 0) {
                        for (int i = 0; i < nombres_alumnos.size(); i++) {
                            System.out.println("Calificaciones para: " + nombres_alumnos.get(i));
                            alta = cal_alumnos.get(i)[0];
                            for (int j = 0; j < cal_alumnos.get(i).length; j++) {
                                System.out.println("Cal " + (j + 1) + ": " + cal_alumnos.get(i)[j]);
                                if (cal_alumnos.get(i)[j] > alta)
                                    alta = cal_alumnos.get(i)[j];
                            }
                            System.out.println("Cal mas alta: " + alta);
                            System.out.println("*********************************************");
                        }
                    }else
                        System.out.println("Error, no existe algun registro de alumnos");

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Funcion no disponible para seleccion");
                    break;
            }
        }while(opcion != 5);

    }
}
