import java.util.*;

public class SubSetII {
    private static void helper(int index, ArrayList<Integer> current, int[] arr) {
        // Every single combination generated along the way is unique and valid!
        System.out.println(current.isEmpty() ? "[]" : current);

        // Loop through the remaining elements to branch out
        for (int i = index; i < arr.length; i++) {
            // CRITICAL STEP: Skip duplicates!
            // If i > index, it means we already processed this number in a previous loop cycle
            if (i > index && arr[i] == arr[i - 1]) {
                continue; 
            }

            // 1. Take the current element
            current.add(arr[i]);

            // 2. Recursively move to the next index position
            helper(i + 1, current, arr);

            // 3. Backtrack (clean up)
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        
        // Sorting groups duplicates together: {1, 2, 2}
        Arrays.sort(arr); 
        
        System.out.println("Unique Subsequences:");
        helper(0, new ArrayList<>(), arr);
    }
}
