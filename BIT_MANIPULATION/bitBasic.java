package BIT_MANIPULATION;
import java.util.*;
public class bitBasic {


private static void decToBinary(int n) {
        // Uses Java's built-in bitwise converter
        System.out.println("Binary string: " + Integer.toBinaryString(n));
    }

    private static void binToDecimal(String binStr) {
        // Uses bitwise parsing base 2
        int number = Integer.parseInt(binStr, 2);
        System.out.println("NUMBER in decimal: " + number);
    }

    public static void main(String[] args) {
        decToBinary(69);
        binToDecimal("1000101"); // 69 in binary
    }
}
