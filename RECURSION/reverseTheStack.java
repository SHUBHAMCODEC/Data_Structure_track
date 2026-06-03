import java.util.*;

public class reverseTheStack {


    private static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp=st.pop();
        reverseStack(st);
        insertedStack(st,temp);
    }

    private static void insertedStack(Stack<Integer> st,int element){
        if(st.isEmpty() || st.peek()<=element){
            st.push(element);
            return;
        }

        int temp=st.pop();
        insertedStack(st,element);
        st.push(temp);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(15);
        st.push(3);
        st.push(10);
        st.push(8);
        st.push(7);
        st.push(5);
        st.push(1);
    }
}