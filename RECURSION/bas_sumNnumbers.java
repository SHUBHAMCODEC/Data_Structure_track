package RECURSION;

import java.util.Scanner;

public class bas_sumNnumbers {

    private static void recur(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        } 
        
        recur(n-1,sum+n);
        
    }

    private static int recur2(int n){
        if(n==0){
            return 0;
        }

        return n+recur2(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        recur(n,0);
        System.out.println(recur2(n));
    }
}
