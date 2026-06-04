import java.util.Scanner;

class binaryCombinationOfN {

    private static void fun(StringBuilder sb, int i, int n) {
        // Base case: if we reached the required length, print and return
        if (i == n) {
            System.out.println(sb.toString());
            return;
        }

        // Choice 1: Append '0', recurse, then remove it (backtrack)
        sb.append('0');
        fun(sb, i + 1, n);
        sb.deleteCharAt(sb.length() - 1);


         // Choice 2: Only append '1' if the string is empty OR the last character is '0' , this if you dont want 1 come at adjacent side
        // if (sb.length() == 0 || sb.charAt(sb.length() - 1) == '0') {
        //     sb.append('1');
        //     fun(sb, i + 1, n);
        //     sb.deleteCharAt(sb.length() - 1);
        // }

        // Choice 2: Append '1', recurse, then remove it (backtrack)
        sb.append('1');
        fun(sb, i + 1, n);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        fun(sb, 0, n);
        
        sc.close();
    }
}
