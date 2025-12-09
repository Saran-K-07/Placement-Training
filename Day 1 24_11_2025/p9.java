// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 42522;
        int check = 2;
        int rep = 6;
        int ans = 0;
        int mul = 1;
        while(a!=0){
            int num = a%10;
            a = (int) a/10;
            if(num==check){
                num = rep;
            }
            ans = ans + num*mul;
            mul = mul*10;
        }
        System.out.print(ans);
    }
}