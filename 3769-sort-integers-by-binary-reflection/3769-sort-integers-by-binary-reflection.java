class Solution {
    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = (rev << 1) | (num & 1);
            num >>= 1;
        }
        return rev;
    }

    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = reverse(nums[i]);
            arr[i][1] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i][1];
        }

        return ans;
    }
}
