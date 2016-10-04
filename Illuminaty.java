import java.util.Scanner;

/**
 * Class creates a triangle and checks is it possible to do.
 * has a field array which contains 3 triangles sides
 */
public class Illuminaty {
    private int b;
    static double array[] = new double[3];

    /**
    * Method "check" checks the possible of a triangle and reports how many equal sides triangle has
    */
    public void check() {
        for (int i = 0; i < 3; i++) {
            for (int q = 0; q < 3; q++) {
                for (int e = 0; e < 3; e++) {
                    if (array[i] + array[q] <= array[e]) {
                        b = 1;
                        break;
                    }
                }
                if (array[i] == array[q] && i != q) {
                    b = 3;
                }
            }
        }
        if (array[0] == array[1] && array[0] == array[2]) {
            b = 2;
        }
    }

    /**
     * Method "output" displays the final results depends on b
     */
    public void output() {
        switch (b) {
            case 1:
                System.out.println("this triangle cannot be real");
                break;
            case 2:
                System.out.println("this triangle has 3 equal sides");
                break;
            case 3:
                System.out.println("this triangle has 2 equal sides");
        }
    }

    /**
     * Method "numbersCheck" checks what are you enter: letters or numbers. if you enter letters, method returns false value,
     * if you enter numbers, method returns true value
     */
    public boolean numbersCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input trio sides:");
        if (input.hasNextDouble()) {
            for (int i = 0; i < 3; i++) {
                array[i] = input.nextDouble();
            }
        }
        else {
            System.out.println("You can use only numbers");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Illuminaty illuminaty = new Illuminaty();
        if (illuminaty.numbersCheck()) {
            illuminaty.check();
            illuminaty.output();
        }
    }
}