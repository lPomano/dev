package Conditions;

import java.util.StringTokenizer;

/**
 * Class which checks condition of entry five or more words
 */
public class CounterCondition {

    /**
     * method Condition checks only numbers input condition and displays the result
     */
    public void Condition(String str) {
        str = str.replaceAll("[^\\s^\\.^\\,]", "");
        if ((str.length() + 1) > 5) {
            System.out.println("RULE NUMBER THREE");
            System.out.println("There are more than five words in your line");
        }
    }
}



