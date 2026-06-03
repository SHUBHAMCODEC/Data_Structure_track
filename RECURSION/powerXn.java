package RECURSION;

public class powerXn {

    private static double power(int i){
        if(i<1){
            return 1;
        }

        return 2*power(i-1);
    }
    public static void main(String[] args){
        double result=power(10);

        System.out.println(result);
 }   
}
