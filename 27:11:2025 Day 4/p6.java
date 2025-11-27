// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
class p6 {
    public int maxSubarraySum(int[] arr, int k) {
        int max = 0;
        int sum = 0;
        int i = 0;
        int j = k-1;
        for(int a = i;a<=j;a++){
            sum += arr[a];
        }
        max = sum;
        while((j+1)<arr.length){
            sum = sum-arr[i]+arr[j+1];
            i++;j++;
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        p6 obj = new p6();
        int result = obj.maxSubarraySum(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}