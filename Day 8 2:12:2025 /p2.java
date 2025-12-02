// https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
import java.util.*;
class p2 {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Queue<Integer> ans = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int d = q.size();
        if(d<k){
            return q;
        }
        for(int i=0;i<k;i++){
            s.push(q.poll());
        }
        for(int i=0;i<d;i++){
            if(!s.isEmpty()){
                ans.offer(s.pop());
            }else{
                ans.offer(q.poll());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        p2 obj = new p2();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        Queue<Integer> result = obj.reverseFirstK(q, k);
        System.out.println(result);
    }
}