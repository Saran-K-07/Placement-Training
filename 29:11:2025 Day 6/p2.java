// https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
import java.util.*;
class p2 {
    public static void mergeArrays(int a[], int b[]) {
        int i = a.length-1;
        int j = 0;
        while(i>=0 && j<b.length){
            if(a[i]>b[j]){
                int temp = a[i];
                a[i] = b[j];
                        b[j] = temp;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        mergeArrays(a, b);
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
    }
}
