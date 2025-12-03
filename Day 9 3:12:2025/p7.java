// https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        Node temp1 = head1,temp2 = head2,ans = null,temp=null;
        while(temp1!=null && temp2!=null){
            if(temp1.data==temp2.data){
                if(ans==null){
                    Node newNode = new Node(temp1.data);
                    ans = newNode;
                    temp = ans;
                }else{
                    Node newNode = new Node(temp1.data);
                    temp.next = newNode;
                    temp = temp.next;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else if(temp1.data>temp2.data){
                temp2 = temp2.next;
            }else{
                temp1 = temp1.next;
            }
        }
        return ans;
    }
}

//Driver Code
class p7{
        static Node insert(Node head, int data) {
            if (head == null) return new Node(data);
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = new Node(data);
            return head;
        }

        static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node head1 = null;
            head1 = insert(head1, 1);
            head1 = insert(head1, 2);
            head1 = insert(head1, 3);
            head1 = insert(head1, 4);
            head1 = insert(head1, 6);

            Node head2 = null;
            head2 = insert(head2, 2);
            head2 = insert(head2, 4);
            head2 = insert(head2, 6);
            head2 = insert(head2, 8);

            Node intersection = Solution.findIntersection(head1, head2);
            printList(intersection);
    }
}