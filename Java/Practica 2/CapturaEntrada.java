import java.util.Scanner;

public class CapturaEntrada {
    public static String capturaString(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextLine());
    }

    public static int capturaEntero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextInt());
    }

    public static float capturaFloat(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg +": ");
        return (sc.nextFloat());
    }
}