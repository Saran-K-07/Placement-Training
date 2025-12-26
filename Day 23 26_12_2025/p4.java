// https://leetcode.com/problems/rotting-oranges/
import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[n][m];
        boolean freshOrange = false;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                }
                if(grid[i][j] == 1){
                    freshOrange = true;
                }
            }
        }
        if(!freshOrange){
            return 0;
        }
        int min = 0;
        while(!q.isEmpty()){
            int size = q.size();  // MISSING LOOP START**
            for(int s = 0; s < size; s++) {
                int i = q.peek()[0];
                int j = q.peek()[1];
                q.poll();
                int[][] child = {{i+1, j}, {i-1, j}, {i, j+1}, {i, j-1}};
                for(int k = 0;k<4;k++){
                    int ci = child[k][0];
                    int cj = child[k][1];
                    if(ci>=0 && ci<n && cj>=0 && cj<m && !visit[ci][cj] && grid[ci][cj] == 1){
                        visit[ci][cj] = true;
                        grid[ci][cj] = 2;
                        q.add(new int[]{ci, cj});
                    }
                }
            }
            min++;
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return min-1;
    }
}

// Driver Code
class p4{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int result = sol.orangesRotting(grid);
        System.out.println(result);
    }
}