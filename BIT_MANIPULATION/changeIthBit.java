package BIT_MANIPULATION;

public class changeIthBit {

    private static void helper(int num,int pos){
        System.out.println("original: "+num);
        num=(1<<pos)|num;
        System.out.println("updated: "+num);
        System.out.println(Integer.toBinaryString(num));

        System.out.println();System.out.println();
    }
    public static void main(String[] args){
        helper(24, 2);
        helper(56, 1);
        helper(14, 0);
        helper(13, 1);
    }
}
