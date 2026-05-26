package BIT_MANIPULATION;

public class changeiThBitTo0 {

    private static void helper(int num,int pos){
        System.out.println("original: "+num);
        num=num&(~(1<<pos));
        System.out.println("updated: "+num);
        System.out.println(Integer.toBinaryString(num));

        System.out.println();System.out.println();
    } 

    public static void main(String[] args){
        helper(24, 3);
        helper(56, 4);
        helper(13, 3);
        helper(32, 5);
    }
}
