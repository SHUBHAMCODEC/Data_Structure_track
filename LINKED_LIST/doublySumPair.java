public class doublySumPair {
    static class Node{
        private Node next;
        private Node prev;
        private int data;


        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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


    private static void pair(int sum){
        Node left=head; Node right=head;
        while(right.next!=null){
            right=right.next;
        }
        System.out.print(" pairs are : ");
        while(left.data<right.data){
            if(left.data+right.data==sum){
                System.out.println("( " +left.data +"-"+ right.data+" )");
                left=left.next;
                right=right.prev;
            }else if((left.data+right.data)<sum){
                left=left.next;
            }else if((left.data+right.data)>sum){
                right=right.prev;
            }
        }
    }
    public static void main(String[] args){
        creation(new int[]{2, 4, 4, 7, 10, 11, 13, 14, 18, 19, 
                            20, 20, 21, 23, 24, 25, 29, 31, 33, 34, 
                            36, 40, 41, 41, 41, 42, 45, 46, 50, 52, 
                            55, 59, 61, 62, 63, 67, 70, 71, 71, 72, 
                            75, 76, 78, 79, 81, 82, 85, 87, 88, 89, 
                            93, 93, 95, 96, 96, 99, 102, 104, 107, 108, 
                            110, 111, 114, 114, 116, 116, 117, 118, 119, 121, 
                            122, 122, 123, 124, 128, 130, 131, 131, 132, 132, 
                            136, 137, 139, 139, 140, 140, 143, 146, 148, 148, 
                            150, 154, 155, 159, 166, 168, 172, 179, 184, 187});

        pair(150);// this is something incredible
    }
}
