class p5 {
   public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    int profit = 0;
    int n = prices.length;
    int min = prices[0];
    for(int i=0;i<n;i++){
        profit = Math.max(profit,prices[i]-min);
        min = Math.min(min,prices[i]);
    }
    System.out.println(profit);
    }
}