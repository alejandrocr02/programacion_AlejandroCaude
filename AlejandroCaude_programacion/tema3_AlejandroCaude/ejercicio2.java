import java.util.Scanner; 
public class ejercicio2 {

    public static void main(String[] args) {
        double cantidad = 71283.567811;

         System.out.println();
         System.out.println("Ejemplo para mostrar un mismo valor con varios formatos"); 
         System.out.printf("%nEl valor de la variable cantidad es %f", cantidad); 
         System.out.printf("%nEl valor de la variable cantidad es %e", cantidad);
         System.out.printf("%nEl valor de la variable cantidad es %.2f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %.6f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %+.2f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %11.2f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %+11.2f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %011.2f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %+011.2f", cantidad);
        System.out.printf("%nEl valor de la variable cantidad es %,f", cantidad);
    }
}