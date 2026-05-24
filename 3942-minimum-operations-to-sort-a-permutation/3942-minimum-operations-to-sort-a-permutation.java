class Solution {
    public int minOperations(int[] nums) {
                int n = nums.length;
        if (n == 1) {
            return 0;
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                pos = i;
                break;
            }
        }

        int ans = Integer.MAX_VALUE;

        boolean isInc = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] != (i - pos + n) % n) {
                isInc = false;
                break;
            }
        }
        if (isInc) {
            ans = pos;
            if (pos > 0) {
                ans = Math.min(ans, n - pos + 2);
            }
        }

        boolean isDec = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] != (pos - i + n) % n) {
                isDec = false;
                break;
            }
        }
        if (isDec) {
            ans = Math.min(ans, pos + 2);
            ans = Math.min(ans, n - pos);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}