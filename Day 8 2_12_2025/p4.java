// https://www.geeksforgeeks.org/problems/get-minimum-element-from-stack/1
// Space Complexity = O(n)
import java.util.*;
class SpecialStack {
    Stack<Integer> st;
    Stack<Integer> minst;
    public SpecialStack() {
    st = new Stack<>();
    minst = new Stack<>();
    }

    public void push(int x) {
        if(minst.isEmpty()){
            minst.push(x);
        }
        else if(minst.peek()>=x){
            minst.push(x);
        }
        st.push(x);
    }

    public void pop() {
        if(!st.isEmpty()){
            int temp = st.pop();
            if(temp == minst.peek()){
                minst.pop();
            }
        }
    }

    public int peek() {
        if(!st.isEmpty()){
            return st.peek();
        }else{
            return -1;
        }
    }

    boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        if(minst.isEmpty()){
            return -1;
        }else{
            return minst.peek();
        }
    }
}
class p4{
    public static void main(String[] args) {
        SpecialStack ss = new SpecialStack();
        ss.push(10);
        ss.push(5);
        ss.push(15);
        System.out.println("Min: " + ss.getMin()); // Should print 5
        ss.pop();
        System.out.println("Min after pop: " + ss.getMin()); // Should print 5
        ss.pop();
        System.out.println("Min after another pop: " + ss.getMin()); // Should print 10
    }
}