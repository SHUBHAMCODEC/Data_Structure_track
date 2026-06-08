import java.util.ArrayList;

public class subSequenceEqualsToK {
    
    private static void helper(int index,ArrayList<Integer> current,int currentSum,int arr[],int k){
        if(index==arr.length){
            if(currentSum==k){
                System.out.println(current);
                
            }return;
        }
        // we will take the element 

        current.add(arr[index]);
       
        helper(index+1,current,currentSum+arr[index],arr,k);

       
        current.remove(current.size()-1);

        // we will not take the element
        helper(index+1,current,currentSum,arr,k);
    }

    public static void main(String[] args){
         int[] arr = {1, 2, 1};
        int k = 2;
        
        System.out.println("Subsequences that sum up to " + k + ":");
        helper(0, new ArrayList<>(), 0, arr, k); 
    }
}
