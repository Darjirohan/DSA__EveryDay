class Solution {
    public int[][] generateMatrix(int n) {
    int[][] spiral = new int[n][n];
    int left=0,right=n-1;
    int top=0,bottom=n-1;
    int count=0;
    while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++){
           count++;
           spiral[top][i]=count;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            count++;
            spiral[i][right]=count;
        }
        right--;
        if(left<=right){
            for(int i=right;i>=left;i--){
                count++;
                spiral[bottom][i]=count;
            }
            bottom--;
        }
        if(top<=right){
            for(int i=bottom;i>=top;i--){
                count++;
                spiral[i][left]=count;
            }
            left++;
        } 
    }
    return spiral;    
    }
}