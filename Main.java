package Main;

import java.util.Scanner;
import Conditions.NumbersCondition;
import Conditions.LettersCondition;
import Conditions.CounterCondition;
import Conditions.VocabularyCondition;

/**
 * Entry point in the program
 */
public class Main {
    static String s;

    /**
     * Main lets you to input your lane and calls methods of inspections
     */
    public static void main(String[] args) {
        Scanner lane = new Scanner(System.in);
        System.out.println("Input your line:");
        s = lane.nextLine();
        System.out.print("Your line is: ");
        System.out.println(s);
        NumbersCondition numbersCondition = new NumbersCondition();
        numbersCondition.Condition(s);
        LettersCondition lettersCondition = new LettersCondition();
        lettersCondition.Condition(s);
        CounterCondition counterCondition = new CounterCondition();
        counterCondition.Condition(s);
        VocabularyCondition vocabularyCondition = new VocabularyCondition();
        vocabularyCondition.Condition(s);
    }
}
