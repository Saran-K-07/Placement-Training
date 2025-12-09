// https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        Node temp = head;
        while(temp.next!=null){
        if(temp.data == temp.next.data){
            temp.next = temp.next.next;
        }else{
            temp = temp.next;
        }}
        return head;
    }
}

//Driver Code
class p4{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        Solution sol = new Solution();
        head = sol.removeDuplicates(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}