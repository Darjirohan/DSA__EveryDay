class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
    int[] onerows = new int[grid.length];
    int[] onecols = new int[grid[0].length];
    int[] zerorows = new int[grid.length];
    int[] zerocols = new int[grid[0].length];

    int[][] diff = new int[grid.length][grid[0].length];
    for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]==1){
            onerows[i]++;
            onecols[j]++;
        }else{
           zerorows[i]++;
        zerocols[j]++; 
        }
        
    }    
    }
    for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        diff[i][j] = onerows[i]+onecols[j] - zerorows[i] - zerocols[j];
    }    
    }

    return diff;    
    }
}