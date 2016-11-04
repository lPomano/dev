package triangle;

/**
 * Class Triangle builds a triangle and checks is it possible
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    final String SINGLE = "SINGLE";
    final String TWOSIDES = "TWOSIDES";
    final String THREESIDES = "THREESIDES";

    /** Constructor of class Triangle
     * @param a
     * @param b
     * @param c
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method sidesCheck checks are sides of triangle less than 0
     * @return false if sides less than 0
     * @return true if sides are possible
     */
    public boolean sidesCheck() {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("One of the side is less than 0");
            return false;
        }
        return true;
    }

    /**
     * Method trueSidesCheck checks are sides of triangle dont NaN or Infinity
     */
    public boolean trueSidesCheck() {
        return !(new Double(a).isNaN() || new Double(a).isInfinite());
    }

    /**
     * Method trueSidesCheck checks is sum of two triangles sides is less than third side
     * @return false if third side is more than sum of two others
     */
    public boolean sumSidesCheck() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("The sum of two sides is more than third side");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Method triangleCheck checks kind a triangle
     * @return kinds
     */
    public String triangleCheck(double a, double b, double c) {
        if (a - b == 0 && a - c == 0) {
            return THREESIDES;
        }
        if (a - b == 0 || a - c == 0 || b - c == 0) {
            return TWOSIDES;
        }
        return SINGLE;
    }
}