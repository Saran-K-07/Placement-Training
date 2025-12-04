// https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public static Node reverse(Node head){
        Node pre = null, curr = head, after = head;
        while(after != null){
            after = after.next;
            curr.next = pre;
            pre = curr;
            curr = after;
        }
        return pre;
    }
    public Node addTwoLists(Node head1, Node head2) {
        Node h1 = head1;
        Node h2 = head2;
        while(h1.data == 0 && h1.next != null){
            h1 = h1.next;
        }
        while(h2.data == 0 && h2.next != null){
            h2 = h2.next;
        }
        h1 = reverse(h1);
        h2 = reverse(h2);
        Node res = null;
        Node temp = null;
        int carry = 0;
        while(h1 != null && h2 != null){
            int sum = h1.data + h2.data + carry;
            Node newNode = new Node(sum % 10);
            carry = sum /10;
            if(res == null){
                res = newNode;
                temp = res;
            }else{
                newNode.next = temp;
                temp = newNode;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        while(h1 != null){
            int sum = h1.data + carry;
            Node newNode = new Node(sum % 10);
            carry = sum /10;
            
            newNode.next = temp;
            temp = newNode;
            h1 = h1.next;
            if(h1 == null && carry == 1){
                newNode = new Node(1);
               newNode.next = temp;
                temp = newNode;
                carry = 0;
            }
        }
        while(h2 != null){
            int sum = h2.data + carry;
            Node newNode = new Node(sum % 10);
            carry = sum /10;
            
            newNode.next = temp;
            temp = newNode;
            h2 = h2.next;
            if(h2 == null && carry == 1){
                 newNode = new Node(1);
               newNode.next = temp;
                temp = newNode;
                carry = 0;
            }
        } 
        if(carry == 1){
             Node newNode = new Node(1);
               newNode.next = temp;
                temp = newNode;
        }
        return temp;  
    }
}

//Driver Code
class p2{
    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 3
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Create second linked list: 4 -> 5 -> 6
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        // Add the two lists
        Solution sol = new Solution();
        Node result = sol.addTwoLists(head1, head2);

        // Print the result
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}