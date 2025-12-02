class p2{
    public static void main(String[] args) {
        int[] arr = {2,3,8,1};
        int sum = 10;
        int i = 0;
        boolean ans = false;
        while(i<arr.length){
            int j = i;
            while(j<arr.length){
                int k = i;
                int d = 0;
                while(k<=j){
                    d += arr[k];
                    k++;
                }
                if(d==sum){
                    ans = true;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println(ans);
    }
}