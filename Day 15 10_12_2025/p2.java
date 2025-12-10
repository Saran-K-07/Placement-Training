// https://www.geeksforgeeks.org/problems/insert-a-node-in-a-bst/0
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class Solution {
    public Node insert(Node root, int key) {
        Node newNode = new Node(key);
        if(root==null){
        root = newNode;
        return root;
        }
        Node temp = root;
        while(true){
            if(temp.data>key){
                if(temp.left==null)
                temp.left = newNode;
                else
                temp = temp.left;
            }else if(temp.data<key){
                if(temp.right==null)
                temp.right = newNode;
                else
                temp = temp.right;
            }else{
                break;
            }
        }
        return root;
    }
}

// Driver Code
class p2{
    static void printInorder(Node node) {
            if (node == null) return;
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node root = null;
        root = sol.insert(root, 50);
        root = sol.insert(root, 30);
        root = sol.insert(root, 20);
        root = sol.insert(root, 40);
        root = sol.insert(root, 70);
        root = sol.insert(root, 60);
        root = sol.insert(root, 80);
        printInorder(root);
    }
}