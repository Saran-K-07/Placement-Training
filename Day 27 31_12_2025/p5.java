// https://www.geeksforgeeks.org/problems/find-unique-number/1
class Solution {
    public int findUnique(int[] arr) {
        int unique = 0;
        for(int i:arr){
            unique = unique^i;
        }
        return unique;
    }
}
//Driver Code
class p5{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(sol.findUnique(arr));
    }
}