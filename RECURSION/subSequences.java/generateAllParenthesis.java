import java.util.Scanner;

class generateAllParenthesis{

    private static void create(char[] ch,int index,int start,int close){

       if(start==0 && close==0){
         System.out.println(new String(ch));
         return;
       }

       if(start>0){
        ch[index]='(';
        create(ch,index+1,start-1,close);
       }

       if(close>start){
        ch[index]=')';
        create(ch,index+1,start,close-1);

       }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        char[] ch=new char[n*2];
        create(ch,0,n,n);
    }
}