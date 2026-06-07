public class sumOfNnaturalNumber {

    private static void helper(long n){
        long sum=n*(n+1)/2;
        System.out.println(sum);
    }
    public static void main(String[] args){
         long n=755517845550L;
        helper(n);
    }
}
