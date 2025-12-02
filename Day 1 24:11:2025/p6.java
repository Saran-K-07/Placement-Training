// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 12864;
        int b = 6;
        a = (int) a/10;
        a *= 10;
        a += b;
        System.out.print(a);
    }
}