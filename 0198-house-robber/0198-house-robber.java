class Solution {
    public int rob(int[] nums) {
    if(nums.length == 0) return 0;
    if(nums.length == 1) return nums[0];
    int rob = 0,skip = 0;

    for(int num:nums){
    int newrob = skip + num;
    skip = Math.max(skip,rob);
    rob = newrob;
    }
    return Math.max(skip,rob);  
    }
}