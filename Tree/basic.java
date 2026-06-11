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

// function for counting Nodes in Tree
    private static int countNodes(Node root){
        if(root==null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

// function for counting leaf Nodes in Tree
    private static int countLeafNode(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            return 1;
        }

        return countLeafNode(root.left)+countLeafNode(root.right);
    }

// function for searching a particular Node in Tree
    private static boolean search(Node root,int key){
        if(root==null) return false;
        if(root.data==key) return true;

        return search(root.left, key) || search(root.right,key);
    }

// function for counting Nodes which having 2 child in Tree
    private static int count2Child(Node root){
        int cnt=0;
        if(root==null) return 0;
        if(root.left!=null && root.right!=null){
            cnt++;
        }

        return cnt + count2Child(root.left) + count2Child(root.right);
    }

    private static int count1child(Node root){
        int cnt=0;
        if(root==null) return 0;
        if(root.left!=null && root.right==null || root.left==null && root.right!=null ){
            cnt++;
        }

        return cnt + count2Child(root.left) + count2Child(root.right);
    }


    private static int sum(Node root){
        if(root==null) return 0;

        return root.data+sum(root.left)+sum(root.right);
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

        System.out.println(countNodes(root));

    }
}
