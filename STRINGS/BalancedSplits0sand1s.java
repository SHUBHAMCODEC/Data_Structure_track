public class BalancedSplits0sand1s {

    private static void helper(String s){
        
        int ans=0;
        int one=0,zero=0;
        int zeroInd=0;
        

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }

            if(zero==one){
                ans++;
                zero=0;one=0;
                zeroInd=i+1;
            }
        }

        if(zero>0 || one >0){
            ans=-1;
        }

        System.out.println(ans);
        System.out.println(sb);
        System.out.println();
    }
    public static void main(String[] args) {
        helper("0100110101");
        helper("0111100010");
        helper("0010");
    }
}
