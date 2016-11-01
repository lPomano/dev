import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class initializes route of travel. Finds the file and read coordinates.
 */
public class RouteInitializer {
    /**
     * Method finds the file, read coordinates and initializes route of travel.
     */
    public static ArrayList<Point> init (String fileName){
        ArrayList<Point> route = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            Scanner sc = new Scanner(fileInputStream);
            route = new ArrayList<Point>();
            while (sc.hasNext()){
                String s = sc.nextLine();
                String [] tmp = s.split(" ");
                double x = Double.parseDouble(tmp[0]);
                double y = Double.parseDouble(tmp[1]);
                route.add(new Point(x,y));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return route;
    }
}
