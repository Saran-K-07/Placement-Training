// https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    public Node reverseList(Node head) {
        if(head.next==null){
            return head;
        }
        Node temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}

//Driver Code
class p3{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Solution sol = new Solution();
        Node reversed = sol.reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.data + " ");
            reversed = reversed.next;
        }
    }
}