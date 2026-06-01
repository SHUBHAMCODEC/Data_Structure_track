package RECURSION;

import java.util.Scanner;

public class bas_printNumber1ToN {


    static int s;
    static int n=0;
    private static void recur(){
        if(n==s){
            return;
        }

        System.out.println(n);
        n++;
        recur();
    }
    private static void reverse(){
        if(s==-1){
            return;
        }
        System.out.println(s);
        s--;
        reverse();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        s=sc.nextInt();
        System.out.println("Start from here:-");
        recur();
        System.out.println("------------------------------------------------------------");
        System.out.println("In reverse:");
        reverse();


    }
}
