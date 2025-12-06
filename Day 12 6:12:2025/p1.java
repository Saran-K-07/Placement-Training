class p1{
    public static int binarySearch(int[] arr, int i,int j,int key){
        if(i>j){
            return -1;
        }
        int mid = (i+j)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<key){
            return binarySearch(arr, mid+1, j, key);
        }else{
            return binarySearch(arr, i, mid-1, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,12,15,17,20,21,22,25,28,31};
        System.out.println(binarySearch(arr, 0, arr.length-1, 20));
    }
}