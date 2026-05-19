public class startingPointCycle {
    static class Node{
        private Node next;
        private int data;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head=null;

    private static void creation(int [] arr){
        head= new Node(arr[0]);

        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        // below line will decide what will be the starting point of cycle;
        temp.next=head.next;

    }

    private static Node startPoint(){
        Node slow=head; Node fast=head;

        while(fast!=null  && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                break;
            }
        }

        return slow;
    }


    public static void main(String [] args){
        creation(new int[]{10,20,40,50,60,70,74,12,553});
        System.out.println(startPoint().data);
    }
}
