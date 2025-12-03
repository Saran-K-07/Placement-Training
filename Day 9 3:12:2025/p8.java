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
    Node reverseList(Node head) {
        Node prev = null,curr = head, after = head;
        while(after!=null){
            after = after.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
}

//Driver Code
class p8{
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