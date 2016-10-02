public class Calc {

    public static void main(String[] args) {

        System.out.println("Ur numbers r: " + Integer.parseInt(args[0]) + " " + Integer.parseInt(args[1]));
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("sum: " + (a + b) + " " + "proizvidenie: " + (a * b) + " " + "raznost: " + (a - b) + " " + "delenie: " + (a / b));
    }
}
