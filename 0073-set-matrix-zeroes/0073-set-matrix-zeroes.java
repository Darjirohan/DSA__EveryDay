import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
    int row=matrix.length;
    int col=matrix[0].length;
    List <int[]> index = new ArrayList<>();

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(matrix[i][j]==0){
            int arr[]=new int[2];
            arr[0]=i;
            arr[1]=j;
            index.add(arr);
            }
        }
    }
    for(int[] pair : index){ 
        
        int row1=pair[0];
        int col1=pair[1];
        for(int i=0;i<row;i++){
        matrix[i][col1]=0;    
        }
        for(int j=0;j<col;j++){
        matrix[row1][j]=0;    
        }
    } 
    }
}
