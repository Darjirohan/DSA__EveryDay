class Solution {
    public boolean isValidSudoku(char[][] board) {
    int n = board.length;
    for(int i=0;i<n;i++){
        int[] arr = new int[10];
        for(int j=0;j<n;j++){
            if(board[i][j]=='.') continue;
            int num = board[i][j] - '0';
            if(arr[num]==1)return false;
            arr[num]++;
        }
    }
    for(int j=0;j<n;j++){
        int[] arr = new int[10];
        for(int i=0;i<n;i++){
            if(board[i][j]=='.') continue;
            int num = board[i][j] - '0';
            if(arr[num]==1)return false;
            arr[num]++;
        }
    }
    for (int boxRow = 0; boxRow < 3; boxRow++) {
    for (int boxCol = 0; boxCol < 3; boxCol++) {
        int[] arr = new int[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[boxRow*3 + i][boxCol*3 + j];
                if(c == '.') continue;
                int num = c - '0';
                arr[num]++;
                if(arr[num] > 1) return false;
            }
        }
    }
}


    return true;  
    }
}