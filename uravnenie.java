public class uravnenie {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 1;
        System.out.println("Yr arguments r: " + a + " " + b + " " + c);
        int D = b * b - 4 * a * c;
        System.out.println("Yr D is: " + D);
        if (D < 0) {

            System.out.println("WOAH");
        }
        if (D == 0) {
            int x3 = -b / 2*a;
            System.out.println("U have only 1 root, is: " + x3);
        }
        else {

            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            System.out.println("Yr 1 root is: " + x1);
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("Yr 2 root is: " + x2);
        }
    }
}
