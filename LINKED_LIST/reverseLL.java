class reverseLL{

    static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    

    static Node head=null;

    private static void creation(int []arr){
        head=new Node(arr[0]);
        Node temp=head;
        
        for(int i=1;i<arr.length;i++){
            Node newNode1=new Node(arr[i]);
            temp.next=newNode1;
            
            temp=temp.next;
            
        }
        
        display(head);
     }

     private static void reverse(){
        Node prev=null; Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;
        display(prev);
     }

     private static Node reverseByRecursion(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node temp=head;
        Node newHead=reverseByRecursion(temp.next);

        temp.next.next=head;
        temp.next=null;

        
        return newHead;
     }

     private static void display(Node head){
        Node temp=head;
        System.out.print("List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    

        System.out.println();

     }
     //main function for this code

    public static void main(String[] args){

        creation(new int[]{10,20,55,65,78,77});
        reverse();
        Node head2 = reverseByRecursion(head);
        System.out.print("After Recursive Reverse -> ");
        display(head2);

    }
}