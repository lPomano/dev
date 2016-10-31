package com.company.company.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class FileReader reads the information from the Coordinates file
 * and then parses it into a double
 * and allows you to find the distance between checkpoints
 */
public class FileWork {
    static final String fileName = "/Users/User/IdeaProjects/Task11/Coordinates.txt";
    public static double distance;

    /**
     * Method reader reads the information from the Coordinates file
     * and then parses it into a double
     * and allows you to find the distance between checkpoints
     * @throws IOException
     */
    public static double reader() throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get(fileName)));
        System.out.println("Our file contents:");
        System.out.println(contents + "\n");
        distance = 0;
        String[] coordinatesArray = contents.split(" ");
        double[] coordinates = new double[coordinatesArray.length];
        System.out.println("Our checkpoints are:");
        for (int i = 0; i < coordinatesArray.length; i++) {
            String aCoordinatesArray = coordinatesArray[i];
            coordinates[i] = Double.parseDouble(aCoordinatesArray);
            System.out.println(coordinates[i]);
            double[] pointsLenght = new double[coordinatesArray.length];
            if (i > 2) {
                pointsLenght[i] = Math.sqrt(Math.pow((coordinates[i - 1] - coordinates[i - 3]), 2) + Math.pow((coordinates[i] - coordinates[i - 2]), 2));
            }
            distance = distance + pointsLenght[i];
        }
        System.out.println("\n" + "Distance between all checkpoints:");
        System.out.println(distance + " kilometers" + "\n");
        return distance;
    }
}