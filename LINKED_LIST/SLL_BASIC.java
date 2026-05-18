import java.util.*;

class SLL_BASIC{

    static class Node{

        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node head=null;

    private static void insertion(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
        
    } 

    private static void deletion(){
        if(head==null){
            System.out.println("Head is NULL");
            return;
        }
        head=head.next;
        
    }

    private static void display(){
        Node temp=head;
        System.out.print("LIST :- ");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("NULL ");
    }

    private static Node insertionAtLast(int data){
        insertion(data);
        return head;
    } 

    private static Node insertionAtPoint(int data,int point){

        if (point <= 1 || head == null) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node newNode=new Node(data);
        Node prev=null; Node temp=head;
        
        int cnt=1;
        while(cnt!=point){
            prev=temp;
            temp=temp.next;
            cnt++;
        }
        prev.next=newNode;
        prev=prev.next;
        prev.next=temp;


        return head;

    }

    private static Node deletionAtLast(){
        if (head == null || head.next == null) {
            head = null;
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deletionAtPoint(int value){
        Node prev=null; Node temp=head;

        if(temp!=null && temp.data==value){
            head=head.next;
            return head;
        }
        while(temp!=null && temp.data!=value){
            prev=temp;
            temp=temp.next;
        }

        if(temp==null){
            return null;
        }
        prev.next=temp.next;

        return head;

    }

    private static void search(int value){
        Node temp=head;
        int cnt=0;
        while(temp!=null && temp.data!=value){
            temp=temp.next;
            cnt++;
        }

        System.out.println("Value found on index: "+ cnt);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("TYPE your Choice for Linkedlist \n\t\t 1.For insertion \n\t\t 2.For deletion \n\t\t 3.For display \n\t\t 4.For InsertionAtLast \n\t\t 5.For InsertionAtPoint \n\t\t 6.For DeletionFromLast \n\t\t 7.For DeletionAtPoint \n\t\t 8. For Search");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the value: ");
                    int val=sc.nextInt();
                    insertion(val);
                    break;
                case 2:
                    deletion();
                    break;
                case 3:
                    display();
                    System.out.println();System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the value: ");
                    int val2=sc.nextInt();
                    insertionAtLast(val2);
                    break;
                case 5:
                    System.out.println("Enter the value: ");
                    int val3=sc.nextInt();
                    System.out.println("Enter the index: ");
                    int ind=sc.nextInt();
                    insertionAtPoint(val3,ind);

                    break;
                case 6:
                    deletionAtLast();

                    break;
                case 7:
                    System.out.println("Enter the value for delete");
                    int del=sc.nextInt();
                    deletionAtPoint(del);

                    break;
                case 8:
                    System.out.println("Enter the value for search: ");
                    int ser=sc.nextInt();
                    search(ser);

                    break;
                default:
                    System.out.println("Thank YOu !!!");
                    return;
            }
        }
        
    }
}