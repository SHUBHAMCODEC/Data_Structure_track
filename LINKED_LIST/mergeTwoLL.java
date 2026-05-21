public class mergeTwoLL {
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
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
        }
        return head;
    }

    private static void merger(Node list1,Node list2){
        Node dHead=new Node(0);
        Node tempD=dHead;
        Node tL1=list1; Node tL2=list2;

        while(tL1!=null && tL2!=null){
            if(tL1.data<tL2.data){
                tempD.next=tL1;
                tempD=tempD.next;
                tL1=tL1.next;
            }else{
                tempD.next=tL2;
                tempD=tempD.next;
                tL2=tL2.next;
            }
        }

        if(tL1==null){
            while(tL2!=null){
                tempD.next=tL2;
                tempD=tempD.next;
                tL2=tL2.next;
            }
        }else{
            while(tL1!=null){
                tempD.next=tL1;
                tempD=tempD.next;
                tL1=tL1.next;
            }
        }
        display(dHead.next);
    }

    private static void display(Node head1){
        Node temp=head1;
        System.out.print("List: ");
        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    // main function for run
    public static void main(String[] args){
        Node list1=creation(new int[]{1,4,5,7,9,11,13,15,19,25,35,49,50});
        Node list2=creation(new int[]{2,4,6,8,10,14,18,28,38,46,72});
        merger(list1,list2);
    }
}
