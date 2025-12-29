import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
    public static int bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vist, int[] parent, int s , int d){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        int lev = 0;
        while (!q.isEmpty()) {
            int siz = q.size();
            for(int i = 0;i<siz;i++){
                int temp = q.poll();
                if(d == temp){
                    return lev;
                }
                for(int j = 0;j<adj.get(temp).size();j++){
                    int child = adj.get(temp).get(j);
                    if(!vist[child]){
                        vist[child] = true;
                        parent[child] = temp;
                        q.add(child);
                    }
                }
            }
            lev++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 10;
        int[][] edges = {{0, 2}, {0, 4}, {0, 5}, {1, 4}, {1, 5}, {2, 3}, {2, 4}, {4, 5}, {8, 9}, {9, 5}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        } 
        for(int i = 0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vist = new boolean[n];
        Arrays.fill(vist, false);
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        int ans = bfs(adj, vist, parent, 8, 0);
        int i = 0;
        System.out.print(0 +"  ");
        while(true){
            System.out.print(parent[i] + "  ");
            i = parent[i];
            if(i == 8){
                break;
            }
        }
    }
}