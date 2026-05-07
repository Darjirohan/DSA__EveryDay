class Solution {
    public int minimumArea(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int maxRow = 0,maxCol = 0;
        int minRow = m-1,minCol = n-1;
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            if(grid[i][j] == 1){
                maxRow = Math.max(maxRow,i);
                maxCol = Math.max(maxCol,j);
                minRow = Math.min(minRow,i);
                minCol = Math.min(minCol,j);
            }

            }
        }
    return (maxRow - minRow + 1)*(maxCol - minCol + 1);
    }
}