class Pair{
    int row;
    int col;
    Pair(int r,int c){
        this.row = r;
        this.col = c;
    }
}
class Solution {
    private void bfs(int row,int col,boolean[][] visited,char[][] grid){
        visited[row][col] = true;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
        int curRow = q.peek().row;
        int curCol = q.peek().col;

        q.remove();
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {

            int newR = curRow + delRow[i];
            int newC = curCol + delCol[i];

            if (newR >= 0 && newR < m &&
                newC >= 0 && newC < n &&
                    !visited[newR][newC] &&
                    grid[newR][newC] == '1') {

                    visited[newR][newC] = true;

                    q.add(new Pair(newR, newC));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    bfs(i,j,visited,grid);
                }
            }
        }
        return count;
    }
}