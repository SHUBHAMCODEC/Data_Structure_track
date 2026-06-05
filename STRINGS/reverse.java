public class reverse {

    private static void helper(char[] s){
        int low=0, high=s.length-1;
        while(low<=high){
            char temp=s[low];
            s[low]=s[high];
            s[high]=temp;

            low++; high--;
        }

        for(char i:s){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("first : ");
        helper(new char[]{'h','e','l','l','o'});
        System.out.println();
        System.out.println("second: ");
        helper(new char[]{'H','a','n','n','a','h'});
    }
}
