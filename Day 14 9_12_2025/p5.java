// https://www.geeksforgeeks.org/problems/transform-to-sum-tree/1
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Solution {
    public int sumTree(Node root){
        if(root == null)
        return 0;
        int oldValue = root.data;
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        root.data = leftSum + rightSum;
        return oldValue + leftSum + rightSum;
    }
    public void toSumTree(Node root) {
        sumTree(root);
    }
}

//Driver Code
class p5{
    static void printInorder(Node node) {
            if (node == null) return;
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        Solution sol = new Solution();
        sol.toSumTree(root);

        // Print the tree (inorder traversal for verification)
        printInorder(root);
        }

        
    }