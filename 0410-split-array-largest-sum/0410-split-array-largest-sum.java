class Solution {
    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            int pieces = 1;
            int currSum = 0;

            for (int num : nums) {

                if (currSum + num > mid) {
                    pieces++;
                    currSum = 0;
                }

                currSum += num;
            }

            if (pieces <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}