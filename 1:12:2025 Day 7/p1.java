
import java.util.Stack;

class p1{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);// Insert an Element
        System.out.println(st.peek());// Access last element
        st.pop();// Remove last element
        System.out.println(st.peek());
        System.out.println(st.size());// Size of stack
        System.out.println(st.isEmpty());// Check if stack is empty
    }
}