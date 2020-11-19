import java.util.Scanner; 
public class actividad3 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = 0;
        int y = 0;

        System.out.println("Escribe la variable de x");
        x = a.nextInt();
        System.out.println("Escribe la variable de Y");
        y = a.nextInt();

     System.out.println("X + Y =" + (x+y));
     System.out.println("X + Y =" + (x-y));
     System.out.println("X + Y =" + (x*y));
     System.out.println("X + Y =" + (x/y));
    }
}