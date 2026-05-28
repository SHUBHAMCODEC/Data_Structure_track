package BIT_MANIPULATION;

public class med_minFlip {


    private static void helper(int start,int goal){
        int ans=start^goal;
        int cnt=0;
        while(ans>0){
            ans&=ans-1;
            cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args){
        helper(10,7);
        helper(3,4);
    }
}
