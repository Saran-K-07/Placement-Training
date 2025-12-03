// https://www.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    public static Node moveToFront(Node head) {
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
}

// Driver Code
class p6{
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Call the moveToFront function
        Solution sol = new Solution();
        head = sol.moveToFront(head);

        // Print the modified list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
