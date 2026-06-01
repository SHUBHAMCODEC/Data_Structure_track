package RECURSION;
import java.util.Scanner;
public class bas_printName5Times {
   
    static int cnt=0; // global variable, so that on every call we take a record of cnt, otherwise if we keep it local , then every time function call , it will reset to 0;
    private static void recur(){
        //int cnt=0;   // if we put this , stackOverFlow / segmentation error come(here cnt is local variable)
        if(cnt==5) return;
        System.out.println("shubham");
    
        cnt++;
        recur();
    }
// 2nd approch by using paramatrised function
// without using any global variable
    private static void recur2(int i,int n){
        if(i>n){
            return ;
        }

        System.out.println("shivam");
        recur2(i+1,n);
    }
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        String name="shubham"; 

        recur();  
        recur2(0,n);    
    }
}