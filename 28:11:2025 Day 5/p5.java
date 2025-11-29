// https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1
class p5 {
    public int findExtra(int a[], int b[]) {
        int i=0;
        int j=a.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(i==j){
                return i;
            }
            if(a[mid]==b[mid]){
                i = mid+1;
            }else if(a[mid]>b[mid] || a[mid]<b[mid]){
                j = mid;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 5};
        p5 obj = new p5();
        int index = obj.findExtra(a, b);
        System.out.println("Extra element at index: " + index);
    }
}