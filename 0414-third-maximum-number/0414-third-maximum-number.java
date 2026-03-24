class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer max1 = null;
        Integer max2 = null;

        for (int i : nums) {
            if ((max != null && i == max) ||
                (max1 != null && i == max1) ||
                (max2 != null && i == max2)) {
                continue;
            }

            if (max == null || i > max) {
                max2 = max1;
                max1 = max;
                max = i;
            } else if (max1 == null || i > max1) {
                max2 = max1;
                max1 = i;
            } else if (max2 == null || i > max2) {
                max2 = i;
            }
        }

        return max2 == null ? max : max2;
    }
}