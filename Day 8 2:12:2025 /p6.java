// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> br = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int i = arr.length-1;
        while(i>=0){
            if(st.isEmpty()){
                br.add(-1);
                st.push(arr[i]);
                i--;
            }else if(st.peek()>arr[i]){
                br.add(st.peek());
                st.push(arr[i]);
                i--;
            }else{
                st.pop();
            }
        }
        Collections.reverse(br);
        return br;
    }
}

// Driver Code
class p6{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 3, 2, 4};
        ArrayList<Integer> result = sol.nextLargerElement(arr);
        System.out.println(result);
    }
}