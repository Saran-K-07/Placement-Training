// https://leetcode.com/problems/kth-largest-element-in-an-array/
// https://www.geeksforgeeks.org/problems/kth-largest-element5034/1
import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

//Driver Code
class p5{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(sol.findKthLargest(nums, k));
    }
}