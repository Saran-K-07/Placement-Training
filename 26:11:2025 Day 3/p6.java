import java.util.*;
class p6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int i = 0;
        while(i<arr.length && arr[i]!=0){
            i++;
        }
        int j=i+1;
        for(;j<arr.length;j++){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        System.err.println(Arrays.toString(arr));
    }
}