// https://www.geeksforgeeks.org/problems/get-minimum-element-from-stack/1
// Space Complexity = O(1)
import java.util.*;
class SpecialStack {
    Stack<Integer> st;
    int min;
    public SpecialStack() {
    st = new Stack<>();
    }

    public void push(int x) {
        if(st.isEmpty()){
            min = x;
            st.push(x);
        }
        else if(x<=min){
            int v = 2*x-min;
            min = x;
            st.push(v);
        }else{
            st.push(x);
        }
    }

    public void pop() {
        if(!st.isEmpty()){
            int temp = st.pop();
            if(temp<min){
                min = 2*min-temp;
            }
        }
    }

    public int peek() {
        if(!st.isEmpty()){
            int x = st.peek();
            if(x<min){
                return min;
            }else{
                return x;
            }
        }else{
            return -1;
        }
    }

    boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        if(st.isEmpty()){
            return -1;
        }else{
            return min;
        }
    }
}

class p5{
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