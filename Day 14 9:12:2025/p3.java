import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    int k = 1;
    public void nodesAtLevel(Node root, ArrayList<Integer> ar, int level){
        if(root == null)
        return;
        if(level == k){
        ar.add(root.data);
        k++;
        }
        nodesAtLevel(root.right,ar,level+1);
        nodesAtLevel(root.left,ar,level+1);
    }
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ar = new ArrayList<>();
        nodesAtLevel(root,ar,1);
        return ar;
        
    }
}

//Driver Code
class p3{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();
        ArrayList<Integer> result = sol.leftView(root);
        System.out.println(result);
    }
}