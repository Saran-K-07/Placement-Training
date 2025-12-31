// https://leetcode.com/problems/power-of-four/?source=submission-noac
class Solution {
    public boolean isPowerOfFour(int n) {
        int count = 0;
        if( (n&n-1) == 0 && n!=0){
           while(n!=0){
            if((n&1)==1)
            break;
            count++;
            n = n>>1;
           }
        }else{
        return false;
        }
        return count%2==0;
    }
}

// Driver Code
class p3{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfFour(1)); // true
        System.out.println(sol.isPowerOfFour(16)); // true
        System.out.println(sol.isPowerOfFour(5)); // false
        System.out.println(sol.isPowerOfFour(64)); // true
    }
}