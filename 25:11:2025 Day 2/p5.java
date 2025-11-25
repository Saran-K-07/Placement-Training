import java.util.*;
public class p5 {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int num = 10;
        for(int i=0;i<num;i++){
            if(i==0){
                System.out.print(a);
                continue;
            }
            if(i==1){
                System.out.print(b);
                continue;
            }
            int c = a+b;
            System.out.print(c);
            a = b;
            b = c;
        }
    }
}
