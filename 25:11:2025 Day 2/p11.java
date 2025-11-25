class p11{
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,7};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int d:arr){
            System.out.println(d);
        }
    }
}