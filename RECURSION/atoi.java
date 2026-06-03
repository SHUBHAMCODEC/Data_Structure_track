package RECURSION;

public class atoi {
    private static String atoiFunc(String s, int i) {
       if(i==s.length()) return "";
       if(s.charAt(i)=='-' &&  (i+1<s.length() && (s.charAt(i+1)>='0' && s.charAt(i+1)<='9'))){
        return s.charAt(i) + atoiFunc(s, i+1);
       }

       if(s.charAt(i)<'0' || s.charAt(i)>'9'){
        return atoiFunc(s, i+1);
       }
       
       
        
        return s.charAt(i) + atoiFunc(s, i+1);
       
    }

    public static void main(String[] args) {
        System.out.println("String is : ' bchsb   -nchd +=-   -1478451  shivam '");
        String s=" bchsb   -nchd +=-   -1478451  shivam ";
        String res=atoiFunc(s, 0);
        System.out.println("after recursion values is :");
        System.out.println(res);

        System.out.println(); 
    }
}
