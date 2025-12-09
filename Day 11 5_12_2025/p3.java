// https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1

import java.util.*;
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node i=head,j=head;
        while(j.next!=null){
            j = j.next;
        }
        while(i.data < j.data){
            int sum = i.data+j.data;
            if(sum==target){
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(i.data);
                ar.add(j.data);
                ans.add(ar);
            }
            if(sum<target){
                i = i.next;
            }else{
                j = j.prev;
            }
        }
        return ans;
    }
}

//Driver Code
class p3{
    public static void main(String[] args) {
        // Create a sample doubly linked list: 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        int target = 7;
        ArrayList<ArrayList<Integer>> result = Solution.findPairsWithGivenSum(target, head);

        // Print the result
        for (ArrayList<Integer> pair : result) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}