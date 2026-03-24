class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int row1 = x, row2 = x + k - 1; row1 < row2; row1++, row2--){
            for (int j = y; j < y + k; j++) {
                int temp = grid[row1][j];
                grid[row1][j] = grid[row2][j];
                grid[row2][j] = temp;
            }
        }

        return grid;
    }
}