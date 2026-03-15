public class SegmentTree {

    static class Node{
        int val;
        int start;
        int end;
        Node left;
        Node right;

        Node(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start==end){
            Node node= new Node(start, end);
            node.val=arr[start];
            return node;
        }

        Node node= new Node(start, end);

        int mid=(start+end)/2;

        node.left=constructTree(arr,start,mid);
        node.right=constructTree(arr,mid+1,end);

        node.val=node.left.val+node.right.val;

        return node;
    }

    public void display(){
        this.display(this.root);
    }

    private void display(Node root){
        StringBuilder sb=new StringBuilder();

        if(root.left!=null){
            sb.append("Interval=[").append(root.left.start).append(",").append(root.left.end).append("] and data: ").append(root.left.val).append("=>");
        }
        else{
            sb.append("No left child");
        }

        sb.append("Interval=[").append(root.start).append(",").append(root.end).append("] and data: ").append(root.val).append("<=");

        if(root.right!=null){
            sb.append("Interval=[").append(root.right.start).append(",").append(root.right.end).append("] and data: ").append(root.right.val);
        }
        else{
            sb.append("No right child");
        }

        System.out.println(sb);

        if(root.left!=null){
            display(root.left);
        }

        if(root.right!=null){
            display(root.right);
        }

    }

    public int query(int qs, int qe){
        return this.query(this.root,qs,qe);
    }

    private int query(Node root, int qs, int qe){

        // total overlap
        if(root.start >= qs && root.end <= qe){
            return root.val;
        }

        // no overlap
        if(root.end < qs || root.start > qe){
            return 0;
        }

        // partial overlap
        return query(root.left, qs, qe) + query(root.right, qs, qe);
    }

    public void update(int idx, int val){
        this.root.val=this.update(root,idx,val);
    }

    private int update(Node root, int idx, int val){
        if(root==null){
            return 0;
        }

        if(idx>=root.start&&idx<=root.end){

            if(idx==root.start&&idx==root.end){
                root.val=val;
                return val;
            }
            else{
                int left=update(root.left,idx,val);
                int right=update(root.right,idx,val);
                root.val=left+right;
            }
        }

        return root.val;
    }
}
