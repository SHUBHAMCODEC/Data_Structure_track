public class sort0sAnd1s {
    static class Node{
        private int data;
        private Node next;

        Node (int data){
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

    private static Node middle(Node head1){
        Node slow=head1; Node fast=head1.next;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }

    private static Node merge(Node l1,Node l2){
        Node dummyHead=new Node(-1);
        Node tail=dummyHead;

        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }

        if(l1!=null){
            tail.next=l1;
        }
        else{
            tail.next=l2;
        }

        return dummyHead.next;
    }

    private static Node sortFunction(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node slow=middle(head);

        Node leftHead=head; Node rightHead=slow.next;
        slow.next=null;

        leftHead=sortFunction(leftHead);
        rightHead=sortFunction(rightHead);

        head=merge(leftHead,rightHead);
        display(head);

        return head;
    }

    private static void display(Node head){
        Node temp=head;
        System.out.print("List:- ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("Null"); 
        System.out.println(); System.out.println();
    }

    public static void main(String[] args){
        creation(new int[]{1,0,2,1,0,1,2,2,2,0,0,1,0,2,0,1,0,0,0,1,0,2,2,0,1,0,2});
        sortFunction(head);
    }
}
