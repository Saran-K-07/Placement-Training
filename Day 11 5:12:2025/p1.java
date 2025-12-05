// https://www.geeksforgeeks.org/problems/circular-linked-list/1
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Solution {
    boolean isCircular(Node head) {
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            if(temp==head){
                return true;
            }
        }
        return false;
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        // Create nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Make it circular

        Solution sol = new Solution();
        System.out.println("Is circular: " + sol.isCircular(head));

        // Test non-circular
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        System.out.println("Is circular: " + sol.isCircular(head2));
    }
}