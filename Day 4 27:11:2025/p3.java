// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
import java.util.*;
class p3 {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int i = 0;
        int j = 0;
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i!= arr.length && j<=arr.length){
            if(sum == target){
                ans.add(i+1);
                ans.add(j);
                break;
            }else if(sum<target && j<arr.length){
                sum += arr[j];
                j++;
            }else{
                sum -= arr[i];
                i++;
            }
            
        }
        if(ans.size()==0){
            ans.add(-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
