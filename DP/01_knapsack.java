/*Given two arrays, val[] and wt[], where each element represents the value and weight of an item respectively, 
also given an integer W representing the maximum capacity of the knapsack (the total weight it can hold).
Put the items into the knapsack such that the sum of values associated with them is the maximum possible, 
without exceeding the capacity W.*/



//GOAL: You want to choose a combination of items that fits in your backpack and gives you the highest total value possible.
package DP;

public class 01_knapsack {

    private static int knapsack(int[] val,int wt[],int capacity){

    }
    public static void main(String args[]){
        int[] val={5,10,10,15,7,30};
        int wt[]={1,4,6,5,3,15}
        int capacity=11;

        System.out.println(Knapsack(val,wt,capacity));
    }
}
