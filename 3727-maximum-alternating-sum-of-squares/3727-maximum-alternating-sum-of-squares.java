class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] square = new long[n];

        for (int i = 0; i < n; i++) {
            square[i] = 1L * nums[i] * nums[i];
        }

        Arrays.sort(square);

        int negCount = n / 2;          
        int posCount = n - negCount;   

        long sum = 0;

        for (int i = n - 1; i >= negCount; i--) {
            sum += square[i];
        }

        for (int i = 0; i < negCount; i++) {
            sum -= square[i];
        }

        return sum;
    }
}