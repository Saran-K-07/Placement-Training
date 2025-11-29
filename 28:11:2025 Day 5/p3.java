// https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
class p3 {
    int search(int[] arr, int key) {
        int i = 0;
        int j = arr.length-1;
        int mid = 0;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<=arr[j]){
                if(key>arr[mid] && key<=arr[j]){ 
                    i = mid+1;
                }else{
                    j = mid-1;
                }
            }else if(arr[i]<=arr[mid]){ 
                if(key>=arr[i] && key<arr[mid]){ 
                    j = mid-1;
                } else{
                    i = mid+1;
                } 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        p3 obj = new p3();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;
        int result = obj.search(arr, key);
        System.out.println(result);
    }
}