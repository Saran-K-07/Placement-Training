// https://www.geeksforgeeks.org/problems/subsets-1613027340/1
import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> subSet = new ArrayList<>();
        int n = 1<<arr.length;
        for(int i=0;i<=n-1;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                int num = i;
                if((num&(1<<j))!=0){
                    temp.add(arr[j]);
                }
            }
            subSet.add(temp);
        }
        return subSet;
    }
}

// Driver Code
class p4{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = sol.subsets(arr);
        System.out.println(result);
    }
}