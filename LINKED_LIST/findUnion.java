class findUnion{
    static class Node{
        private int data;
        private Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    static Node head=null;

    private static Node creation(int[] arr){
        head=new Node(arr[0]);

        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node( arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }

    private static void  findUnion(Node l1, Node l2){

        if(l1==null && l2==null){
            System.out.println("Null");
            return;
        }
        Node temp1=l1; Node temp2=l2;

        while(temp1.data!=temp2.data){
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1.data==temp2.data) {
                System.out.println(" UNION POINT is: "+temp2.data);
                return;
                            
            }
            if(temp1==null)temp1=l2;
            if(temp2==null)temp2=l1;
        }
    }

    public static void main(String[] args){
       Node l1=creation(new int[]{1,4,5,6,7,8,110,15,47,85,26,33,78});
       Node l2=creation(new int[]{5,4,6,7,8,110,444,326,85,26,33,78});

       findUnion(l1, l2);

    }
}