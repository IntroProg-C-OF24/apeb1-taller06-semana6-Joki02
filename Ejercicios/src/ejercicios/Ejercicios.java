package ejercicios;

/**
 *
 * @author SALAI
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 2;
        double y;
        if (x >= -3 && x < +2) {
            y = Math.pow(x, 2) + 2 * x - 3;
        } else if (x > 2 && x <= 10) {
            y = 5 * x + 7;
        } else {
            y = 0;

        }
        System.out.println("x-" + x + "y" + y);
    }

}
