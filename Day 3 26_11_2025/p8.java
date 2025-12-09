import java.util.Arrays;

class p8 {
    public static int removeDuplicates(int[] nums) {
       int j = 1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[j]=nums[i];
            j++;
        }
       }
    return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2}; 

        int k = removeDuplicates(nums); 

        System.out.println("k = " + k);
        System.out.println("nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}