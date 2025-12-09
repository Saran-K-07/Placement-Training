class p13{
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,7};
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
              arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        for(int d:arr){
            System.out.println(d);
        }
    }
}