import java.util.Scanner; 

public class actividad7 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double z = 0;

        System.out.println(" Dime el valor de X");
        x = a.nextDouble();
        System.out.println(" Dime el valor de Y");
        y = a.nextDouble();

        z = (1 + ((x * x)/ y)) / ((x * x * x ) / 1 + y);

         System.out.println("El valor de Z es " + z);
    }
}