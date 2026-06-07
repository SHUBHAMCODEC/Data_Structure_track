//package RECURSION.subSequences.java;

import java.util.*;

public class powerSet {

    
    public static List<String> generatePowerSet(String str) {
        List<String> result = new ArrayList<>();
        backtrack(str, 0, "", result);
        return result;
    }

    private static void backtrack(String str, int index, String current, List<String> result) {
        // Base Case: If we have processed all characters
        if (index == str.length()) {
            result.add(current);
            return;
        }

        // Choice 1: Exclude the character at the current index
        backtrack(str, index + 1, current, result);

        // Choice 2: Include the character at the current index
        backtrack(str, index + 1, current + str.charAt(index), result);
    }

    public static void main(String [] args){ // main method for running the system


        generatePowerSet("abc");
    }
}
