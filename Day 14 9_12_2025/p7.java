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
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight)>1){
            return -1;
        }
        return 1 + Math.max(leftHeight,rightHeight);
    }
    public boolean isBalanced(Node root) {
        // code here
        if(height(root)==-1){
            return false;
        }else{
            return true;
        }
    }
}

//Driver Code
class p7{
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