// https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node temp = head;
        Node newNode = new Node(x);
        for(int i=0;i<p;i++){
            temp = temp.next;
        }
        if(temp.next!=null){
        temp.next.prev = newNode;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }
}

// Driver Code
class p2{
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        // Insert at position 2 (1-based, after first node)
        head = sol.insertAtPos(head, 1, 4);

        // Print the list
        System.out.print("List: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}