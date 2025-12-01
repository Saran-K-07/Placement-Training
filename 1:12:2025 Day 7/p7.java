class Queue{
    int b;
    int t;
    int[] arr;
    public Queue(int n){
        arr = new int[n];
        b = 0;
        t = -1;
    }
    public void add(int a){
        if(t!=arr.length){
            t++;
            arr[t] = a;
        }else{
            System.err.println("Queue is full");
        }
    }
    public boolean isEmpty(){
        return t<b;
    }
    public int peek(){
        if(!isEmpty()){
            return arr[b];
        }else{
            System.err.println("Queue is Empty");
        }
        return 0;
    }
    public int poll(){
        if(!isEmpty()){
            return arr[b++];
        }else{
            System.err.println("null");
        }
        return 0;
    }
    public int size(){
            return t;
    }
}
class p7{
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.add(4);
        q.add(1);
        q.add(0);
        q.add(8);
        q.add(5);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}