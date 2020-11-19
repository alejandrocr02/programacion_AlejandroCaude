import java.util.Scanner; 
public class actividad4 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int a = 0;
        int b = 0;
        double porcentaje_ninos = 0;
        double porcentaje_ninas = 0;

         System.out.println("Escribe cuantos ninos hay en la clase");
         a = a.nextInt();
         System.out.println("Escribe cuantos ninas hay en la clase");
         b = a.nextInt();
         porcentaje_ninos = (a + b)/100 * a;
         porcentaje_ninas = (a + b)/100 * a;

         System.out.println("Hay un porcentaje del " + porcentaje_ninos + "% de ninos en clase");
         System.out.println("Hay un porcentaje del " + porcentaje_ninas + "% de ninas en clase");
    }
}
