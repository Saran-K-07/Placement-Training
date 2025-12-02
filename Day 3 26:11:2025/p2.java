class p2{
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        long n = arr.length+1;
        long res = (n*(n+1))/2;
        long sum = 0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println((int)(res-sum));
    }
}