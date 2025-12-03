// https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution {

    int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;

        // Advance the fast pointer by k steps
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; 
            }
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}

//Driver Code
class p3{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Solution sol = new Solution();
        int k = 2;
        int result = sol.getKthFromLast(head, k);
        System.out.println("The " + k + "th node from the end is: " + result);
    }
}