class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int m = score.length;
        int n = score[0].length;

        int[][] mat = new int[m][n];
        Integer[] arr = new Integer[m];
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < m; i++) {
            arr[i] = score[i][k];
            mp.put(arr[i], i);
        }

        Arrays.sort(arr, (a, b) -> b - a);

        for (int i = 0; i < m; i++) {
            int index = mp.get(arr[i]); 

            for (int j = 0; j < n; j++) {
                mat[i][j] = score[index][j];
            }
        }

        return mat;
    }
}