// https://www.geeksforgeeks.org/problems/deletion-and-reverse-in-linked-list/1
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Solution {
    Node deleteNode(Node head, int key) {
        // code here
        Node temp = head;
        if(head.data == key){ // if key is head.
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = temp.next;
        }else{ // if key is not head
            while(temp.next != head){
                if(temp.next.data == key){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
        
       
        return head;
    }
}

//Driver Code
class p4{
    public static void main(String[] args) {
        // Create a circular linked list: 1 -> 2 -> 3 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Make it circular

        // Print original list
        System.out.print("Original list: ");
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();

        // Delete node with key 2
        Solution sol = new Solution();
        head = sol.deleteNode(head, 2);

        // Print list after deletion
        System.out.print("After deleting 2: ");
        if (head != null) {
            temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }
}