class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;

        char[][] res = new char[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = boxGrid[j][i];
            }
        }
        for(int i=0;i<m;i++){
            int left = 0,right = n-1;

            while(left < right){
            char temp = res[i][left];
            res[i][left] = res[i][right];
             res[i][right] = temp;
            left++;
             right--;
            }
        }
        
    for(int j = 0; j < n; j++){
    int emptyRow = m - 1; 

    for(int i = m - 1; i >= 0; i--){
        if(res[i][j] == '*'){
            emptyRow = i - 1; 
        }
        else if(res[i][j] == '#'){
            char temp = res[i][j];
            res[i][j] = '.';
            res[emptyRow][j] = temp;
            emptyRow--;
        }
    }
    }
        return res;
    }
}