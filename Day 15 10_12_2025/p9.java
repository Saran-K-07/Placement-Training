// https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class Solution {
    public int i;
    public int ans;
    public void inorder(Node root, int k){
        if(root==null)
        return;
        inorder(root.right,k);
        i++;
        if(i==k){
        ans = root.data;
        return;
        }
        inorder(root.left,k);
        
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
        i = 0;
        ans = -1;
        inorder(root,k);
        return ans;
    }
}

//Driver Code
class p9{
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Solution sol = new Solution();
        int k = 3; // Example: 3rd largest
        int result = sol.kthLargest(root, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}