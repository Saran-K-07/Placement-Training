// https://www.geeksforgeeks.org/problems/steps-by-knight5927/1
import java.util.*;
class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vist = new boolean[n+1][n+1];
        q.add(new int[]{knightPos[0],knightPos[1]});
        int level = 0;
        while(!q.isEmpty()){
            int s = q.size();
            for(int u =0;u<s;u++){
                int i = q.peek()[0];
                int j = q.poll()[1];
                if(i==targetPos[0]&&j==targetPos[1]){
                    return level;
                }
                int[][] child = {{i+2,j+1},{i+2,j-1},{i+1,j-2},{i-1,j-2},{i-2,j+1},{i-2,j-1},{i+1,j+2},{i-1,j+2}};
                for(int k = 0;k<8;k++){
                    int ci = child[k][0];
                    int cj = child[k][1];
                    if(ci>=0 &&ci<=n &&cj>=0&&cj<=n&&!vist[ci][cj]){
                        vist[ci][cj]=true;
                        q.add(new int[]{ci,cj});
                    }
                }
            }
            level++;
        }
        return -1;
    }
}

//Driver Code
class p3{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] knightPos = {1, 1};
        int[] targetPos = {8, 8};
        int n = 8;
        int steps = sol.minStepToReachTarget(knightPos, targetPos, n);
        System.out.println("Minimum steps: " + steps);
    }
}