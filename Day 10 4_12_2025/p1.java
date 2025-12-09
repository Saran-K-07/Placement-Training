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
    public Node addTwoLists(Node head1, Node head2) {
        Node ans = null,temp =ans;
        int n = 0;
        head1 = reverseList(head1);
        head2 = reverseList(head2);
        Node temp1 = head1,temp2 = head2;
        while(temp1!=null && temp2!=null){
            int sum = temp1.data+temp2.data+n;
            if(sum>=10){
                Node newNode = new Node(sum%10);
                n = sum/10;
                if(ans==null){
                    ans = newNode;
                    temp = ans;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else{
                Node newNode = new Node(sum);
                if(ans==null){
                    ans = newNode;
                    temp = ans;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
                n = 0;
            }
        }
        while(temp1!=null){
            int sum = temp1.data+n;
            if(sum>=10){
                Node newNode = new Node(sum%10);
                n = sum/10;
                if(ans==null){
                    ans = newNode;
                    temp = ans;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            }else{
                Node newNode = new Node(sum);
                if(ans==null){
                    ans = newNode;
                    temp = ans;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp1 = temp1.next;
                n = 0;
            }
        }
        while(temp2!=null){
            int sum = temp2.data+n;
            if(sum>=10){
                Node newNode = new Node(sum%10);
                n = sum/10;
                if(ans==null){
                    ans = newNode;
                    temp = ans;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            }else{
                Node newNode = new Node(sum);
                if(ans==null){
                    ans = newNode;
                    temp = ans;
                }else{
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp2 = temp2.next;
                n = 0;
            }
        }
        if(n!=0){
           Node newNode = new Node(n);
           if(ans==null){
                    ans = newNode;
                    temp = ans;
            }else{
                    temp.next = newNode;
                    temp = temp.next;
            }
        }
    ans = reverseList(ans);
    temp = ans;
    while(temp.data==0){
        ans = temp.next;
        temp = temp.next;
    }
    return ans;
    }
    public Node reverseList(Node head) {
        Node prev = null,curr = head, after = head;
        while(after!=null){
            after = after.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
}

//Driver Code
class p1{
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