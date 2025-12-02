class p3{
    public static void main(String[] args) {
        int n=101101;
        int d = 1;
        int ans = 0;
        while(n!=0){
            ans += (n%10)*d;
            n /= 10;
            d *= 2;            
        }
        System.out.println(ans);
    }
}