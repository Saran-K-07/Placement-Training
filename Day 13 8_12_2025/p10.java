// https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        return (r1.data == r2.data) && isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }
}

//Driver Code
class p10{
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        Solution sol = new Solution();
        boolean result = sol.isIdentical(root1, root2);
        System.out.println("Are the trees identical? " + result);
    }
}