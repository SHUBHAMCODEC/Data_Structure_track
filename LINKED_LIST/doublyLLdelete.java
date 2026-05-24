public class doublyLLdelete {
    static class Node{
        private Node prev;
        private Node next;
        private int data;


        Node(int data){
            this.prev=null;
            this.next=null;
            this.data=data;
        }
    }


    static Node head=null;

    private static void creation(int[] arr){
        head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            newNode.prev=temp;
            temp.next=newNode;
            temp=temp.next;
        }
    }
    private static void delete(int target){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            // Track the next node early because temp links will change
            Node nextNode = temp.next; 

            if (temp.data == target) {
                // Case 1: Deleting the head node
                if (temp == head) {
                    head = temp.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } 
                // Case 2: Deleting middle or tail nodes
                else {
                    if (temp.prev != null) {
                        temp.prev.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }
            }
            temp = nextNode; // Safely move to the next item
        }

    }

    private static void display(){
        Node temp=head;
        System.out.print("List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null"); System.out.println();
    }

    public static void main(String [] args){
        creation(new int[]{1,2,2,3,4,5,22,65,2,3,4,78,45,40,55,16,19,40,76,59,68,61,2,1,3});
        delete(2);
        display();
        delete(3);
        display();
        delete(40);
        display();
        delete(1);
        display();
    }
}
