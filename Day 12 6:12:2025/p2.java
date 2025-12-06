class p2{
    public static int linearSearch(int[] arr, int n,int key){
        if(n == 0){
            return -1;
        }
        int k = linearSearch(arr, n-1, key);
        if(arr[n-1]==key){
            return n-1;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,12,15,17,20,21,22,25,28,31};
        System.out.println(linearSearch(arr,arr.length-1, 20));
    }
}