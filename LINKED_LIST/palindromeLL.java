public class palindromeLL {
    static class Node{
        private Node next;
        private int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    static Node head=null;

    private static void creation(int[] arr){
        head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
    }

    private static Boolean palindrome(){
        
        //Find the middle of the linkedlist
        Node slow=head; Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //reverse the second half
        Node prev=null; Node curr=slow;
        while(curr!=null){
            Node next=curr.next;
            prev=curr.next;
            prev=curr;
            curr=next;
        }

        // compare the first and second half for palindrome
        Node secHalfHead=prev;
        Node firstHalfHead=head;

        while(secHalfHead!=null){
            if(secHalfHead.data!=firstHalfHead.data){
                return false;
            }
            secHalfHead=secHalfHead.next;
            firstHalfHead=firstHalfHead.next;
        }
                
        return true;
    }
    public static void main(String[] args){
        creation(new int[]{1,10,2,40,50,44,56,47,87,1254});
System.out.println(palindrome());
        creation(new int[]{1, 2, 3, 2, 1});
System.out.println(palindrome());
        creation(new int[]{1, 2, 3, 2, 4});
System.out.println(palindrome());
        creation(new int[]{1, 2, 2, 1});
System.out.println(palindrome());
        creation(new int[]{1, 2, 1, 2});
System.out.println(palindrome());
        creation(new int[]{1});
System.out.println(palindrome());
        creation(new int[]{1, 2});
System.out.println(palindrome());
        creation(new int[]{4, 51, 16, 30, 16, 51, 4});
System.out.println(palindrome());
        creation(new int[]{-1, 2, 1});
System.out.println(palindrome());
    }
}
