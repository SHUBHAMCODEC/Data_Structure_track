class doublyLL{

    static class Node{
        private int data;
        private Node prev;
        private Node next;


        Node(int data){
            this.next=null;
            this.prev=null;
            this.data=data;
        }
    }

    static Node head=null;
    private static Node insertionAtBack(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }


        Node temp=null; Node temp2=head;

        while(temp2.next!=null){
            temp=temp2;
            temp2=temp2.next;
        }

        temp2.next=newNode;
        temp2=temp2.next;
        temp2.prev=temp;

        return head;
    }

    private static void insertionAtbegin(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }

        Node temp=head;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        temp.prev=newNode;
        temp=temp.prev;
        temp.next=head;
        head=temp;
    }

    private static void deletion(int val){
        if(head==null || head.next==null){
            System.out.println("null");
        }
        Node temp=head; Node temp2=null;

        while(temp.data!=val){
            temp2=temp;
            temp=temp.next;
        }
        
        if(temp==null){
            System.out.println("value already deleted");
        }
        temp2.next=temp.next;
    }



    private static void display(Node head){
        Node temp=head;

        System.out.print("List: ");

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println(); System.out.println();

    }
    public static void main(String[] args){

    }


}