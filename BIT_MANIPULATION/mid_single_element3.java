package BIT_MANIPULATION;

public class mid_single_element3 {


    private static void helper(int[] nums){
        int xor=0;

        for(int i:nums){
            xor^=i;
        }
        int rightMost=((xor&xor-1)&xor);
        int bucket1=0; int bucket2=0;

        for(int i=0;i<nums.length;i++){
            if((rightMost&nums[i])!=0){
                bucket1=bucket1^nums[i];
            }else{
                bucket2^=nums[i];
            }
        }

        System.out.println(bucket1+" and "+bucket2);
    }
    public static void main(String[] args){
        helper(new int[]{1, 2, 1, 3, 5, 2});
    }
}
