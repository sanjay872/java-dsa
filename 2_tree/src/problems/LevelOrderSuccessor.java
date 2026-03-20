package problems;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }

    }

    public static void main(String[] args) {
        Queue<Node> q=new LinkedList<>();

        q.add(new Node(1));

        int val=14;

        while(!q.isEmpty()){
            int n=q.size();

            while(n>0){
                Node node=q.poll();

                if(node.val==val){
                    break;
                }

                if(node.left!=null){
                    q.add(node.left);
                }

                if(node.right!=null){
                    q.add(node.right);
                }

                n--;
            }

            if(n!=0){
                if(q.isEmpty()){
                    System.out.println("No successor");
                }else {
                    System.out.println("The successor is: "+q.poll().val);
                }
                break;
            }
        }
    }
}
