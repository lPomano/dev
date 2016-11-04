package main;

import triangle.Triangle;

/**
 * Programs entery point
 */
public class Main {

    /**
     * Method main works with class Triangle and his methods
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,4,3);
        if (triangle.sidesCheck() && triangle.sumSidesCheck()) {
            triangle.triangleCheck(1,1,1);
        }
    }
}

