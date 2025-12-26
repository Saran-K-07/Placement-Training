// https://www.geeksforgeeks.org/problems/number-of-enclaves/1

import java.util.*;
class Solution {

    int numberOfEnclaves(int[][] grid) {
        // Your code here
        //storing i,j in queue that are near the boundary
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visit = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i == 0 || i == n-1 || j ==0 || j == m-1){
                    if(grid[i][j] == 1){
                        q.add(new int[]{i, j});
                        visit[i][j] = true;
                    }
                }
            }
        }
        //setting true for 1 that are in border.
        while(!q.isEmpty()){
            int i = q.peek()[0];
            int j = q.peek()[1];
            q.poll();
            int[][] child = {{i+1, j}, {i-1, j}, {i, j+1}, {i, j-1}};
            for(int k = 0;k<4;k++){
                int ci = child[k][0];
                int cj = child[k][1];
                if(ci>=0 && ci<n && cj>=0 && cj<m && !visit[ci][cj] && grid[ci][cj] == 1){
                    visit[ci][cj] = true;
                    q.add(new int[]{ci, cj});
                }
            }
        }
        //counting the 1 which are false.
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(!visit[i][j] && grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}

// Driver Code
class p3{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(obj.numberOfEnclaves(grid));
    }
}