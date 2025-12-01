// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
import java.util.*;
class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int prev=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==prev){
                ans.add(arr[i]);
            }else{
                prev = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5, 1, 2};
        ArrayList<Integer> duplicates = sol.findDuplicates(arr);
        System.out.println(duplicates);
    }
}