// https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class p5 {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int Sum = 0;
        for(int i=0;i<arr.length;i++){
            Sum += arr[i];
            if(Sum>maxSum){
                maxSum = Sum;
            }
            if(Sum<0){
                Sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        p5 obj = new p5();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = obj.maxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + result);
    }
}
