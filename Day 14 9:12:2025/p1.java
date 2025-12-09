// https://www.geeksforgeeks.org/problems/level-order-traversal-line-by-line/1
import java.util.*;
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
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nodesAtLevel(Node root, ArrayList<Integer> ar, int k,int level){
        if(root == null)
        return;
        if(level == k){
        ar.add(root.data);
        return;
        }
        nodesAtLevel(root.left,ar,k,level+1);
        nodesAtLevel(root.right,ar,k,level+1);
    }
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> aar = new ArrayList<ArrayList<Integer>>();
        int n = height(root);
        for(int i=1;i<=n;i++){
            ArrayList<Integer> ar = new ArrayList<>();
            nodesAtLevel(root,ar,i,1);
            aar.add(ar);
        }
        return aar;
        
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Solution sol = new Solution();
        ArrayList<ArrayList<Integer>> result = sol.levelOrder(root);

        for (ArrayList<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}