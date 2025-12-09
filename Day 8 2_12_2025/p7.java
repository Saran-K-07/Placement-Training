// https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;

class p7{
    public static void main(String[] args) {
        int arr[] = {-4,-2,1,3,5};
        int arr1[] = new int[arr.length];
        int i =0;
        int count = 0;
        int j=arr.length-1; 
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                arr1[count++] = arr[i]*arr[i++];
            }else if(Math.abs(arr[i])<Math.abs(arr[j])){
                arr1[count++] = arr[j]*arr[j--];
            }else{
                arr1[count++] = arr[i]*arr[i++]; 
            }
        }
        for(int k=0; k<arr1.length/2; k++){
            int temp = arr1[k];
            arr1[k] = arr1[arr1.length-1-k];
            arr1[arr1.length-1-k] = temp;
        }
        System.out.print(Arrays.toString(arr1));
    }
}