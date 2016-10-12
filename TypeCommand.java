package Commands;

import Enter.Enter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class types number of different types
 */
public class TypeCommand {

    /**
     * Method types number of different types
     */
    public void typeCommand() throws IOException {
        Scanner command = new Scanner(System.in);
        Enter enter = new Enter();
        if (command.nextLine().equals("count types")) {
            System.out.println(enter.outType());
        }
    }
}