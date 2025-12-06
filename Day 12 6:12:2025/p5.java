import java.util.*;
class p5{
    public static int stackSize(Stack<Integer> st,int size){
        if(st.isEmpty()){
            return size;
        }
        int k = st.pop();
        int p = stackSize(st,size+1);
        st.push(k);
        return p;
    }
    public static int stackSize2(Stack<Integer> st){
        if(st.isEmpty()){
            return 0;
        }
        int k = st.pop();
        int p = 1 + stackSize2(st);
        st.push(k);
        return p;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Size using stackSize: " + stackSize(st, 0));
        System.out.println("Size using stackSize2: " + stackSize2(st));
    }
}