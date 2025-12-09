// https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}


class Solution {
    public Node rotate(Node head, int k) {
        // code here
        Node temp1 = head;
        if(head.next == null){
            return head;
        }
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        while(k != 0){
            temp1.next = head;
            head = head.next;
            temp1 = temp1.next;
            temp1.next = null;
            k--;
        }
        return head;
    }
}

//Driver Code
class p5{
    public static void main(String[] args) {
        Solution sol = new Solution();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;
        Node rotated = sol.rotate(head, k);
        Node temp = rotated;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}