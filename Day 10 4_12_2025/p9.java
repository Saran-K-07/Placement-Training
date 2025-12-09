// https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution { 
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverse(slow.next); // reverse second list
        slow.next = null;
        while(rev != null) {
            if(head.data != rev.data) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
        
    }

//Driver Code
class p9{
public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);
    head.next.next.next.next = new Node(1);
    
    Solution sol = new Solution();
    boolean result = sol.isPalindrome(head);
    System.out.println(result);
}
}