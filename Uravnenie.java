import java.util.Scanner;

/**
 * Class "Uravnenie" checks the possible existence of the equation and displays the roots of the screen
 */
public class Uravnenie {
    static double a;
    static double b;
    static double c;
    static double D;

    /**
     * Method "filling" allows you to enter the coefficients and displays the value of D
     */
    boolean filling() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients of the equation:");
        if (input.hasNextDouble()) {
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
            System.out.println("Your arguments are: " + a + " " + b + " " + c);
            D = b * b - 4 * a * c;
            System.out.println("Your D is: " + D);
        }
        else {
            System.out.println("You can use only numbers");
            return false;
        }
        return true;
    }

    /**
     * Method "check" checks how many roots we have and reports they
     */
     void check() {
        if (1.0 / D == Double.POSITIVE_INFINITY) {
            double x3 = -b / 2 * a;
            System.out.println("You have only 1 root, is: " + x3);
        }
        if (D < 0) {
            System.out.println("no roots");
        }
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("Your first root is: " + x1);
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Your second root is: " + x2);
        }
    }

    public static void main(String[] args) {
        Uravnenie uravnenie = new Uravnenie();
        if (uravnenie.filling()) {
            uravnenie.check();
        }
    }
}

