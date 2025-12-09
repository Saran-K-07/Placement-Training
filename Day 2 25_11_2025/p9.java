class p9{
    public static void main(String[] args) {
        // Time Complexity = O(2n)
        int[] arr = {2,0,1,1,0,1,0,2,2,1,1,0,2,2};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i:arr){
            if(i==0){
            count0++;}
            if(i==1){
            count1++;}
            if(i==2){
            count2++;}
        }
        for (int i = 0; i < arr.length; i++) {
            if(count0!=0){
                arr[i]=0;
                count0--;
                continue;
            }
            if(count1!=0){
                arr[i]=1;
                count1--;
                continue;
            }
            if(count2!=0){
                arr[i]=2;
                count2--;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}