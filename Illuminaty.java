import java.util.Scanner;

public class Illuminaty {

    static int b;
    static int array[] = new int[3];
    public void check() {

        for (int i = 0; i < 3; i++) {

            for (int q = 0; q < 3; q++) {

                for (int e = 0; e < 3; e++) {

                    if (array[i] + array[q] <= array[e]) {

                        b = 1;
                    }

                    if (array[0] == array[1] && array[0] == array[2]) {

                        b = 2;
                    }

                    if (array[i] == array[q] && i != q) {

                        b = 3;
                    }

                }

            }

        }
    }
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

    public static void main(String[] args) {

        Illuminaty illuminaty = new Illuminaty();
        Scanner input = new Scanner(System.in);
        System.out.println("Input trio sides:");
        for (int i = 0; i < 3; i++) {

            array[i] = input.nextInt();
        }

    illuminaty.check();
    illuminaty.output();
    }

}