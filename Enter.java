package Enter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Class produces the input elements
 */
public class Enter {
    public String[] type;
    public String[] name;
    public int[] amount;
    public int[] price;

    /**
     * Method produces the input elements
     */
    public void enter() throws IOException {
        Scanner str = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int o = str.nextInt();
        type = new String[o];
        name = new String[o];
        amount = new int[o];
        price = new int[o];
        for (int q = 0; q < o; q++) {
            System.out.print("Enter type of product: ");
            type[q] = reader.readLine();
            System.out.print("Enter name of product: ");
            name[q] = reader.readLine();
            System.out.print("Enter amount of product: ");
            amount[q] = str.nextInt();
            System.out.print("Enter the cost of one unit of product: ");
            price[q] = str.nextInt();
        }
    }

    /**
     * Method returns types
     */
    public int outType() {
        Scanner str = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many products you entered?");
        int o = str.nextInt();
        type = new String[o];
        return type.length;
    }

    /**
     * Method returns amount
     */
    public int outAmount() {
        Scanner str = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many products you entered?");
        int o = str.nextInt();
        amount = new int[o];
        return amount.length;
    }

    /**
     * Method returns the average cost of products
     */
    public int outPrice() {
        Scanner str = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many products you entered?");
        int o = str.nextInt();
        price = new int[o];
        int average = 0;
        for (int q = 0; q < o; q++) {
            average = average + price[q];
        }
        return average / o;
    }

        /**
         * Method returns the average cost of products
         */
    public int outTypePrice() {
        Scanner str = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many products you entered?");
        int o = str.nextInt();
        price = new int[o];
        int average = 0;
        for (int q = 0; q < o; q++) {
            for (int a = 0; a < o; a++) {
                if (type[q].equals(type[a]) && q != a) {
                    for (int i = 0; i < o; i++) {
                        average = average + price[q];
                    }
                }
            }
        }
        return average/o;
    }
}