import java.util.Scanner;

/**
 * Class creates a triangle and checks is it possible to do,
 * has a field array which contains 3 triangles sides
 */
public class Illuminaty {
    double array[] = new double[3];
    enum Triangle {RAVNOBEDREN, RAVNOSTORONEN, IMPOSSIBLE}
    Triangle trio;
    /**
    * Method "check" checks the possible of a triangle
    */
    public void check() {
        for (int i = 0; i < 3; i++) {
            for (int q = 0; q < 3; q++) {
                for (int e = 0; e < 3; e++) {
                    if (array[i] + array[q] <= array[e]) {
                        trio = Triangle.IMPOSSIBLE;
                    }
                }
                if (array[i] == array[q] && i != q) {
                    trio = Triangle.RAVNOBEDREN;
                }
            }
        }
        if (array[0] == array[1] && array[0] == array[2]) {
            trio = Triangle.RAVNOSTORONEN;
        }
    }

    /**
     * Method "outPut" reports can we build a triangle and how many equal sides we have
     */
    public void outPut() {
        if (trio == Triangle.IMPOSSIBLE) {
            System.out.println("we cant build a triangle");
        }
        if (trio == Triangle.RAVNOBEDREN) {
            System.out.println("we have 2 equal sides");
        }
        if (trio == Triangle.RAVNOSTORONEN) {
            System.out.println("we have 3 equal sides");
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
            illuminaty.outPut();

        }
    }
}