import java.util.ArrayList;

public class ArrayElementSubsequence {
    private static void helper(int index,ArrayList<Integer> current,int[] arr){
        if(index==arr.length){
            System.out.println(current.isEmpty()?"(Empty)": current);

            return;
        }   

        current.add(arr[index]); 
        helper(index + 1, current, arr); 
        
        // BACKTRACK: Remove the element so the "not take" branch starts fresh
        current.remove(current.size() - 1); 
        
        // Choice 2: Do not take the element
        helper(index + 1, current, arr); 


    }

    public static void main(String[] args){
        helper(0,new ArrayList<>(),new int[]{1,2,5,3,4});
    }
}
