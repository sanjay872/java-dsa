public class BST {
    class Node{
        private final int val;
        private Node left;
        private Node right;
        private int height;

        Node(int val){
            this.val=val;
        }

        int getVal(){
            return val;
        }

        int getHeight(){
            return height;
        }
    }

    Node root;

    int getHeight(Node node){
        if(node==null){
            return 0;
        }

        return node.getHeight();
    }

    boolean isEmpty(){
        return root==null;
    }

    void insert(int val){
        insert(val,root);
    }

    Node insert(int val, Node root){
        if(root==null){
            return new Node(val);
        }

        if(val>root.val){
            root.right=insert(val,root.right);
        }

        if(val<root.val){
            root.left=insert(val,root.left);
        }

        root.height=Math.max(getHeight(root.right),getHeight(root.left))+1;

        return root;
    }

    boolean isBalanced(){
        return isBalanced(root);
    }

    boolean isBalanced(Node root){
        if(root==null){
            return true;
        }

        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
