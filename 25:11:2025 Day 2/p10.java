class p9{
    public static void main(String[] args) {
        // Time Complexity = O(n)
        int[] arr = {2,0,1,1,0,1,0,2,2,1,1,0,2,2};
        int i = 0;
        int j = arr.length-1;
        int k = 0;
        while(k<=j){
            if(arr[k]==0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
                i++;
            }else if(arr[k]==2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j--;
            }else{
                k++;
            }
        }
        for(int d:arr){
            System.out.println(d);
        }
    }
}