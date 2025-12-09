// https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Solution {
    public void deleteNode(Node del_node) {
            del_node.data = del_node.next.data;
            del_node.next = del_node.next.next;
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original list: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        Node toDelete = head.next; // Deleting node with data 2
        Solution sol = new Solution();
        sol.deleteNode(toDelete);

        System.out.print("After deletion: ");
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}