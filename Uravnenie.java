public class Uravnenie {

    public static void main(String[] args) {

        double a = 9.3;
        double b = 5;
        double c = 0.3;
        System.out.println("Your arguments are: " + a + " " + b + " " + c);
        double D = b * b - 4 * a * c;
        System.out.println("Your D is: " + D);
        if (D < 0) {

            System.out.println("no roots");
        }

        if (D == 0) {

            double x3 = -b / 2*a;
            System.out.println("You have only 1 root, is: " + x3);
        }

        if (D>0) {

            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("Your first root is: " + x1);
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Your second root is: " + x2);
        }

    }

}
