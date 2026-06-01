package RECURSION;

public class bas_printName5Times {
   
    static int cnt=0; // global variable, so that on every call we take a record of cnt, otherwise if we keep it local , then every time function call , it will reset to 0;
    private static void recur(){
        //int cnt=0;   // if we put this , stackOverFlow / segmentation error come(here cnt is local variable)
        if(cnt==5) return;
        System.out.println("shubham");
    
        cnt++;
        recur();
    }
    public static void main(String [] args){
        String name="shubham"; 
        recur();      
    }
}