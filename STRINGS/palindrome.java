public class palindrome {

    private static void helper(String s){
        int low=0, high=s.length()-1;

        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){
               System.out.println("String is Not Palindrome: ");
               return;
              
            }

            low++;
            high--;
        }

        System.out.println("String is Palindrome ");
    }
    public static void main(String[] args){
            helper(new String("banana"));
            helper("naman");
            helper("abba");
    }       
}
