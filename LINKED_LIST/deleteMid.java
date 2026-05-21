public class deleteMid {
// for even no. elements , this code will remove 2nd middle, for 1st middle removal, add fast.next.next=null with existing condition.
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
    private static void delete(){
        Node prev=null; Node slow=head; Node fast=head;

        while(fast!=null && fast.next!=null){   // like for 6 elements we have a choice wheather delete 3rd value or 4th value.
            prev=slow;                          // if we use exist code then 4th value will be delte, but if we use "fast.next.next" instead of fast.next then in that case, 3rd value will be deleted.
            fast=fast.next.next;
            slow=slow.next;

        }
        if(head.next==null){
            System.out.println("{}");
            return;
        }
        prev.next=slow.next;
        display(head);
    }

    private static void display(Node head1){
        Node temp=head1;
        System.out.print("List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("Null"); System.out.println();
    }
    

    public static void main(String[] args){
        System.out.println("--- Test 1: 6 elements (Deletes 3) ---");
        creation(new int[]{1, 2, 3, 4, 5, 6});
        delete();

        System.out.println("\n--- Test 2: 3 elements (Deletes 2) ---");
        creation(new int[]{1, 2, 3});
        delete();

        System.out.println("\n--- Test 3: 1 element (Deletes 1) ---");
        creation(new int[]{1});
        delete();

        System.out.println("\n--- Test 4: 2 elements (Deletes 1st element) ---");
        creation(new int[]{1, 2});
        delete();

        System.out.println("\n--- Test 5: 11 elements (Deletes 6) ---");
        creation(new int[]{10, 20, 30, 40, 50, 6, 70, 80, 90, 110, 120});
        delete();
    }
}