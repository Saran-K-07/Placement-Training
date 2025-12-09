// https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class Solution {
    public int height(Node root){
        if(root == null)
            return 0;
        
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root == null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}

//Driver Code
class p8{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.right = new Node(6);

        Solution sol = new Solution();
        boolean result = sol.isBalanced(root);
        System.out.println("Is the tree balanced? " + result);
    }
}