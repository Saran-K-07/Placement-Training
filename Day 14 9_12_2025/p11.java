// https://www.geeksforgeeks.org/problems/leaf-at-same-level/1
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
    static int leafLevel;
    boolean levelofleaf(Node root,int level){
        if(root == null)
        return true;
        if(root.left == null && root.right == null){
            if(leafLevel == -1)
            leafLevel = level;
            else if(level != leafLevel)
            return false;
        }
    return levelofleaf(root.left,level+1) && levelofleaf(root.right,level+1);
    }
    boolean check(Node root){
        leafLevel = -1;
        return levelofleaf(root,1);
    }
}

//Driver Code
class p11{
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        boolean result = sol.check(root);
        System.out.println(result);
    }
}