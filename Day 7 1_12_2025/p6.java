
import java.util.*;

class p6{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(4);
        q.offer(8);
        q.offer(1);
        q.offer(0);
        q.offer(5);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}