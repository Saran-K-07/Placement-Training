// https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Solution {
    public Node segregate(Node head) {
        Node zeroHead = new Node(0);
        Node oneHead  = new Node(0);
        Node twoHead  = new Node(0);
        
        Node zeroTail = zeroHead;
        Node oneTail  = oneHead;
        Node twoTail  = twoHead;
        
        Node current = head;
        while(current != null){
            if(current.data == 0){
                zeroTail.next = current;
                zeroTail = current;
            } else if(current.data == 1){
                oneTail.next = current;
                oneTail = current;
            } else { // current.data must be 2
                twoTail.next = current;
                twoTail = current;
            }
            // Move to the next node in the original list
            current = current.next;
        }
        twoTail.next = null;
        if (oneHead.next != null) {
            oneTail.next = twoHead.next;
        }
        if (oneHead.next != null) {
            zeroTail.next = oneHead.next;
        } else {
            zeroTail.next = twoHead.next;
        }
        return zeroHead.next;
    }
}

//Driver Code
class p8{
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 0 -> 1 -> 2 -> 0
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);

        Solution sol = new Solution();
        Node segregatedHead = sol.segregate(head);

        // Print the segregated list
        Node temp = segregatedHead;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}