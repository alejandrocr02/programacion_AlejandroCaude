import java.util.Scanner; 
public class ejercicio3 {

    public static void main(String[] args) {
        double a = 8;
        double b = 3;
        double resultado = 0;

        resultado = (double) a / b;
        System.out.printf("La division es: %f\n", + resultado);
        
        System.out.printf("La division es %.2f %n", resultado);

         System.out.printf("La division es %07.3f %n", resultado);

        System.out.printf("La division es %7.3f %n", resultado);

        System.out.printf("La division es %010.0f %n", resultado);

    }
}