// https://www.geeksforgeeks.org/problems/maximum-depth-of-binary-tree/1

// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution {
    public static int maxDepth(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right)); 
    }
}

//Driver Code
class p8{
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Calculate and print the maximum depth
        int depth = Solution.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}
