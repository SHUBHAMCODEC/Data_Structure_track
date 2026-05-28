package BIT_MANIPULATION;

public class Set_the_rightmost_bit { // rightmost bit from 0  to 1

    private static void helper(int num){
        System.out.println(num+": "+Integer.toBinaryString(num));
        int n=num|num+1;
        System.out.println(Integer.toBinaryString(n));
    }
    public static void main(String[] args){
        helper(13);
        helper(17);
        helper(28);
        helper(127);
    }
}
