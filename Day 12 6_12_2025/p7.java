class Solution{
    public int totalPath(int i,int j,int m,int n){
        if(i == n || j == m){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        return totalPath(i, j+1, n, m) + totalPath(i+1, j, n, m);
    }
    public int numberOfPaths(int m, int n){
        return totalPath(0,0,m,n);
    }
}

class p7{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.numberOfPaths(3,3));
    }
}