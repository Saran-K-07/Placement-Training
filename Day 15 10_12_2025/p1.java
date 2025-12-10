// https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    public boolean search(Node root, int key) {
        if(root==null)
        return false;
        Node temp = root;
        while(true){
            if(temp.data>key && temp.left!=null){
                temp = temp.left;
            }else if(temp.data<key && temp.right!=null){
                temp = temp.right;
            }else if(temp.data==key){
                return true;
            }else{
                return false;
            }
        }
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(20);

        Solution sol = new Solution();
        System.out.println(sol.search(root, 7)); // true
        System.out.println(sol.search(root, 12)); // false
    }
}