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
    public int sumTree(Node root){
        if(root==null)
        return 0;
        if(root.left == null && root.right == null)
        return root.data;
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        if(leftSum==-1 || rightSum == -1)
        return -1;
        if(root.data != leftSum+rightSum)
        return -1;
        return root.data + leftSum + rightSum;
    }
    boolean isSumTree(Node root) {
        if(sumTree(root)!=-1)
        return true;
        else
        return false;
        
    }
}

//Driver Code
class p9{
    public static void main(String[] args) {
        Node root = new Node(26);
        root.left = new Node(10);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(3);

        Solution sol = new Solution();
        boolean res = sol.isSumTree(root);
        System.out.println(res);
    }
}