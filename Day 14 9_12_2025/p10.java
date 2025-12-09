// https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public int height(Node root){
        if(root == null)
            return 0;
        
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public int diameter(Node root) {
        if(root == null)
            return 0;
        int d = height(root.left) + height(root.right);
        return Math.max(d,Math.max(diameter(root.left),diameter(root.right)));
        
    }
}

class p10{
    public static void main(String[] args) {
        // Create a sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create Solution instance
        Solution sol = new Solution();

        // Compute diameter
        int diam = sol.diameter(root);

        // Print result
        System.out.println("Diameter of the tree is: " + diam);
    }
}