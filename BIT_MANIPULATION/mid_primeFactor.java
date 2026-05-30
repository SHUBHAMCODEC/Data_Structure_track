package BIT_MANIPULATION;
import java.util.*;

public class mid_primeFactor {


    private static void helper(int num){
        ArrayList<Integer> list=new ArrayList<>();
        
        for(double i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                int dd=(int)i;
                list.add(dd);
                while(num%dd==0){
                    num=num/dd;
                }
            }
        }

        System.out.println(list);
    }
    public static void main(String[] args){
        helper(380);
    }
}
