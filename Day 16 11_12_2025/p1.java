// https://www.geeksforgeeks.org/problems/complete-binary-tree/1
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class GfG {
    int countNodes(Node root){
        if(root== null)
        return 0;
        return 1+ countNodes(root.left) + countNodes(root.right);
    }
    boolean checkCompleteBT(Node root,int n,int i){
        if(root==null)
        return true;
        if(i>=n)
        return false;
        return checkCompleteBT(root.left,n,2*i+1) && checkCompleteBT(root.right,n,2*i+2);
    }
    boolean isCompleteBT(Node root) {
        int n = countNodes(root);
        return checkCompleteBT(root,n,0);
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        GfG obj = new GfG();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        // root.left.left.right = new Node(7); // Uncomment to make it incomplete
        System.out.println(obj.isCompleteBT(root));
    }
}