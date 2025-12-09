// https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
import java.util.Arrays;
class twoStacks {
    int arr[];
    int top1 = -1, top2 = 100;
    twoStacks() {
        arr = new int[100];
    }
    // Function to push an integer into the stack1.
    void push1(int x) {
        arr[++top1] = x;
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        arr[--top2] = x;
        // code here
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        if(top1>=0){
            return arr[top1--];
        }else{
            return -1;
        }
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
       if(top2<arr.length){
            return arr[top2++];
        }else{
            return -1;
        }
    }
}
class p3{
    public static void main(String[] args) {
        twoStacks ts = new twoStacks();
        ts.push1(2);
        ts.push1(3);
        ts.push2(4);
        System.out.println(Arrays.asList(ts.pop1(), ts.pop2(), ts.pop2()));
}
}