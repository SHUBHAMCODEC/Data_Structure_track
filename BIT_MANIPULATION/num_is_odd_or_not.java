package BIT_MANIPULATION;

public class num_is_odd_or_not {

    private static void helper(int num){
        if(num%2!=0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
    public static void main(String[] args){
        helper(10);
        helper(12);
        helper(18);
        helper(19);
        helper(25);
        helper(29);

    }
}
