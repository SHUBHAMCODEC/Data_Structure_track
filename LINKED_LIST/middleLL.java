 class middleLL {

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
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
    }
    

    private static Node middle(){
        Node low=head; Node high=head;

        while(high!=null && high.next!=null){
            high=high.next.next;
            low=low.next;
        }

        return low;
    }

   //main function for this code
    public static void main(String[] args){
        creation(new int[]{10,45,78,55,66,105});
        System.out.println(middle().data);
        creation(new int[]{10,45,78,55,66});
        System.out.println(middle().data);
    }
}
