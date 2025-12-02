// https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
class p1 {
    public int binarysearch(int[] arr, int k) {
        int i = 0;
        int j = arr.length-1;
        int mid = 0;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==k){
                if((mid-1)>=0 && arr[mid-1]==k){
                    j = mid;
                }
                else{
                    return mid;
                }
            }else if(arr[mid]>k){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};
        int k = 2;
        p1 obj = new p1();
        int result = obj.binarysearch(arr, k);
        System.out.println(result);
    }
}