package Conditions;

/**
 * Class which checks the input condition are not numbers
 */
public class LettersCondition {

    /**
     * method Condition checks not numbers input condition and displays the result
     */
    public void Condition( String str) {
        if (str.matches("[\\D]+")) {
            System.out.println("RULE NUMBER ONE");
            System.out.println("Your line doesn't contain numbers");
        }
    }
}

