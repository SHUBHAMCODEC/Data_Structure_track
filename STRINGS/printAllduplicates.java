public class printAllduplicates {

    private static void helper(String s){
        int ch[] =new int[150];
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)]+=1;
        }

        for(int i=0;i<ch.length;i++){
            if(ch[i]>1){
                System.out.print((char) i+" ");
            }
        }
    }
    public static void main(String[] args){
            helper("AAbbCDEFzzyx");
            System.out.println();
    }
}
