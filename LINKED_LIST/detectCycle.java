public class detectCycle {
    static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    private static void creation(int [] arr){
        head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
         //temp.next=head; //Un-comment this line if you want to test a real circular cycle:

    }
    private static Boolean detection(){
        Node slow=head; Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next; 
            if(slow==fast){
                return true;
            }
        }

       

        return false;
    }

    public static void main(String[] args){
        creation(new int[]{10,45,52,62,78,109,110});
        System.out.println(detection());
    }
}
