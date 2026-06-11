package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class traversal {

    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    private static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static void postOrder(Node root){
        if(root==null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    private static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    private static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        // Your original nodes
        Node root = new Node(3); 
        root.left = new Node(2); 
        root.right = new Node(1); 
        root.left.right = new Node(4); 
        root.left.left = new Node(10); 
        root.left.left.right = new Node(14); 

        // --- New nodes added below to expand the tree ---

        // Populating the right side of the root (under node 1)
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        // Expanding the left side further (under nodes 4 and 14)
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(8);
        root.left.left.left = new Node(11);

        // Deepest level additions (under nodes 7 and 9)
        root.right.left.left = new Node(12);
        root.right.right.right = new Node(15);


        System.out.print("InOrder Traversal: ");
        inOrder(root); 
        System.out.println(); 

        System.out.print("PostOrder Traversal: ");
        postOrder(root); 
        System.out.println(); 

        System.out.print("PreOrder Traversal: ");
        preOrder(root); 
        System.out.println(); 


        System.out.println();
        System.out.print("Level Order Traversal(BFS): ");
        levelOrder(root);
        System.out.println();
    }
}