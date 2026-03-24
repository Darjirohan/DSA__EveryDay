class Solution {
    public int minimumDifference(int[] nums, int k) {
    Arrays.sort(nums);
    int min_diff = Integer.MAX_VALUE;
    for(int i=0;i<=nums.length - k;i++){
       min_diff = Math.min(min_diff,nums[i+k-1] - nums[i]);
    }    
    return min_diff;
    }
}