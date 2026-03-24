class Solution {
    public int finalElement(int[] nums) {
    if(nums.length == 1) return nums[0];

    int len = nums.length - 1;
    return Math.max(nums[0],nums[len]);
    }
}