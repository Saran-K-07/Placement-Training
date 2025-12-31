// https://leetcode.com/problems/number-of-1-bits/
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n&1)==1) 
            count++;
            n = n>>1;
        }
        return count;
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 11; // Example input, binary 1011 has 3 ones
        int result = sol.hammingWeight(n);
        System.out.println("Number of 1 bits in " + n + " is: " + result);
    }
}