// https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
class Node
{
    int data;
    Node next;
}

class Solution {
    public static void removeLoop(Node head) {
         if(head.next == null){
            return;
        }
        Node slow = head,fast = head,temp=null;
        while(true){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                
                break;
            }
            if(fast==null || fast.next==null){
                return;
            }
        }
        slow = head;
        while(slow!=fast){
            temp = fast;
            fast = fast.next;
            slow = slow.next;
        }
        temp.next = null;
    }
}

//Driver Code
class p6{
    public static void main(String[] args) {
        // Create nodes
        Node head = new Node();
        head.data = 1;
        Node second = new Node();
        second.data = 2;
        Node third = new Node();
        third.data = 3;
        Node fourth = new Node();
        fourth.data = 4;

        // Link them to form a loop
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Loop back to second

        // Remove the loop
        Solution.removeLoop(head);

        // Print the list to verify (assuming no loop)
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}