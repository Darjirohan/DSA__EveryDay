class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums) {
            Arrays.sort(row);
        }

        int ans = 0;
        int cols = nums[0].length;

        for (int j = cols - 1; j >= 0; j--) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }
            ans += max;
        }
        return ans;
    }
}
