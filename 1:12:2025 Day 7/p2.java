class Stack{
    int top;
    int[] arr;
    public Stack(int n){
        arr = new int[n];
        top = -1;
    }
    public void push(int a){
        if(top!=arr.length-1){
            top++;
            arr[top] = a;
        }else{
            System.err.println("Stack size is full");
        }
    }
    public int peek(){
        if(top!=-1)
            return arr[top];
        else
            return -1;
    }
    public void pop(){
        if(top == -1){
            System.err.println("Cannot delete an Empty Stack");
        }else{
            top--;
        }
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
}
class p2{
    public static void main(String[] args) {
        Stack
    }
}