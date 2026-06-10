import java.util.*;

public class combination1One {

    private static List<List<Integer>> combination1(int[] combinations,int target){
        List<List<Integer>> ls=new ArrayList<>();

        helper(0,ls,combinations,target,new List<Integer>());

        rteurn ls;
    }

    private static void helper(int index,List<List<Integer>> ls,int[] arr,int target,new List<Integer> dummy){

        if(index==0){
            if(target==0){
                ls.add(dummy);
            }
        }

        if(arr[index]<target){
            dummy.add(arr[index]);
            helper(index,ls,arr,target-arr[index],dummy);

            dummy.remove(dummy.size()-1);
        }
    }
    public static void main(String[] args) {
        
    }
}
