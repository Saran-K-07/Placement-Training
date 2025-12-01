class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0,leftsum=0;
        for(int val:arr){
            sum+=val;
        }
        for(int i=0;i<arr.length;i++){
            sum-=arr[i];
            if(leftsum==sum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int result = findEquilibrium(arr);
        System.out.println("Equilibrium point index: " + result);
    }
}
