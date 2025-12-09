import java.util.*;
class p7 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int[] temp = new int[2];
        temp[0] = intervals[0][0];
        temp[1] = intervals[0][1];
        ArrayList<int[]> ar = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(temp[1]>= intervals[i][0]){
                temp[1] = Math.max(temp[1],intervals[i][1]);
            }
            else{
                ar.add(temp);
                temp = intervals[i];
            }
        }
        ar.add(temp);
        int arr[][] = new int[ar.size()][2];
        for(int i=0;i<ar.size();i++){
            arr[i][0] = ar.get(i)[0];
            arr[i][1] = ar.get(i)[1];
        }
        System.out.println(Arrays.deepToString(arr));
    }
}