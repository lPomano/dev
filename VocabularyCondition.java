package Conditions;

/**
 * Class which checks condition of entry words from the dictionary
 */
public class VocabularyCondition {
    private String vocabulary = "one two three four five six seven eight nine ten";

    /**
     * method Condition checks is our lane contains words from vocabulary and displays the result
     */
    public boolean Condition(String str) {
        String[] array = str.split(" ");
        String[] array1 = vocabulary.split(" ");
        for (int o = 0; o < array.length; o++) {
            for (int q = 0; q < array.length; q++) {
                if (array[q].equals(array1[o])) {
                    System.out.println("RULE NUMBER FOUR");
                    System.out.println("At least one word in your line coincides with the word in the vocabulary");
                    return true;
                }
            }
        }
        return false;
    }
}
