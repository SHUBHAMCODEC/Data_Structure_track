package BIT_MANIPULATION;

public class swap2Number {

    private static void swap(int a, int b){
        System.out.println("original value:  a->"+a+" and b->"+b);
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("swapped value:  a->"+a+" and b->"+b);
        System.out.println();System.out.println();
    }
    public static void main(String[] args){
        swap(10, 20);
        swap(05, 12);
        swap(16, 18);
        swap(35, 45);
    }
}
