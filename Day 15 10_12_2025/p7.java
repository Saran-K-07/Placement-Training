// https://www.geeksforgeeks.org/problems/delete-a-node-from-bst/1
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    public Node rightMost(Node root){
        Node temp = root;
        while(temp.right!=null)
        temp = temp.right;
        return temp;
    }
    public Node delNode(Node root, int x) {
        if(root==null)
        return root;
        if(root.data>x)
        root.left = delNode(root.left,x);
        else if(root.data<x)
        root.right = delNode(root.right,x);
        else{
            if(root.left==null && root.right==null)
            return null;
            if(root.left==null)
            return root.right;
            if(root.right==null)
            return root.left;
        Node replacement = rightMost(root.left);
        root.data = replacement.data;
        root.left = delNode(root.left,replacement.data);
        }
        return root;
    }
}

//Driver Code
class p7{
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Example: Create a BST
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Delete a node, say 50
        root = sol.delNode(root, 50);

        // Optionally, print inorder traversal (assuming you have a method for it)
    }
}