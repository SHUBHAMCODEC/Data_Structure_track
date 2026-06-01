package RECURSION;

public class basic_reverseArray {

    private static void reverse(int left,int right,int [] nums ) {
        // swapping +recursion
        int n=nums.length;
        if(left>=right){
            return;
        }
        
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;

        reverse(left+1, right-1,nums);
        

    }

    private static void print(int nums[]){
        for(int i:nums){
            System.out.print(i+" ");
        }

        System.out.println(); System.out.println();
    }
    public static void main(String[] args){
        int[] nums={1,4,5,6,7,8,9};
        reverse(0,nums.length-1, nums);
        print(nums);
        int[] nums2={1,15,78,8,90,100,101};
        reverse(0, nums2.length-1,nums2);
        print(nums2);
    }
}