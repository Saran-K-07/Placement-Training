// https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1
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
    public Node LCA(Node root, Node n1, Node n2) {
        if(root==null)
        return null;
        if(root.data<n1.data && root.data<n2.data)
        return LCA(root.right,n1,n2);
        if(root.data>n1.data && root.data>n2.data)
        return LCA(root.left,n1,n2);
        return root;
    }
}

// Driver Code
class p8{
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        Node n1 = root.left.right.left; // Node with 10
        Node n2 = root.left.right.right; // Node with 14

        Node lca = sol.LCA(root, n1, n2);
        System.out.println("LCA of " + n1.data + " and " + n2.data + " is: " + lca.data);
    }
}