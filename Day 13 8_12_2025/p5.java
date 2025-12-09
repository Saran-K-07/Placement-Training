// https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1
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
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        // Your code here
        if(root==null){
            return 0;
        }
        return root.data + sumBT(root.left) + sumBT(root.right);
    }
}

//Driver Code
class p5{
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Calculate and print the sum of all nodes
        int sum = Solution.sumBT(root);
        System.out.println("Sum of all nodes: " + sum);
    }
}