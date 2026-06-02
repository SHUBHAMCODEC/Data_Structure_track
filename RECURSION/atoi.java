package RECURSION;

public class atoi {
    private static String atoiFunc(String s, int i) {
        // Base case: reached the end of the string
        if (i == s.length()) {
            return "";
        }
        
        char ch = s.charAt(i);
        
        // Handle negative numbers if followed by a digit
        if (ch == '-' && i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
            return ch + atoiFunc(s, i + 1);
        }
        
        // Keep character if it is a digit
        if (ch >= '0' && ch <= '9') {
            return ch + atoiFunc(s, i + 1);
        }
        
        // Skip non-digit characters and look for the next match
        return atoiFunc(s, i + 1);
    }

    public static void main(String[] args) {
        String s = " hii, -p -+cdd 1478512 ashish";
        // Start recursion from index 0
        String resultStr = atoiFunc(s, 0).trim(); 
        
        if (!resultStr.isEmpty()) {
            int result = Integer.parseInt(resultStr);
            System.out.println("Extracted Integer: " + result);
        } else {
            System.out.println("No valid integer found.");
        }
    }
}
