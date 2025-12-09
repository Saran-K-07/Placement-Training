class p5{
    public static void main(String[] args) {
        int[] arr = {1,5,6,7,2};
        int count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        if(count>2){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}