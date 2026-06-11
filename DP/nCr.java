package DP;

import java.util.Arrays;
import java.util.Scanner;

// nCr =>  (n-1)C(r-1) + (n-1)Cr
// where n>=r  -> minimum condition for any combination;


public class nCr {

    private static int helper(int n,int r){
        if(n<r) return 0;
        if(n==r || r==0) return 1;
        return helper(n-1,r-1)+ helper(n-1,r);
    }


    //above function will give TIME EXCEED ERROR when their will be large value, but for smaller value above recursive code will work fine.

    // DP way -> it wont give ""TIME EXCEED ERROR""
    private static int nCr(int n,int r,int[][] dp){
        if(n<r) return 0;
        if(n==r || r==0) return 1;

        if(dp[n][r]!= -1) return dp[n][r];
        dp[n][r]=nCr(n-1,r-1,dp)+ nCr(n-1,r,dp);
        return dp[n][r];

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();    

        System.out.println(helper(n,r));

        //-------------------------------------------------------

        // for dp as our nCr of any number is depend on 2 values(n,r) that's why we have to make table

        int[][] dp=new int[n+1][r+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(nCr(n,r,dp));


    }
}
