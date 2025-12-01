import java.util.*;
class p1{
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6};
        int[] b = {1,2,4,9,11,13,18,19};
        ArrayList<Integer> c = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length || j<b.length){
            if(i==a.length){
                c.add(b[j]);
                j++;
                continue;
            }
            if(j==b.length){
                c.add(a[i]);
                i++;
                continue;
            }
            if(a[i]==b[j]){
                c.add(a[i]);
                i++;¡
            }else if(a[i]<b[j]){
                c.add(a[i]);
                i++
            }else{
                c.add(b[j]);
                j++;
            }
        }
        for(int d:c) {
            System.out.println(d);
        }
    }
}