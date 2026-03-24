class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int val=0;
    int row=matrix.length;
    int col=matrix[0].length;
    if(row==0){
        return false;
    }
    if(row==1 && col==1){
        return matrix[0][0]==target;
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
           
           if(matrix[i][j]==target){
            val=1;
            break;
           }
        }
    }
    if(val==0){
        return false;
    }
    return true;
    }
}