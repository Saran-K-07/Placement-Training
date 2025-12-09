// https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};

class Solution {
    public int cycleStart(Node head) {
        if(head.next == null){
            return -1;
        }
        Node slow = head,fast = head;
        while(true){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;
            }
            if(fast==null || fast.next==null){
                return -1;
            }
        }
        slow = head;
        while(slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }
}

//Driver Code
class p5{
public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = head.next; // cycle to node with data 2

    Solution sol = new Solution();
    int result = sol.cycleStart(head);
    System.out.println("Cycle starts at: " + result);
}
}