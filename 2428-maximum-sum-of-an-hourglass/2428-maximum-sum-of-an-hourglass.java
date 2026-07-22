class Solution {
    public int maxSum(int[][] grid) {
        
        int maxSum = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
            int sum = grid[i-1][j]+grid[i-1][j-1]+grid[i-1][j+1]+grid[i][j]+grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1];
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}