// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int a = 3285;
        int rev = 0;
        while(a!=0){
            rev += a%10;
            rev *= 10;
            a = (int) a/10;
        }
        System.out.print((int)rev/10);
    }
}