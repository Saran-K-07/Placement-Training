class p3{
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                System.out.println(i+1);
                System.out.println(j+1);
                break;
            }
            else if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
        }
    }
}