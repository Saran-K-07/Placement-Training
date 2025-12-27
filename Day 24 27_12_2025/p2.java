// https://leetcode.com/problems/course-schedule/
import java.util.*;
class Solution {

    public boolean detectCycle(ArrayList<ArrayList<Integer>> adj, boolean[] visit, boolean[] visitOneDirection, int s) {
        visit[s] = true;
        visitOneDirection[s] = true;
        for (int i = 0; i < adj.get(s).size(); i++) {
            int child = adj.get(s).get(i);
            if (!visit[child]) {
                if (detectCycle(adj, visit, visitOneDirection, child)) {
                    return true;
                }
            } else if (visitOneDirection[child]) {
                return true;
            }
        }
        visitOneDirection[s] = false;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        boolean[] visit = new boolean[numCourses];
        boolean[] visitOneDirection = new boolean[numCourses];

        // Iterate through all vertices and check each unvisited one :
        for (int i = 0; i < numCourses; i++) {
            if (!visit[i]) {
                if (detectCycle(adj, visit, visitOneDirection, i)) {
                    return false;
                }
            }
        }
        return true;
    }
}

//Driver Code
class p2{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(sol.canFinish(numCourses1, prerequisites1)); // true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println(sol.canFinish(numCourses2, prerequisites2)); // false
    }
}