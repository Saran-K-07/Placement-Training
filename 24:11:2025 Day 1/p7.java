// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int a = 12864;
        int b = a%10; 
        int digit = (int) Math.log10(a);
        int c = (int) ( a / Math.pow(10,digit));
        int num1 = a % (int) Math.pow(10,digit);
        int num2 = b * (int) Math.pow(10,digit);
        int num = num1+num2;
        num = (int) num/10;
        num *= 10;
        num += c;
        System.out.print(num);
    }
}