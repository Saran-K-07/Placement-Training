// https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1
import java.util.*;
class  p4 {
    public int findMaximum(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int mid = 0;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]>arr[mid-1]){
                if(arr[mid]>arr[mid+1]){
                    return arr[mid];
                }else{
                    i = mid+1;
                }
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        p4 obj = new p4();
        System.out.println(obj.findMaximum(arr));
    }
}