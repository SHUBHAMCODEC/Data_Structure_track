import java.util.ArrayList;

public class subSequenceSumEqualtoK {

    private static int helper(int index,ArrayList<Integer> current,int currentSum,int[] arr,int k){
        int cnt=0;
        
        if(index==arr.length){
            if(currentSum==k){
                return 1;
            }
            return 0;
        }

        current.add(arr[index]);
        int leftBranchCount=helper(index+1,current,currentSum+arr[index],arr,k);

        current.remove(current.size()-1);

        int rightBrachCount=helper(index+1,current,currentSum,arr,k);

        return leftBranchCount+rightBrachCount;
    }
    public static void main(String[] args){
        // Test 1: Negative numbers logic test
    int[] arr1 = {-2, 5, 8, -3, 2};
    int k1 = 5;
    System.out.println("Test 1 Count: " + helper(0, new ArrayList<>(), 0, arr1, k1)); // Should find multiple paths

    // Test 2: Large duplicated array (Stress Test)
    int[] arr2 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
    int k2 = 3;
    System.out.println("Test 2 Count: " + helper(0, new ArrayList<>(), 0, arr2, k2)); // Should be exactly 1140
    
    // Test 3: Zero-heavy array test
    int[] arr3 = {0, 0, 0, 2, 0};
    int k3 = 2;
    System.out.println("Test 3 Count: " + helper(0, new ArrayList<>(), 0, arr3, k3)); 
    }
}
