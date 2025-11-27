class p1{
    public static void main(String[] args) {
        int[] arr = {2,3,8,1};
        int i = 0;
        while(i<arr.length){
            int j = i;
            while(j<arr.length){
                int k = i;
                while(k<=j){
                    System.out.print(arr[k]);
                    k++;
                }
                System.out.println();
                j++;
            }
            System.out.println();
            i++;
        }
    }
}