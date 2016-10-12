package Main;

import Commands.*;
import Enter.Enter;
import java.io.IOException;

/**
 * Program entry point
 */
public class Main {

    /**
     * Method works with other classes and their methods
     */
    public static void main(String[] args)  throws IOException {
        System.out.println("How many products you want to enter?");
        Enter enter = new Enter();
        enter.enter();
        System.out.println("Select command: ");
        System.out.println("1) count types" + "\n" + "2) count all" + "\n" + "3) average price" + "\n" + "4) average price type" + "\n" + "5) exit");
        System.out.println("What you want to do? ");
        TypeCommand typeCommand = new TypeCommand();
        typeCommand.typeCommand();
        ExitCommand exitCommand = new ExitCommand();
        exitCommand.exitCommand();
        CountCommand countCommand = new CountCommand();
        countCommand.countCommand();
        PriceCommand priceCommand = new PriceCommand();
        priceCommand.priceCommand();
        TypePriceCommand typePriceCommand = new TypePriceCommand();
        typePriceCommand.typePriceCommand();
    }
}