import java.util.Scanner; 
public class actividad2 {

    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
    
        System.out.println("Escribe la variable de A");
        a = a.nextInt();
        System.out.println("Escribe la variable de B");
        b = a.nextInt();
        c = b ;
        b = a ;
        a = c ;
    
        System.out.println("La variable de c, se ha intercambiado por la" + b);
        System.out.println("La variable de b, se ha intercambiado por la" + a);
    }
}