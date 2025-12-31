// https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1
class Solution {
    public static boolean isPowerofTwo(int n) {
        return (n&(n-1)) == 0 && n!=0;
    }
}

// Driver Code
class p2{
    public static void main(String[] args) {
        int n = 16;
        System.out.println(Solution.isPowerofTwo(n)); // true

        n = 18;
        System.out.println(Solution.isPowerofTwo(n)); // false

        n = 1;
        System.out.println(Solution.isPowerofTwo(n)); // true
    }
}