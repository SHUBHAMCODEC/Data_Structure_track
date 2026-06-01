package RECURSION;

import java.util.Scanner;

public class bas_printNumber1ToN {


    //without global variables
    private static void recur(int i,int n){
        if(i>n){
            return;
        }

        System.out.println(i);
       
        recur(i+1,n);
    }
    private static void reverse(int c,int s){
        if(s<1){
            return;
        }
        System.out.println(s);
        
        reverse(c,s-1);
    }


    // backtracking concept:


    private static void back1ToN(int i,int n){
        if(i<1) return;
        back1ToN(i-1, n);
        System.out.println(i);

    }

    private static void backNto1(int i,int n){
        if(i>n) return;
        backNto1(i+1, n);
        System.out.println(i);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int s=sc.nextInt();
        System.out.println("Start from here:-");
        recur(1,s);
        System.out.println("------------------------------------------------------------");
        System.out.println("In reverse:");
        reverse(0,s);

        System.out.println(); System.out.println();
        System.out.println("-------BACKTRACKING----");
        back1ToN(s, s);
        System.out.println("-------------------");
        backNto1(1, s);
        

    }
}
