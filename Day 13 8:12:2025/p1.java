class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        data = x;
        left = null;
        right = null;
    }
}

class p1{
    public static int countNode(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }



    public static void main(String[] args) { // For counting the no of nodes in the Tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(11);
        root.right.right = new TreeNode(9);
        root.right.right.left = new TreeNode(5);


        System.out.println("No of Nodes in the Tree : " + countNode(root));// For counting the no of nodes in the Tree.
    }
}