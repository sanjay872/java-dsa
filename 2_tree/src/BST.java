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
        root=insert(val,root);
    }

    void populate(int[] nums){
        for (int num : nums) {
            insert(num);
        }
    }

    void populateSorted(int[] nums, int start, int end){
        if(start>end){
            return;
        }

        int mid=start+(end-start)/2;
        insert(nums[mid]);
        populateSorted(nums,start,mid-1);
        populateSorted(nums,mid+1,end);
    }

    private Node insert(int val, Node root){
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

    private boolean isBalanced(Node root){
        if(root==null){
            return true;
        }

        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    void display(){
        display(root,"");
    }

    private void display(Node root, String detail){
        if(root==null){
            return;
        }

        System.out.println(detail+ root.val);
        display(root.left,"Left Child of "+root.val+":");
        display(root.right,"right Child of "+root.val+":");
    }

    void preorder_display(){
        System.out.println("Preorder: ");
        preorder_display(root);
        System.out.println();
    }

    private void preorder_display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder_display(root.left);
        preorder_display(root.right);
    }

    void inorder_display(){
        System.out.println("Inorder: ");
        inorder_display(root);
        System.out.println();
    }

    private void inorder_display(Node root){
        if(root==null){
            return;
        }
        inorder_display(root.left);
        System.out.print(root.val+" ");
        inorder_display(root.right);
    }


    void postorder_display(){
        System.out.println("Postorder: ");
        postorder_display(root);
        System.out.println();
    }

    private void postorder_display(Node root){
        if(root==null){
            return;
        }
        inorder_display(root.left);
        inorder_display(root.right);
        System.out.print(root.val + " ");
    }
}
