import java.util.Scanner; 
public class actividad5 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double euros = 0;
        double pesetas = 166.386;
        double conversion = 0;

        System.out.println("Escribe en euros lo que quieres en pesetas");
        euros = a.nextInt();
        conversion = euros * pesetas;
        System.out.println( euros + " euros son" + conversion + " pesetas");
    }
}