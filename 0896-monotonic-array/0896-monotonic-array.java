class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) return true; 

        int sign = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            if (diff != 0) { 
                if (sign == 0) {
                    sign = (diff > 0) ? 1 : -1; 
                } else if ((diff > 0 && sign == -1) || (diff < 0 && sign == 1)) {
                    return false; 
                }
            }
        }

        return true;
    }
}
