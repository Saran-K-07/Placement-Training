// https://www.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}

class Solution {

    public static int findMax(Node root) {
        // code here
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
    }

    public static int findMin(Node root) {
        
        // code here
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(findMin(root.left) , findMin(root.right)));
    }
}

//Driver Code
class p4{
    public static void main(String[] args) {
        // Create a sample binary tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        // Find and print max and min
        int max = Solution.findMax(root);
        int min = Solution.findMin(root);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}