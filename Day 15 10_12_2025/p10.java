import java.util.*;

// https://www.geeksforgeeks.org/problems/binary-tree-to-bst/1
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

class Solution {
    public int i;
    public void inorder(Node root, ArrayList<Integer> ar){
        if(root==null)
        return;
        inorder(root.left,ar);
        ar.add(root.data);
        inorder(root.right,ar);
    }
    public void transform(Node root, ArrayList<Integer> ar){
        if(root==null)
        return;
        transform(root.left,ar);
        root.data = ar.get(i++);
        transform(root.right,ar);
    }
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root) {
        i = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        inorder(root,ar);
        Collections.sort(ar);
        transform(root,ar);
        return root;
        
    }
}

class p10{
    public static void main(String[] args) {
                Solution sol = new Solution();
                Node root = new Node(10);
                root.left = new Node(2);
                root.right = new Node(7);
                root.left.left = new Node(8);
                root.left.right = new Node(4);
                
                root = sol.binaryTreeToBST(root);
                
                ArrayList<Integer> res = new ArrayList<>();
                sol.inorder(root, res);
                System.out.println(res);
    }
}