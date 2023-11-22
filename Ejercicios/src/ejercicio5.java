
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }
}