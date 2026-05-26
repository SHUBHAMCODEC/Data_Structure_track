package BIT_MANIPULATION;

public class ithBitSet {

    private static void check(int num,int position){


        if(((num>>position)&1)==1){   // we can use this condition (1<<position)&num), remember the arrow face will always towards "1", {remember trick}
            System.out.println( "true");
            return;
        }
        System.out.println( "false");
    }
    public static void main(String[] args){
        check(13,0);
        check(13, 1);
        check(13, 2);
        check(13, 3);

        check(16, 4);
        check(16, 2);
        check(14 , 0);
        check(16, 9);
    }
}
