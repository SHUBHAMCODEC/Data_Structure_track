import java.util.*;

public class combination1One {
    // Avoid using static global lists in recursive problems to prevent data persistence across runs
    private static List<List<Integer>> combination1(int[] combinations, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        helper(0, ls, combinations, target, new ArrayList<Integer>());
        return ls;
    }

    private static void helper(int index, List<List<Integer>> ls, int[] arr, int target, List<Integer> dummy) {
        // Base Case 1: If target is met, create a copy of the list and add it to results
        if (target == 0) {
            ls.add(new ArrayList<>(dummy));
            return;
        }
        
        // Base Case 2: Out of bounds or target exceeded
        if (index == arr.length || target < 0) {
            return;
        }

        // Choice 1: Include the current element (if it fits within the remaining target)
        if (arr[index] <= target) {
            dummy.add(arr[index]);
            // Stay on the same index if an element can be reused multiple times
            helper(index, ls, arr, target - arr[index], dummy); 
            dummy.remove(dummy.size() - 1); // Backtrack
        }

        // Choice 2: Exclude the current element and move to the next index
        // Notice target does NOT change because we did not pick arr[index]
        helper(index + 1, ls, arr, target, dummy); 
    }

    public static void main(String[] args) {
        int comb[] = {1, 2, 4, 8, 5, 7, 9, 10, 3};
        int target = 8;
        List<List<Integer>> result = combination1(comb, target);
        System.out.println(result);
    }
}
