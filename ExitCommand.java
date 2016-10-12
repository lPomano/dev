package Commands;

import java.util.Scanner;

/**
 * Class processes the output from the program
 */
public class ExitCommand {

    /**
     * Class processes the output from the program: if you type "exit" program will be closed
     */
    public void exitCommand() {
        Scanner command = new Scanner(System.in);
        if (command.nextLine().equals("exit")) {
            System.out.println("Program is closed");
            System.exit(0);
        }
    }
}
