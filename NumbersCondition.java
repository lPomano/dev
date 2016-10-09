package Conditions;

/**
 * Class which checks condition of entry only numbers
 */
public class NumbersCondition {

    /**
     * method Condition checks only numbers input condition and displays the result
     */
    public void Condition(String a) {
        if (a.matches("[\\d]+")) {
            System.out.println("RULE NUMBER TWO");
            System.out.println("Your line contains only numbers");
        }
    }
}


