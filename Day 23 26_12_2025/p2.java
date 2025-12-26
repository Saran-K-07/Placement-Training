// https://www.geeksforgeeks.org/problems/is-it-a-tree/1
import java.util.*;
class Solution {
    public boolean detectCycleDfs(ArrayList<ArrayList<Integer>> adj, boolean[] vist,int node, int parent){
        vist[node] = true;
        for(int i=0;i<adj.get(node).size();i++){
                int child = adj.get(node).get(i);
                if(!vist[child]){
                    if(detectCycleDfs(adj,vist,child,node)){
                        return true;
                    }
                }else if(child!=parent){
                    return true;
                }
            }
            return false;
    }
    
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        if(m!=n-1)
        return false;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++){
            if(edges.get(i).get(1) == edges.get(i).get(0)){
                return false;
            }
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }
        boolean[] vist = new boolean[n];
        if(detectCycleDfs(adj,vist,0,-1)){
            return false;
        }
        for(int i=0;i<n;i++){
            if(vist[i]==false){
                return false;
            }
        }
        return true;
    }
}

//Driver Code
class p2{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int m = 4;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(0, 2)));
        edges.add(new ArrayList<>(Arrays.asList(1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(1, 4)));
        System.out.println(sol.isTree(n, m, edges)); // Should print true

        n = 4;
        m = 3;
        edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1)));
        edges.add(new ArrayList<>(Arrays.asList(1, 2)));
        edges.add(new ArrayList<>(Arrays.asList(2, 0)));
        System.out.println(sol.isTree(n, m, edges)); // Should print false (cycle)
    }
}