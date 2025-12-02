// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 52;
        int arr[] = new int[32];
        int d = 0;
        while(n!=1){
            arr[d] = n%2;
            n/=2;
            d+=1;
        }
        arr[d] = 1;
        for(int i=d;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}