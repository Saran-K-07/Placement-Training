import java.util.*;
class na{
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;
        int len = (int) Math.log10(num)+1;
        for (int i = 0;i<len;i++) {
            int temp = num;
            temp = (int)(temp % Math.pow(10, len-i));
            for(int j=i;j<len;j++){
                sum += temp%10;
                temp /= 10;
            }
            
        }
        System.out.println(sum);
}
}