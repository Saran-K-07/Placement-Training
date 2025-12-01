// https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
import java.util.*;
class Solution {
    public String reverse(String S) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<S.length();i++){
            s.push(S.charAt(i));
        }
        String ans = "";
        while(!s.isEmpty()){
            ans += s.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "GeeksforGeeks";
        String reversed = sol.reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}