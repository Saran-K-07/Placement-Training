class p12{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        for (int j = 0; j < k; j++) {
            int temp = arr[arr.length-1];
            for(int i = arr.length-1; i > 0; i--) {
                  arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        for(int d:arr){
            System.out.println(d);
        }
    }
}