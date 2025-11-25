// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 12864;
        int b = 6;
        int digit = (int) Math.log10(a);
        int num1 = a % (int) Math.pow(10,digit);
        int num2 = b * (int) Math.pow(10,digit);
        int num = num1+num2;
        System.out.print(num);
    }
}