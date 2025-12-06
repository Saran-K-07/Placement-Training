public class p6{
    static void towerOfHanoi(int n,String s,String h,String d){
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1, s, h, d);
        System.out.println("Move a disc from "+s+" to "+d);
        towerOfHanoi(n-1, h, d, s);
    }
    public static void main(String[] args) {
        towerOfHanoi(2,"Rod 1", "Rod 2", "Rod 3");
    }
}