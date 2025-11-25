import java.util.*;
class p6{
    public static void main(String[] args) {
        int n = 100;
        int arr[][] = new int[(2*n)-1][(2*n)-1];
        int a = n-1;
        int b = n-1;
        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                int c = Math.max(Math.abs(a-i), Math.abs(b-j));
                arr[i][j] = c+1;
            }
        }
        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}