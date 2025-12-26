// https://leetcode.com/problems/count-the-number-of-complete-components/
import java.util.*;
class Solution {
    public boolean bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vist, int s){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vist[s] = true;
        int v = 0;
        int e = 0;
        while(!q.isEmpty()){
            int temp = q.poll();
            v++;
            e += adj.get(temp).size();
            for(int i = 0;i<adj.get(temp).size();i++){
                if(!vist[adj.get(temp).get(i)]){
                    vist[adj.get(temp).get(i)] = true;
                    q.add(adj.get(temp).get(i));
                }
            }
        }
        e = e/2;
        return (e == (int)v*(v-1)/2);
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vist = new boolean[n];
        int answer = 0;
        for(int i=0;i<n;i++){
            if(!vist[i]){
                if(bfs(adj, vist, i)){
                    answer++;
                }
            }
        }
        return answer;
    }
}

//Driver Code
class p1{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int[][] edges = {{0,1},{0,2},{1,2},{3,4}};
        int result = sol.countCompleteComponents(n, edges);
        System.out.println(result);
    }
}