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

    //function for insertion at back of doubly linkedlist
    private static Node insertionAtBack(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return head;
        }


        Node temp=head; 

        while(temp.next!=null){
          
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.prev=temp;
     

        return head;
    }
// function for insertion at front of doubly linkedlist
    private static void insertionAtbegin(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
// function fro deleting any target node  from Doubly linkedlist
    private static void deletion(int val){
        if(head==null || head.next==null){
            System.out.println("null");
            return;
        }
        Node temp=head; 

        // Case 1: Head node holds the value
        if (temp.data == val) { 
            head = temp.next; 
            if (head != null) { 
                head.prev = null; 
            } 
            return; 
        } 

         // Search for the value
        while (temp != null && temp.data != val) { 
            temp = temp.next; 
        } 

        // Case 2: Value not found
        if (temp == null) { 
            System.out.println("Value not found in the list"); 
            return; 
        } 

         // Case 3: Node to be deleted is in the middle or end
        if (temp.next != null) { 
            temp.next.prev = temp.prev; 
        } 
        if (temp.prev != null) { 
            temp.prev.next = temp.next; 
        } 
    }


// function for display the doubly Linkedlist
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


    // Main function
    public static void main(String[] args){
        insertionAtBack(10);
        insertionAtBack(20);
        insertionAtBack(30);
        insertionAtBack(40);
        display(head);
        insertionAtbegin(70);
        insertionAtbegin(90);
        insertionAtbegin(100);
        display(head);


        deletion(40);
        display(head);
        insertionAtBack(900);
        display(head);
        deletion(900);
        display(head);


    }


}