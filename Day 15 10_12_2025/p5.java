// https://www.geeksforgeeks.org/problems/binary-search-trees/0

class Solution {
    static boolean isBSTTraversal(int arr[]) {
        int prev = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>prev){
                prev = arr[i];
            }else{
                return false;
            }
        }
        return true;
    }
}

//Driver Code
class p5{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Is BST traversal: " + Solution.isBSTTraversal(arr1));

        int[] arr2 = {1, 3, 2, 4, 5};
        System.out.println("Is BST traversal: " + Solution.isBSTTraversal(arr2));
    }
}