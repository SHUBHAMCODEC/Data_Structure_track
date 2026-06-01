package RECURSION;

import java.util.Scanner;

public class bas_powerOf2 {

    private static Boolean helper(int n){
        if(n==1){
            return true;
        }else if(n==0 || n%2!=0){
            return false;
        }
        return helper(n/2);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();
        System.out.println(helper(n));
    }
}
