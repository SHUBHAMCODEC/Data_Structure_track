package Tree;

public class basic {
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    private static int countNodes(Node root){
        if(root==null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }


    private static int countLeafNode(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            return 1;
        }

        return countLeafNode(root.left)+countLeafNode(root.right);
    }


    private static boolean search(Node root,int key){
        if(root==null) return false;
        if(root.data==key) return true;

        return search(root.left, key) || search(root.right,key);
    }

    private static int count2Child(Node root){
        int cnt=0;
        if(root==null) return 0;
        if(root.left!=null && root.right!=null){
            cnt++;
        }

        return cnt + count2Child(root.left) + count2Child(root.right);
    }

    

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(2);
        root.right=new Node(1);
        root.left.right=new Node(4);
        root.left.left=new Node(10);
        root.left.left.right=new Node(14);
        System.out.println(countNodes(root));

    }
}
