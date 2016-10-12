package Commands;

import Enter.Enter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class counts average price of all types of products
 */
public class TypePriceCommand {

    /**
     * Methods counts average price of all products
     */
    public void typePriceCommand() throws IOException {
        Scanner command = new Scanner(System.in);
        Enter enter = new Enter();
        if (command.nextLine().equals("average price type")) {
            System.out.println(enter.outTypePrice());
        }
    }
}