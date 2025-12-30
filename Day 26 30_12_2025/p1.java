// https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1
import java.util.*;
class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist,100000000);
        dist[src] = 0;
        for(int j=1;j<=V;j++){
            for(int i=0;i<edges.length;i++){
                int v = edges[i][0];
                int u = edges[i][1];
                int wt = edges[i][2];
                if(dist[v] != 100000000 && dist[v]+wt<dist[u]){
                    if(j==V){
                        return new int[]{-1};
                    }
                    dist[u] = dist[v] + wt;
                }
            }
        }
        return  dist;
    }
}

// Driver Code
class p1{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int V = 5;
        int[][] edges = {{0,1,5},{0,2,3},{1,2,2},{1,3,6},{2,3,7},{2,4,4},{3,4,-1}};
        int src = 0;
        int[] result = sol.bellmanFord(V, edges, src);
        if(result.length == 1 && result[0] == -1){
            System.out.println("Negative cycle detected");
        }else{
            for(int i=0; i<V; i++){
                System.out.println("Distance from " + src + " to " + i + " is " + result[i]);
            }
        }
    }
}