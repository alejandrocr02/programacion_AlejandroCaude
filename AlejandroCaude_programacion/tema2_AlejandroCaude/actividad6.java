import java.util.Scanner; 

public class actividad6 {

    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
        double examen1;
        double porcentaje_examen1 = 0.4;
        double nota_querida;
        double porcentaje_examen2 = 0.6;
        double examen2;
    

        System.out.println(" Hola, dime la nota de tu primer examen ");
        examen1 = a.nextDouble();
        System.out.println("Que nota quieres sacar? ");
        nota_querida = a.nextDouble();
        examen2 = (nota_querida-(porcentaje_examen1*examen1))/porcentaje_examen2; 
        if(examen2 > 10 || examen2 < 0){
            System.out.println("Imposible que saques esa nota");
        }else{
        System.out.println(" para tener un " + nota_querida + " tienes que sacar un " + examen2 + " en el proximo examen ");
         }

    }
}