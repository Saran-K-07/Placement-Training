// https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
class Node {
            int data;
            Node next;
            Node(int d) { data = d; next = null; }
        }

class Solution { 
    public static Node head2;
    public boolean checkPalindrome(Node head){
       if(head==null){
           return true;
       }
       boolean ans = checkPalindrome(head.next) && (head2.data == head.data);
       head2 = head2.next;
       return ans;
    }
    public boolean isPalindrome(Node head) {
        head2 = head;
        return checkPalindrome(head);
    }
        
    }

//Driver Code
class p4{
        public static void main(String[] args) {
            // Create a sample linked list: 1 -> 2 -> 3 -> 2 -> 1 (palindrome)
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(2);
            head.next.next.next.next = new Node(1);

            Solution sol = new Solution();
            boolean isPal = sol.isPalindrome(head);
            System.out.println("Is palindrome: " + isPal);

            // Test with non-palindrome: 1 -> 2 -> 3 -> 4 -> 5
            Node head2 = new Node(1);
            head2.next = new Node(2);
            head2.next.next = new Node(3);
            head2.next.next.next = new Node(4);
            head2.next.next.next.next = new Node(5);

            boolean isPal2 = sol.isPalindrome(head2);
            System.out.println("Is palindrome: " + isPal2);
        }
}