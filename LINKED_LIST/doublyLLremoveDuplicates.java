public class doublyLLremoveDuplicates {
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

    private static void creation(int arr[]){
        head=new Node(arr[0]);

        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode =new Node(arr[i]);
            newNode.prev=temp;
            temp.next=newNode;
            temp=temp.next;
        }
    }

    private static void duplicates(){

        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            Node newNext=temp.next;
            if(temp.data==temp.next.data){
                if(temp==head){
                    head=head.next;
                    head.prev=null;
                }else{
                    if(temp.next!=null){
                        temp.next.prev=temp.prev;
                    }if(temp.prev!=null){
                        temp.prev.next=temp.next;
                    }
                }
            }

        temp=newNext;
        }
    }

    private static void display(){
        Node temp=head;

        System.out.print("List: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args){
        creation(new int[]{1,1,2,2,3,4,5,6,6,6,7,7,8,9,10,11,12,12});
        duplicates();
        display();
    }
}
