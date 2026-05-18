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

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("TYPE your Choice for Linkedlist \n\t\t 1.For insertion \n\t\t 2.For deletion \n\t\t 3.For display \n\t\t 4.For InsertionAtLast \n\t\t 5.For InsertionAtPoint \n\t\t 7.For DeletionFromLast \n\t\t 8.For DeletionAtPoint \n\t\t 9. For Search")
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    insertion();
                case 2:
                    deletion();
                case 3:
                    display();
                case 4:
                    insertionAtLast();
                case 5:
                    insertionAtPoint();
                case 6:
                    deletionAtLast();
                case 7:
                    deletionAtPoint();
                case 8:
                    search();
                default:
                    System.out.println("Thank YOu !!!");
                    return();
            }
        }
    }
}