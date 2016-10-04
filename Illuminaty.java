import java.util.Scanner;

public class Illuminaty { // class creates a triangle and checks is it possible to do
    static int b;
    static double array[] = new double[3]; // this array contains the sides of the triangle

    public void check() { // method checks the possible of a triangle and reports how many equal sides triangle has
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

    public void output() { // method displays the final result
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

    public boolean numbersCheck() { // method checks what are you enter: letters or numbers. if you enter letters, the program ends
        Scanner input = new Scanner(System.in);
        System.out.println("Input trio sides:");
        if (input.hasNextDouble()) {
            for (int i = 0; i < 3; i++) {
                array[i] = input.nextDouble();
            }
        } else {
            System.out.println("You cant enter letters");
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

