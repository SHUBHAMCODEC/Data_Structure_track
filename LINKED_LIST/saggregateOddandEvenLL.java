public class saggregateOddandEvenLL {
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

    private static void saggregate(){
        Node dummyEven=head; Node dummyOdd=head.next;
        Node currentEven = dummyEven;
        Node currentOdd = dummyOdd;

        while(currentOdd != null && currentOdd.next != null){
            currentEven.next = currentOdd.next;
            currentEven = currentEven.next;
            
            currentOdd.next = currentEven.next;
            currentOdd = currentOdd.next;
        }

       // Terminate the even list properly
        currentEven.next = null;  //because the second  last element is on even position then, the odd list will have null at last but the even list will still connect to next odd position element, SO we explicitely adding null to this.
                                  // if list has even number of elements then also the condition works fine.
        

        //check if you un-comment above line the result will change...
        
        // Display both segregated lists
        System.out.print("Even-indexed nodes ");
        display(dummyEven);
        System.out.print("Odd-indexed nodes  ");
        display(dummyOdd);
    }

    private static void display(Node head1){
        System.out.print("this is list: ");

        Node temp=head1;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

        System.out.println();System.out.println();
    }


    public static void main(String [] args){
        creation(new int[]{10,11,12,13,14,15,16,17,18,19});
        saggregate();
    }
}
