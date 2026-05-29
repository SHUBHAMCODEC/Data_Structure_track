package BIT_MANIPULATION;

import java.util.ArrayList;
import java.util.List;

public class mid_printAllSubsets {

    public static List<List<Integer>> getPowerSet(int[] nums) {
        int n=nums.length;
        int subsets=1<<n;

        List<List<Integer>> subset=new ArrayList<>();

        for(int num=0;num<subsets;num++){
            List<Integer>set=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num&(1<<i))!=0){
                    set.add(nums[i]);
                }
            }
            subset.add(set);
        }

        return subset;
    }
    public static void main(String[] args){
        int[] nums = {5, 7, 8};

        // Generate power set
        List<List<Integer>> subsets = getPowerSet(nums);

        // Print input array
        System.out.print("Initial Input Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Print subsets
        System.out.println("Subsets:");
        for (List<Integer> subset : subsets) {
            System.out.print("[ ");
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println("]");
    }
}
}
