// https://www.geeksforgeeks.org/problems/sum-tree/1
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
    boolean ans = true;
    public int sumTree(Node root){
        if(root == null)
        return 0;
        if(root.left == null && root.right == null)
        return root.data;
        int oldValue = root.data;
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        if(root.data != leftSum + rightSum){
            ans = false;
        }
        return oldValue + leftSum + rightSum;
    }
    boolean isSumTree(Node root) {
        // Your code here
        sumTree(root);
        return ans;
        
    }
}

//Driver Code
class p6{
    public static void main(String[] args) {
        // Create a sample tree
        Node root = new Node(26);
        root.left = new Node(10);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(3);

        // Create Solution instance
        Solution sol = new Solution();

        // Check if it's a sum tree
        boolean result = sol.isSumTree(root);

        // Print result
        System.out.println("Is sum tree: " + result);
    }
}