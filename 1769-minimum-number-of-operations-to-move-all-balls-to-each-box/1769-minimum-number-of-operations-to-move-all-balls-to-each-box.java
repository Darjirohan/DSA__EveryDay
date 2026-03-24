class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ballsfront = new int[n];
        int[] ballsback = new int[n];
        int[] res = new int[n];

        int balls = 0;

        for (int i = 0; i < n; i++) {
            ballsfront[i] = (i == 0 ? 0 : ballsfront[i - 1]) + balls;
            if (boxes.charAt(i) == '1') balls++;
        }

        balls = 0;

        for (int i = n - 1; i >= 0; i--) {
            ballsback[i] = (i == n - 1 ? 0 : ballsback[i + 1]) + balls;
            if (boxes.charAt(i) == '1') balls++;
        }

        for (int i = 0; i < n; i++) {
            res[i] = ballsfront[i] + ballsback[i];
        }

        return res;
    }
}
