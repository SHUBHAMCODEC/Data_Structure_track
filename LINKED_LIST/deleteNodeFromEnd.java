public class deleteNodeFromEnd {
    static class Node{
        private int data;
        private Node next;

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


    private static void delete(int target){

        display(head);

        //reverse the list
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }

        //delete the target index
        int cnt=1;
        Node temp=prev; Node prev1=null;
        while(cnt!=target){
            prev1=temp;
            temp=temp.next;
            cnt++;
        }
        // Handle edge case: deleting the head of the reversed list
        if (prev1 == null) {
            prev = prev.next;
        } else if (temp != null) {
            prev1.next = temp.next;
        }

        //again rverse the deleted list
        head=reverse(prev);
        //display the list after the deleting operation..
        display(head);
    }

    private static void display(Node head){
        System.out.print("List: ");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(); System.out.println();
    }

    private static Node reverse(Node head1){
        if(head1==null || head1.next==null){
            return head1;
        }

        Node temp=head1;
        Node newHead=reverse(temp.next);

        temp.next.next=head1;
        temp.next=null;

        return newHead;
    }
    public static void main(String[] args){
        creation(new int[]{1,5,6,17,12,22,42,46,65,69,89});
        delete(5);
    }
}
