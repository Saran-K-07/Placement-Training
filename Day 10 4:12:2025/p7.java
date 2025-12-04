// https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
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
    Node sortedMerge(Node head1, Node head2) {
        Node temp1=head1,temp2=head2;
        Node dummyNode = new Node(0);
        Node res = dummyNode;
        while(temp1!=null&&temp2!=null){
            if(temp1.data<temp2.data){
                res.next = temp1;
                res = res.next;
                temp1 = temp1.next;
            }else{
                res.next = temp2;
                res=res.next;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null){
            res.next = temp1;
        }
        if(temp2!=null){
            res.next = temp2;
        }
        return dummyNode.next;
    }
}

//Driver Code
class p7{
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Solution sol = new Solution();
        Node merged = sol.sortedMerge(head1, head2);

        Node temp = merged;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}