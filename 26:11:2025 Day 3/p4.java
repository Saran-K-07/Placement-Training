import java.util.*;
class p4 {
    // Function to find common elements in three arrays.
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        int i=0,j=0,k=0;
        int recentAdded = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                if(!(arr2[j] == recentAdded)){
                    res.add(arr3[k]);
                    recentAdded = arr3[k];
                }
                i++;j++;k++;
            }else{
                int smallest = Math.min(arr1[i],Math.min(arr2[j],arr3[k]));
                if(smallest == arr1[i]){
                    i++;
                }else if(smallest == arr2[j]){
                    j++;
                }else{
                    k++;
                }
            }
        }
        if(res.size()==0){
            res.add(-1);
        }
        System.out.println(res);
        
    }
}