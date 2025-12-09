// https://www.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2) {
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        return (root1.data == root2.data) && isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right) || (root1.data == root2.data) && isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left);
    }
}

//Driver Code
class p11 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example tree 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        
        // Example tree 2
        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.right = new Node(4);
        
        System.out.println(sol.isIsomorphic(root1, root2)); // Output: true
    }
}