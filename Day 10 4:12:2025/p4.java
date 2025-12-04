// https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    public boolean detectLoop(Node head) {
        if(head.next == null){
            return false;
        }
        Node slow = head,fast = head;
        while(true){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
            if(fast==null || fast.next==null){
                return false;
            }
        }
    }
}

//Driver Code
class p4{
    public static void main(String[] args) {
        
        // Create a linked list with a loop for testing
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        // Create a loop: 4 -> 2
        head.next.next.next.next = head.next;

        Solution sol = new Solution();
        boolean hasLoop = sol.detectLoop(head);
        System.out.println("Loop detected: " + hasLoop);
    }
}