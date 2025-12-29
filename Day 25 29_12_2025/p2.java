// https://leetcode.com/problems/shortest-path-in-binary-matrix/
import java.util.*;
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]==1){
            return -1;
        }
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vist = new boolean[n][m];
        q.add(new int[]{0,0});
        int level = 0;
        while(!q.isEmpty()){
            int s = q.size();
            for(int u =0;u<s;u++){
                int i = q.peek()[0];
                int j = q.poll()[1];
                if(i==n-1&&j==n-1){
                    return level+1;
                }
                int[][] child = {{i+1,j},{i-1,j},{i,j+1},{i,j-1},{i+1,j+1},{i-1,j-1},{i+1,j-1},{i-1,j+1}};
                for(int k = 0;k<8;k++){
                    int ci = child[k][0];
                    int cj = child[k][1];
                    if(ci>=0 &&ci<n &&cj>=0&&cj<m&&!vist[ci][cj]&&grid[ci][cj]==0){
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
class p2{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {
            {0, 1},
            {1, 0}
        };
        int result = sol.shortestPathBinaryMatrix(grid);
        System.out.println("Shortest path length: " + result);
    }
}