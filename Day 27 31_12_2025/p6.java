    // https://www.geeksforgeeks.org/problems/finding-the-numbers0215/1
    class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        int setBitp = 0;
        while(xor != 0){
            if((xor&1) == 1){
                break;
            }
            xor = xor>>1;
            setBitp++;
        }
        int group0 = 0;
        int group1 = 0;
        for(int i = 0;i<arr.length; i++){
            if((arr[i] & (1<<setBitp)) != 0){
                group1 = group1^arr[i];
            }else{
                group0 = group0^arr[i];
            }
        }
        if(group1 < group0){
            return new int[]{group1, group0};
        }else{
            return new int[]{group0, group1}; 
        }
    }
}

// Driver Code
class p6{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 1, 3, 2, 5};
        int[] result = sol.singleNum(arr);
        System.out.println(result[0] + " " + result[1]);
    }
}