// https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    int getMiddle(Node head) {
        Node slow = head,fast = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}

//Driver Code
class p2{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Solution sol = new Solution();
        System.out.println(sol.getMiddle(head));
    }
}