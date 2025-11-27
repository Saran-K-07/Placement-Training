// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
import java.util.*;
class p7 {
    ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = arr.length;
        long nSum = (long)n*(n+1)/2;
        long nSquareSum = (long)n*(n+1)*(2*n+1)/6;
        long arrSum = 0,arrSquareSum=0;
        for(int i=0;i<n;i++){
            arrSum += (long)arr[i];
            arrSquareSum += (long)arr[i]*arr[i];
        }
        int eq1 = (int)(arrSum-nSum);
        int eq2 = (int)(arrSquareSum-nSquareSum);
        eq2 = eq2/eq1;
        int d = (eq1+eq2)/2;
        int m = eq2-d;
        a.add(d);
        a.add(m);
        return a;
    }
    public static void main(String[] args) {
        p7 obj = new p7();
        int[] arr = {1, 2, 2, 4, 5}; // Example: n=5, repeating 2, missing 3
        ArrayList<Integer> result = obj.findTwoElement(arr);
        System.out.println("Repeating: " + result.get(0) + ", Missing: " + result.get(1));
    }
}
