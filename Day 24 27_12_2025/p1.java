// https://www.geeksforgeeks.org/problems/topological-sort/1
import java.util.*;

class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vist,int s,Stack<Integer> st){
        vist[s] = true;
        for(int i=0;i<adj.get(s).size();i++){
            if(!vist[adj.get(s).get(i)]){
                dfs(adj,vist,adj.get(s).get(i),st);
            }
        }
        st.push(s);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        boolean[] vist = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(!vist[i]){
                dfs(adj,vist,i,st);
            }
        }
        ArrayList<Integer> tp = new ArrayList<>();
        int i =0;
        while(!st.isEmpty()){
            tp.add(st.pop());
        }
        return tp;
        
    }
}

//Driver Code
public class p1{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int V = 6;
        int[][] edges = {{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}};
        ArrayList<Integer> result = sol.topoSort(V, edges);
        System.out.println(result);
    }
}
