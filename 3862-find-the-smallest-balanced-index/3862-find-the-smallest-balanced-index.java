class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;

        long[] suffixProduct = new long[n];
        suffixProduct[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            if (suffixProduct[i + 1] > Long.MAX_VALUE / nums[i + 1]) {
                suffixProduct[i] = Long.MAX_VALUE;
            } else {
                suffixProduct[i] = suffixProduct[i + 1] * nums[i + 1];
            }
        }

        long leftSum = 0;

        for (int i = 0; i < n; i++) {

            if (leftSum == suffixProduct[i]) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}