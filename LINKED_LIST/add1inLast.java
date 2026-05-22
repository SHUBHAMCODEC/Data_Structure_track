public class add1inLast {
    static class Node{
        private int data;
        private Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;

    private static void creation(int arr[]){
        head=new Node(arr[0]);
        Node temp=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
    }

    private static Node reverse(Node head1){
        if (head1 == null || head1.next == null) {
            return head1;
        }
        Node temp=head1;
        Node newHead=reverse(temp.next);
        temp.next.next=head1;
        temp.next=null;
        
        return newHead;
    }

    private static void adding(){
        Node head1=reverse(head);
        Node temp1=head1; Node prev=null;
        int carry=1;
        while(temp1!=null || carry!=0){

            if(temp1==null){
                prev.next=new Node(carry);
                carry=0;
            }else{
                int sum=temp1.data;
                sum+=carry;
                carry=sum/10;
                temp1.data=sum%10;
                prev=temp1;
                temp1=temp1.next;
            }
            
        }
        Node head2=reverse(head1);
        display(head2);
    }
    

    private static void display(Node head2){
        Node temp=head2;
        System.out.println("List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(); System.out.println();
    }


    public static void main(String[] args){
        creation(new int[]{9,9,9,9,9});
        adding();

    }


}
