// https://www.geeksforgeeks.org/problems/sum-of-leaf-nodes-in-bst/1
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Solution {
    public static int sumOfLeafNodes(Node root) {
        if(root==null)
        return 0;
        int sum=0;
        if(root.left==null && root.right==null)
        sum = root.data;
        return sum + sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }
}

//Driver Code
class p6{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        System.out.println(Solution.sumOfLeafNodes(root));
    }
}