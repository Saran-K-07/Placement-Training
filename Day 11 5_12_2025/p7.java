import java.util.*;
class p7{
    public static int maxArray(int[] arr,int max,int n){
        if(n!=0){
            return max;
        }
        if(max<arr[n-1]){
            max = arr[n-1];
        }
        return maxArray(arr, max, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,7,9,0,4,3,1,7,0};
        maxArray(arr,Integer.MAX_VALUE,arr.length);
    }
}