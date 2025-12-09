// https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Solution {
    public Node addOne(Node head) {
        head = reverse(head);
        Node temp = head;
        int n = 1;
        
        while(temp.next!=null){
            temp.data += n;
            if(temp.data>=10){
                n = temp.data/10;
                temp.data = temp.data%10;
            }else{
                n = 0;
            }
            temp = temp.next;
        }
        
        temp.data += n;
        if(temp.data>=10){
            n = temp.data/10;
            temp.data = temp.data%10;
        }else{
            n = 0;
        }
        
        if(n!=0){
            Node newNode = new Node(n);
            temp.next = newNode;
        }
        head = reverse(head);
        return head;
    }
    public Node reverse(Node head){
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
class p9{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Solution sol = new Solution();
        head = sol.addOne(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}