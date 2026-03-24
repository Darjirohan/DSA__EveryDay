import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] flat = new int[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flat[index++] = matrix[i][j];
            }
        }
        Arrays.sort(flat);
        return flat[k - 1];
    }
}
