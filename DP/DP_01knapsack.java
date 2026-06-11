/*Given two arrays, val[] and wt[], where each element represents the value and weight of an item respectively, 
also given an integer W representing the maximum capacity of the knapsack (the total weight it can hold).
Put the items into the knapsack such that the sum of values associated with them is the maximum possible, 
without exceeding the capacity W.*/



//GOAL: You want to choose a combination of items that fits in your backpack and gives you the highest total value possible.
package DP;

import java.util.Arrays;

public class DP_01knapsack { 
    
    // 1. Plain Recursive Approach (Causes Time Limit Exceeded for large inputs)
    public static int KnapsackRec(int n, int W, int val[], int wt[]) {
        if (n == 0 || W == 0) {
            return 0;
        }
        
        if (wt[n-1] <= W) {
            // Fixed: Removed brackets [] from val and wt inside the function calls

            int pick = val[n-1] + KnapsackRec(n - 1, W - wt[n-1], val, wt);
            int not_pick = KnapsackRec(n - 1, W, val, wt);
            return Math.max(pick, not_pick);

        } else {
            return KnapsackRec(n - 1, W, val, wt);
        }
    }

    // 2. Top-Down Dynamic Programming Approach (Memoization - Fast)
    private static int knapsackDP(int n, int W, int val[], int wt[], int[][] dp) { 

        if (n == 0 || W == 0) { 
            return 0; 
        } 
        
        if (dp[n][W] != -1) { 
            return dp[n][W]; 
        } 
        
        if (wt[n-1] <= W) { 
            int pick = val[n-1] + knapsackDP(n - 1, W - wt[n-1], val, wt, dp); 
            int not_pick = knapsackDP(n - 1, W, val, wt, dp); 

            dp[n][W] = Math.max(pick, not_pick); 

        } else { 
            dp[n][W] = knapsackDP(n - 1, W, val, wt, dp); 
        } 

        return dp[n][W]; 
    } 

// 2. Bottom-Top Dynamic Programming Approach (Tabulation - Fast) 
private static void knapsackDP2(int n, int w, int val[], int wt[]){
    // n ---will change to --> i 
    // W ---will change to --> j 
    // knapsackDp(n-1,w-k)----------change------>dp[i-1][j-k] where k is weight - current taking item weight see line 45 
    // recursion -------change to ------> loop 
    
    // FIXED: Corrected the array declaration syntax here
    int[][] dp = new int[n + 1][w + 1]; 
    
    for(int i = 0; i <= n; i++){ 
        for(int j = 0; j <= w; j++){ 
            if(i == 0 || j == 0){ 
                dp[i][j] = 0; 
            } else if(wt[i-1] <= j){ 
                dp[i][j] = Math.max(val[i-1] + dp[i-1][j - wt[i-1]], dp[i-1][j]); 
            } else { 
                dp[i][j] = dp[i-1][j]; 
            } 
        } 
    } 
    System.out.println(dp[n][w]); 
}

    
    public static void main(String args[]) {
        int[] val = {5, 10, 10, 15, 7, 30};
        int wt[] = {1, 4, 6, 5, 3, 15}; // Fixed: Added missing semicolon
        int capacity = 11; 
        
        // Fixed: Corrected function name to KnapsackRec
        System.out.println("Recursive approach output: " + KnapsackRec(val.length, capacity, val, wt));
        
        //----------------------------------------------------------------------------- 
        // Fixed: Changed 'W' to 'capacity' and fixed the loop syntax
        int [][] dp = new int[val.length + 1][capacity + 1]; 
        for (int i = 0; i <= val.length; i++) { // Fixed: Added missing semicolon after i=0
            Arrays.fill(dp[i], -1); 
        } 
        
        // Fixed: Changed 'W' to 'capacity'
        System.out.println("DP approach output: " + knapsackDP(val.length, capacity, val, wt, dp)); 
    } 
}
