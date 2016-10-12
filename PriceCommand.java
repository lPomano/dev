package Commands;

import Enter.Enter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class counts average price of all products
 */
public class PriceCommand {

    /**
     * Methods counts average price of same types of product
     */
    public void priceCommand() throws IOException {
        Scanner command = new Scanner(System.in);
        Enter enter = new Enter();
        if (command.nextLine().equals("average price")) {
            System.out.println(enter.outPrice());
        }
    }
}
