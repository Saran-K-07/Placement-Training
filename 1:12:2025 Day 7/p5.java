// https://leetcode.com/problems/evaluate-reverse-polish-notation/
import java.util.*;
class p5 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String i:tokens){
            if(i.equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a+b);
            }else if(i.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a-b);
            }else if(i.equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a*b);
            }else if(i.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a/b);
            }else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        p5 obj = new p5();
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(obj.evalRPN(tokens));
    }
}