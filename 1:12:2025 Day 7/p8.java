import java.util.Queue;
import java.util.LinkedList;
class Stack{
    Queue<Integer> q1 =  new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    public void push(int a){
        q1.offer(a);
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public int size(){
        return q1.size();
    }
    public void pop(){
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int res = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }public int peek(){
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int res = q1.peek();
        q2.offer(q1.poll());


        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return res;
    }
}
public class p8{
public static void main(String[] args){
        Stack st = new Stack();
        st.push(4);
        st.push(7);
        st.push(9);
        st.push(3);
        st.push(2);
        System.out.println(st.peek());
    }
}
