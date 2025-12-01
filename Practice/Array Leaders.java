// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> mad = new ArrayList<>();
        int i = arr.length-1;
        int max = 0;
        while(i>=0){
            if(arr[i]>=max){
                max = arr[i];
                ans.add(max);
            }
            i--;
        }
        for(int j=ans.size()-1;j>=0;j--){
            mad.add(ans.get(j));
        }
        return mad;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result);
    }
}
