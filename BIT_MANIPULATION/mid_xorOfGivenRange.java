package BIT_MANIPULATION;

public class mid_xorOfGivenRange {
    private static int helper1(int num){

        if(num%4==1) return 1;
        else if(num%4==2) return num+1;
        else if(num%4==3) return 0;
        else{
            return num;
        }
    }

    private static void range(int l,int r){
        int ans=0;
        ans=helper1(l-1) ^ helper1(r);

        System.out.println(ans);
    }

    public static void main(String[] args){
        range(3, 5);//comments
        range(1, 3);
    }
}
