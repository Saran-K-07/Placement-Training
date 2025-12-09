// https://www.geeksforgeeks.org/problems/mirror-tree/1
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
    void mirror(Node root) {
        // code here
        if(root == null)
        return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}

//Driver Code
class p9{
    public static void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
        }
    public static void main(String[] args) {
        // Create a sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Print inorder before mirroring
        printInOrder(root);
        System.out.println();

        // Mirror the tree
        Solution sol = new Solution();
        sol.mirror(root);

        // Print inorder after mirroring
        printInOrder(root);
        }
    }