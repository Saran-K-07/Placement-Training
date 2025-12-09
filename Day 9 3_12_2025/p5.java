// https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        HashSet<Integer> h = new HashSet<>();
        Node temp = head;
        h.add(temp.data);
        while(temp.next!=null){
            if(h.contains(temp.next.data)){
                temp.next = temp.next.next;
            }
            else{
            h.add(temp.next.data);
            temp = temp.next;
            }
        }
        
        return head;
    }
}

//Driver Code
class p5{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);

        Solution sol = new Solution();
        head = sol.removeDuplicates(head);

        // Print the list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}