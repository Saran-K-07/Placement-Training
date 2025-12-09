// https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
import java.util.*;
class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }else if(st.isEmpty()){
                return false;
            }else if(st.peek() == '[' && s.charAt(i)==']' || st.peek() == '(' && s.charAt(i)==')' || st.peek() == '{' && s.charAt(i)=='}'){
                st.pop();
            }else{
                return false;
            }
            }
            if(st.isEmpty()){
                return true;
            }else{
                return false;
            }
        }
        public static void main(String[] args) {
            Solution sol = new Solution();
            String[] tests = {"()", "[]{}", "(]", "[{]}"};
            for (String test : tests) {
                System.out.println(test + " is balanced: " + sol.isBalanced(test));
            }
        }
    }
