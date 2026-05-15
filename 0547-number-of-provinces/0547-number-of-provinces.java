class Solution {

    private void dfs(int city, List<List<Integer>> adj, boolean[] visited) {

        visited[city] = true;
        for (int i : adj.get(city)) {
            if (!visited[i]) {
            dfs(i, adj, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
        adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                ans++;
                dfs(i, adj, visited);
            }
        }

        return ans;
    }
}