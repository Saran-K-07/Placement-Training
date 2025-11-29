// https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
import java.util.*;
class p2 {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = arr.length-1;
        int mid = 0;
        int first = -1;
        int last = -1;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==x){
                if((mid>0 && arr[mid-1]!=x) || mid==0){
                    first = mid;
                    break;
                }
                else{
                    j = mid-1;
                }
            }else if(arr[mid]>x){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        i = first;
        if(first==arr.length-1){
            ans.add(first);
            ans.add(first);
            return ans;
        }
        if(i==-1){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        j = arr.length-1;
        mid = 0;
        while(i<=j){
            mid = (i+j)/2;
            if(arr[mid]==x){
                if((mid<arr.length-1 && arr[mid+1]!=x) || mid==arr.length-1){
                    last = mid;
                    break;
                }
                else{
                    i = mid+1;
                }
            }else if(arr[mid]>x){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
    public static void main(String[] args) {
        p2 obj = new p2();
        int[] arr = {1, 2, 3, 3, 3, 4, 5};
        int x = 3;
        ArrayList<Integer> result = obj.find(arr, x);
        System.out.println(result);
    }
}
