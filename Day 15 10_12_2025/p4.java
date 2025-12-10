// https://www.geeksforgeeks.org/problems/minimum-element-in-bst/0
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
    public int minValue(Node root) {
        if(root==null){
            return 0;
        }
        Node temp = root;
        while(temp.left!=null)
        temp = temp.left;
        return temp.data;
    }
}

//Driver Code
class p4{
    public static void main(String[] args) {
        // Create a sample BST
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        // Call minValue
        Solution sol = new Solution();
        int min = sol.minValue(root);
        System.out.println("Minimum value: " + min);
    }
}