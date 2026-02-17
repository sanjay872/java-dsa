import java.util.Scanner;

public class Tree {
    Scanner scanner;

    Tree(){
        scanner=new Scanner(System.in);
    }

    Node createTree(){
        System.out.println("Enter a value:");
        int val=scanner.nextInt();
        Node root=new Node(val);
        nextWhatSide(root);
        return root;
    }

    private void nextWhatSide(Node root){
        System.out.println("Do u want to insert in left?");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value: ");
            int val=scanner.nextInt();
            root.left=new Node(val);
            nextWhatSide(root.left);
        }

        System.out.println("Do u want to insert in right?");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value: ");
            int val=scanner.nextInt();
            root.right=new Node(val);
            nextWhatSide(root.right);
        }
    }

    void display(Node root, String intend){
        if(root==null){
            return;
        }
        System.out.println(intend+root.val);
        display(root.left,intend+"\t");
        display(root.right,intend+"\t");
    }

    void displayPretty(Node root, int level){
        if(root==null){
            return;
        }

        displayPretty(root.right,level+1);

        if(level==0){
            System.out.println(root.val);
        }
        else{
            for(int i=1;i<=level;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+root.val);
        }
        displayPretty(root.left,level+1);
    }
}