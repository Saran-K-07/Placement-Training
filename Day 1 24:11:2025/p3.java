// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int a = 145;
        int b = 35;
        if((a<100?100-a:a-100)<(b<100?100-b:b-100)){
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }
    }
}