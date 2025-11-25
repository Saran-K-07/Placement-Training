class p8{
    public static void main(String[] args) {
        int[] arr = {3,1,6,7,8,9,5,3};
        int max = 0;
        int sec_max = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=sec_max && arr[i] < max){
                sec_max = arr[i];
            }
        }
        System.out.println(sec_max);
    }
}