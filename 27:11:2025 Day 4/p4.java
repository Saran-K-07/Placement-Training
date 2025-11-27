// https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
import java.util.*;
class p4 {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        int[] prefixSum = new int[arr.length];
        boolean ans = false;
        prefixSum[0] = arr[0];
        Set<Integer> a = new HashSet<>();
        for(int i=1;i<arr.length;i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        for(int i=0;i<prefixSum.length;i++){
            if(a.contains(prefixSum[i]) || prefixSum[i]==0){
                ans = true;
            }else{
                a.add(prefixSum[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        boolean result = findsum(arr);
        System.out.println("Is there a subarray with 0-sum? " + result);
    }
}