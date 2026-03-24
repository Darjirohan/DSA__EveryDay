class Solution {
    public int[][] diagonalSort(int[][] mat) {
    int row = mat.length;
    int col = mat[0].length;
    Map<Integer,PriorityQueue<Integer>> mp = new HashMap<>();
    for(int i = 0;i<row;i++){
        for(int j=0;j<col;j++){
        int key = j - i;
        mp.putIfAbsent(key,new PriorityQueue<Integer>());
        mp.get(key).offer(mat[i][j]);
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            int key = j - i;
            mat[i][j] = mp.get(key).poll();
        }
    }
    return mat;
    }
}