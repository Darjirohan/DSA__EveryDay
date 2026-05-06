class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int[] rowMax = new int[n];  
      int[] colMax = new int[m];  

      for(int i=0;i<n;i++){
        int max = 0;
        for(int j = 0;j<m;j++){
            max = Math.max(max,grid[i][j]);
        }
        rowMax[i] = max;
      }
      for(int i=0;i<m;i++){
        int max = 0;
        for(int j = 0;j<n;j++){
            max = Math.max(max,grid[j][i]);
        }
        colMax[i] = max;
      }
      int sum = 0;

      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            sum += (Math.min(rowMax[i],colMax[j]) - grid[i][j]);
        }
      }

      return sum;
    }
}