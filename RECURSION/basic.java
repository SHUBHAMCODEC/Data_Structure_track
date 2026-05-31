package RECURSION;
// recursion is basically a program:
//      1. program which call itself again and again.
//      2.  Until a specific condition is not met.    --------> base condition
public class basic {

    static int cnt=0;
    private static void recur(){
        if(cnt==10){  // base condition, if this is not present in recursion, throw a SEGMENTATION ERROR  or stack over flow.
            return;
        }
        
        System.out.println(cnt);
        cnt++;
        recur(); // recursive call
    }

    private static int recurFibonacci(int n) {
        // Base conditions
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        // Recursive calls: F(n) = F(n-1) + F(n-2)
        return recurFibonacci(n - 1) + recurFibonacci(n - 2);
    }
    public static void main(String[] args){
        recur();

         int n = 6; // Change this to find a different Fibonacci number
        System.out.println("The " + n + "th Fibonacci number is: " + recurFibonacci(n));
    }
}
