import java.util.*;
class p6{
    public static void printArray(int[] arr,int n){
        if(n!=0){
            printArray(arr,n-1);
            System.out.print(arr[n-1]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,7,9,0,4,3,1,7,0};
        printArray(arr,arr.length);
    }
}