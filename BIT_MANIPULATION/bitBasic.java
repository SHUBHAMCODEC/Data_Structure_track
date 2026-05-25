package BIT_MANIPULATION;
import java.util.*;
public class bitBasic {


    private static void decToBinary(int n){
        ArrayList<Integer> list=new ArrayList<>();

        while(n>0){
            int remain=n%2;
            list.add(remain);
            n=n/2;
        }

        System.out.println("decimal: "+list.reversed());
    }

    private 
    public static void main(String[] args){

    }
}
