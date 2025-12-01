// https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1
import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        HashSet<String> seen = new HashSet<>();
        int count = 0;
        int i =0;
        int j = arr.length-1;
        while(i<j){
                if(arr[i]+arr[j]==0){
                    String key = arr[i]+","+arr[j];
                    if(!seen.contains(key)){
                        ans.add(new ArrayList<Integer>());
                        ans.get(count).add(arr[i]);
                        ans.get(count++).add(arr[j]);
                        seen.add(key);
                    }
                    i++;
                    j--;
                }else if(arr[i]+arr[j]<0){
                    i++;
                }else{
                    j--;
                }
        }
       return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3, -3, 0};
        ArrayList<ArrayList<Integer>> pairs = getPairs(arr);
        System.out.println(pairs);
    }
}
