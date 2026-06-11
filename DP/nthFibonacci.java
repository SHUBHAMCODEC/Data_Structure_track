package DP;

import java.util.Arrays;

public class nthFibonacci {

     public static int nthTermDp(int n,int[] dp){
        if(n==1 || n==2) return n-1;
        
        if(dp[n]!= -1) return dp[n];
        dp[n]= nthTermDp(n-1,dp) + nthTermDp(n-2,dp);
        
        return dp[n];
    }


    public static void main(String[] args) {
        

        int n=10;
        int[] dp=new int[n+1];  //memoization        
        Arrays.fill(dp,-1);
        
        System.out.println( nthTermDp(n,dp)  ) ;
    }
}
