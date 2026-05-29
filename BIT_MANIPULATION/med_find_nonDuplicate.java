package BIT_MANIPULATION;

public class med_find_nonDuplicate {


    private static void helper(int arr[]){
        int ans=0;
        for(int i:arr){
            ans^=i;
        }

        System.out.println(ans);
    }


    public static void main(String[] args){
        helper(new int[]{2,2,1});
        helper(new int[]{1,1,4,4,5,5,6});//comments
        
    }
}
