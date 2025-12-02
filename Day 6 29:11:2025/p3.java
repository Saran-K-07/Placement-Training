public class p3 {
public static void merge(int[] arr, int i,int mid, int j){
    int n = mid-i + 1;
    int m = j-(mid+1) + 1; // j - mid;
    int[] a = new int[n];
    int[] b = new int[m];
    int p = 0;
    for(int z = i;z<=mid;z++){
      a[p++] = arr[z];
    }
    p = 0;
    for(int z = mid+1;z<=j;z++){
      b[p++] = arr[z];
    }
    p = i;//  iterator for arr
    int f = 0,g = 0;//  pointer pointing to a and b
    while(f<n && g<m){
      if(a[f]<b[g]){
        arr[p++] = a[f++];
      }else{
        arr[p++] = b[g++];
      }
    }
    while(f<n){
      arr[p++] = a[f++];
    }
    while(g<m){
      arr[p++] = b[g++];
    }
}
  public static void mergeSort(int[] arr, int i, int j){
    if(i<j){
      int mid = (i+j)/2;
      mergeSort(arr, i, mid); // left part
      mergeSort(arr, mid+1, j); // right part
      merge(arr,i,mid,j);// this array has two arrays
      // (i --- mid,   mid+1 --- j), merge left and right part
    }
  }
    public static void main(String args[]){
       int[] a = {5,3,1,7,9,0,12,10,14,16,13,8,2,20,19};
       mergeSort(a, 0, a.length-1);
       for(int i:a){
        System.out.print(i + " ");
       }
       
    }
}