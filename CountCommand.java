package Commands;

import Enter.Enter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class counts number of all products
 */
public class CountCommand {

    /**
     * Class counts number of all products
     */
    public void countCommand() throws IOException {
        Scanner command = new Scanner(System.in);
        Enter enter = new Enter();
        if (command.nextLine().equals("count all")) {
            System.out.println(enter.outAmount());
        }
    }
}
