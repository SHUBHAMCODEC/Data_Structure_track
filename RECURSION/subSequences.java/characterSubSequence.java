public class characterSubSequence {

    private static void helper(int index,String current,String input){
            if(index==input.length()){
                System.out.println(current.isEmpty() ? "(empty)" : current);
                return;
            }

            // we will take the element
            helper(index+1,current+input.charAt(index),input);

            // we will not take element

            helper(index+1,current,input);
    }
    public static void main(String[] args){
        helper(0,"","abc");
    }
}
