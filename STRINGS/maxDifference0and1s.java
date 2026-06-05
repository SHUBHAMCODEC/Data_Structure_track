//kadane algorithm

public class maxDifference0and1s {

    private static void helper(String s){
        int zero=0,one=0;
        int maxDiff=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }
            maxDiff=Math.max(maxDiff, zero-one);
            if(one>zero){
                zero=0;
                one=0;
            }
        }

        System.out.println( maxDiff);
    }
    public static void main(String[] args){
        helper("0101000010101100000");
        helper("11000010001");
        helper("111111");
    }
}
