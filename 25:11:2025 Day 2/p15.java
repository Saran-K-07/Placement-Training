class p15{
    public static void reverseArray(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;
        int n = arr.length;
        k = k%n;
            reverseArray(arr,0,n-k-1);
            reverseArray(arr,n-k,n-1);
            reverseArray(arr,0,n-1);
        for(int d:arr){
            System.out.println(d);
        }
    }
}