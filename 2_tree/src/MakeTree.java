public class MakeTree {
    public static void main(String[] args) {
//        Tree tree=new Tree();
//        Node root=tree.createTree();
//        tree.display(root,"");
//        tree.displayPretty(root,1);

        BST bst=new BST();
        int[] nums={1,2,3,4,5,6,7,8,9};
        bst.populateSorted(nums,0,nums.length-1);
        bst.display();
        bst.inorder_display();
        bst.postorder_display();
        bst.preorder_display();
    }
}
