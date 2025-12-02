// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 1234;
        int d = (int)Math.log10(n);
        for(int i=n;i!=0;i/=10){
            System.out.print(i%10);
        }
    }
}