public class MakeTree {
    public static void main(String[] args) {
        Tree tree=new Tree();
        Node root=tree.createTree();
        tree.display(root,"");
        tree.displayPretty(root,1);
    }
}
