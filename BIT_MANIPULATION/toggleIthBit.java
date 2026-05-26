package BIT_MANIPULATION;

public class toggleIthBit {

    private static void helper(int num,int pos){
        System.out.println("original: "+num);
        num=num^(1<<pos);
        System.out.println("updated: "+num);
        System.out.println(Integer.toBinaryString(num));

        System.out.println();System.out.println();
    }
    public static void main(String[] args){
        helper(24,3);
        helper(24,1);
        helper(56,5);
        helper(56,2);
    }
}
