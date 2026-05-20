class lengthOfCycle{
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

        temp.next=head.next;
    }

    private static int lening(){
        Node slow=head; Node fast=head; int ctr=0;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(slow==fast){  // below dow while loop will decides the length of loop.
                Node temp=slow;
                do{
                    temp=temp.next;
                    ctr++;
                }while(temp!=slow);

                return ctr;
            }
        }

        return ctr;
    }
    public static void main(String[] args){
        creation(new int[]{1,2,3,4,5,6,7,8,9});
        System.out.println(lening());
    }
}