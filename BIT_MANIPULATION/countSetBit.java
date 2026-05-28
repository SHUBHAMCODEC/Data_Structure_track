package BIT_MANIPULATION;

public class countSetBit {

    private static void helper(int num){
        System.out.println(Integer.toBinaryString(num));
        int cnt=0;
        while(num>0){
            num&=num-1;
            cnt++;
        }
        System.out.println("total set bits are: "+cnt);
        System.out.println();
    }
    public static void main(String[] args){
        helper(13);
        helper(16);
        helper(100);
        helper(1248);
        helper(26);
        helper(147541235);
    }
}
