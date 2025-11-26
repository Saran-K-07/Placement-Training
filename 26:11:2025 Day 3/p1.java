class p1{
    public static void main(String[] args) {
        int[] arr = {1};
        for (int i = 1; i <= arr.length+1; i++) {
            int check = 0;
            for(int j:arr){
                if(i==j){
                    check = 1;
                    break;
                }
            }
            if(check==0){
                System.out.println(i);
            }
        }
    }
}