package BIT_MANIPULATION;

public class powerOf2 {

    //helper function for finding wheather a num is of power of 2 or not
    private static void helper(long num){
        if(num > 0 && (num & (num - 1)) == 0){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
    //main function to run the code or i can say the method which is essential for running any program
    public static void main(String[] args){
        helper(16);
        helper(8);
        helper(3);
        helper(31);
        helper(1045781);
        helper(2147483648L);
    }
}
